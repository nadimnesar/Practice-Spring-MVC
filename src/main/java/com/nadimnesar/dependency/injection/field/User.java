package com.nadimnesar.dependency.injection.field;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
    private String name;
    private String city;

    /**
     * Field Injection
     */
    @Autowired
    private Computer computer;

    public User(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Computer getComputer() {
        return computer;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", computer=" + computer +
                '}';
    }
}