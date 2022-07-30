package com.example.springtest.Risky.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "KULLANICILAR")
public class User extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_gen")
    @SequenceGenerator(name = "user_seq_gen", sequenceName = "user_gen", initialValue = 100, allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "ISIM", length = 100)
    private String firstName;
    @Column(name = "SOYISIM", length = 100)
    private String lastName;

}
