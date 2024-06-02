package com.nadimnesar.inversion.of.control.component;

import org.springframework.stereotype.Component;

@Component
public class Computer {
    private String brand;
    private String model;
    private Integer memoryCapacity;
    private Integer storageCapacity;
    private Double cpuClockSpeed;

    public Computer() {

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