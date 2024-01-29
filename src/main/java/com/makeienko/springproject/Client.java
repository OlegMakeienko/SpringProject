package com.makeienko.springproject;

import java.util.HashMap;
import java.util.Map;

public class Client {
    private String name;
    private String surname;
    private int age;
    private String phoneNumber;
    private String modelCar;

    private Map<String, String> carsBrand;

    private String hireTerm;

    private int timesFrame;

    public Client() {
        carsBrand = new HashMap<>();
        carsBrand.put("Tesla Model 3", "T3");
        carsBrand.put("BMW", "BMW");
        carsBrand.put("Mercedes Benz class X", "MBenz");
        carsBrand.put("Polestar 2", "PStar");
    }

    public Client(String name, String surname, int age, String phoneNumber, String modelCar) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.modelCar = modelCar;
    }
    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", modelCar='" + modelCar + '\'' +
                '}';
    }

    public int getTimesFrame() {
        return timesFrame;
    }

    public void setTimesFrame(int timesFrame) {
        this.timesFrame = timesFrame;
    }

    public String getHireTerm() {
        return hireTerm;
    }

    public void setHireTerm(String hireTerm) {
        this.hireTerm = hireTerm;
    }

    public Map<String, String> getCarsBrand() {
        return carsBrand;
    }

    public void setCarsBrand(Map<String, String> carsBrand) {
        this.carsBrand = carsBrand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }
}
