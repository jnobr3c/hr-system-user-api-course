package br.com.josenobre.userapi.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;
import static lombok.EqualsAndHashCode.Include;

@Getter @Setter //Lombock elimina o código getter e setter e abaixo add um construtor com parametro e sem parametros
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true) // só irá incluir o que for explicitado
@Entity(name = "TB_USER")
public class User {

    @Include
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private Double hourlyPrice;

}
