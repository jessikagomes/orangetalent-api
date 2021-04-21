package com.orangetalents.apirest.user;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name="`user`")
public class User {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private Long id;
    private String name;
    private String email;
    private String cpf;
    private LocalDate dob;
    @Transient
    private Integer age;

    public User() {
    }

    public User(Long id, String name, String email, String cpf, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.dob = dob;
    }

    public User(String name, String email, String cpf, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
