package com.nadimnesar.inversion.of.control.bean;

public class User {
    private String name;
    private String city;
    private Computer computer;

    public User(String name, String city, Computer computer) {
        this.name = name;
        this.city = city;
        this.computer = computer;
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