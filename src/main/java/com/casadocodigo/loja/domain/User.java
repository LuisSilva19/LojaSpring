package com.casadocodigo.loja.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String password;
    private String name;

    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.PERSIST)
    private List<Role> roles = new ArrayList<>();

}
