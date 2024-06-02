package com.nadimnesar.inversion.of.control.bean;

public class Computer {
    private String brand;
    private String model;
    private Integer memoryCapacity;
    private Integer storageCapacity;
    private Double cpuClockSpeed;

    public Computer(String brand, String model, Integer memoryCapacity, Integer storageCapacity, Double cpuClockSpeed) {
        this.brand = brand;
        this.model = model;
        this.memoryCapacity = memoryCapacity;
        this.storageCapacity = storageCapacity;
        this.cpuClockSpeed = cpuClockSpeed;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", memoryCapacity=" + memoryCapacity +
                ", storageCapacity=" + storageCapacity +
                ", cpuClockSpeed=" + cpuClockSpeed +
                '}';
    }
}