package com.example;

public class Device implements Cloneable {
    private String name;
    private String type;
    private String status;

    public Device(String name, String type, String status) {
        this.name = name;
        this.type = type;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public Object clone() {
        return new Device(name, type, status);
    }

}
