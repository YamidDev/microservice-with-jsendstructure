package com.learn.models.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "persona")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "telefono")
    private String telephone;

    @Column(name = "domicilio")
    private String adress;

    @Column(name = "fecha_nac")
    private Date dateBirth;

    @Column(name = "correo")
    private String email;

    @Column(name = "genero")
    private String gender;

}
