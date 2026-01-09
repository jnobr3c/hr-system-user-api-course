package br.com.josenobre.payrollapi.resources;

import br.com.josenobre.payrollapi.domain.Payroll;
import br.com.josenobre.payrollapi.domain.User;
import br.com.josenobre.payrollapi.feignClients.UserFeign;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value ="/api/payments")
public class PayrollResource {

    private final UserFeign userFeign;

    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Payroll> getPaymentl(@PathVariable Long workerId, @RequestBody Payroll payment) {
        User user = userFeign.findById(workerId).getBody();

        return ResponseEntity.ok().body(
                new Payroll(
                        user.getName(), //precisara realizar um tratamento no caso de vir nulo o campo
                        payment.getDescription(),
                        user.getHourlyPrice(),
                        payment.getWorkedHours(),
                        user.getHourlyPrice() * payment.getWorkedHours())
        );
    }
}
