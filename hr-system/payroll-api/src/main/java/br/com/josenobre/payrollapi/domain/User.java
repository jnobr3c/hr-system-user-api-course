package br.com.josenobre.payrollapi.domain;

import lombok.*;

@Getter @Setter //Lombock elimina o código getter e setter e abaixo add um construtor com parametro e sem parametros
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;
    private String name;
    private String email;
    private String password;
    private Double hourlyPrice;

}
