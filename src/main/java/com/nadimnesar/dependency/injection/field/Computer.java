package com.nadimnesar.dependency.injection.field;

public class Computer {
    private String brand;
    private String model;
    private Integer memoryCapacity;
    private Integer storageCapacity;
    private Double cpuClockSpeed;

    public Computer() {

    }

    public Computer(String brand, String model, Integer memoryCapacity, Integer storageCapacity, Double cpuClockSpeed) {
        this.brand = brand;
        this.model = model;
        this.memoryCapacity = memoryCapacity;
        this.storageCapacity = storageCapacity;
        this.cpuClockSpeed = cpuClockSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(Integer memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public Integer getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public Double getCpuClockSpeed() {
        return cpuClockSpeed;
    }

    public void setCpuClockSpeed(Double cpuClockSpeed) {
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