package br.com.gmartins.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Gen_Seq")
    @SequenceGenerator(name = "Gen_Seq", sequenceName = "user_codigo", allocationSize = 1)
    private Integer id;

    @Column(name = "name" , length = 100)
    private String name;

    @Column(name="username", length = 60)
    private String username;

    @Column(name="password", length = 20)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name="role")
    private Role role;
}

