package com.nadimnesar.dependency.injection.constructor;

public class User {
    private String name;
    private String city;
    private Computer computer;

    /**
     * Constructor Injection
     */
    public User(String name, String city, Computer computer) {
        this.name = name;
        this.city = city;
        this.computer = computer;
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