package com.stupin.carServiceAndWash.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String phoneNumber;
    private int enabled;
    private List<Car> cars;

    public User(Integer id, String name, String surname, String email,
                String password, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }
}
