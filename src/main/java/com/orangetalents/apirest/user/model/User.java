package com.orangetalents.apirest.user.model;

import com.orangetalents.apirest.user.model.Address;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

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
    @Column(nullable = false)
    private String email;
    @Column(nullable = false, unique = true)
    private String cpf;
    private LocalDate dob;
    @OneToMany(fetch = FetchType.LAZY, cascade ={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Address> addresses;
    @Transient
    private Integer age;

    public User() {
    }

    public User(Long id, String name, String email, String cpf, LocalDate dob, List<Address> addresses) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.dob = dob;
        this.addresses = addresses;
    }

    public User(String name, String email, String cpf, LocalDate dob, List<Address> addresses) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.dob = dob;
        this.addresses = addresses;
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
                ", addresses=" + addresses +
                ", age=" + age +
                '}';
    }
}
