package com.kowatschpaul.ue9;

public class Car {
    private String license, name;
    private boolean registered;

    public String getLicense() {
        return this.license;
    }
    public String getName(){
        return this.name;
    }
    public boolean isRegistered() {
        return this.registered;
    }

    public Car(String name){
        this.name = name;
        this.license = "";
        this.registered = false;
    }

    public Car(String name, String license){
        this.name = name;
        this.license = license;
        this.registered = true;
    }
}
