package com.makeienko.springproject;

import jakarta.validation.constraints.*;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class Client {
    @Size(min = 2, message = "Name must be minimum two symbols")
    private String name;
    @NotBlank(message = "Surname is required field")
    private String surname;
    @Min(value = 18, message = "You are to young")
    private int age;
    @Pattern(regexp = "\\+[0-9]{2}[(][0-9]{2}[)][0-9]{7}", message = "please use patten +XX(XXX)XXXXXXX")
    private String phoneNumber;
    private String modelCar;

    private Map<String, String> carBrands;

    private String hireTerm;

    private Map<String, String> hireTerms;

    private int timesFrame;

    private String[] languages;

    private Map<String, String> languageList;

    public Client() {
        carBrands = new HashMap<>();
        carBrands.put("Tesla Model 3", "T3");
        carBrands.put("BMW", "BMW");
        carBrands.put("Mercedes Benz class X", "MBenz");
        carBrands.put("Polestar 2", "PStar");

        hireTerms = new HashMap<>();
        hireTerms.put("hour", "Hour");
        hireTerms.put("day","Day");
        hireTerms.put("week","Week");

        languageList = new HashMap<>();
        languageList.put("English", "EN");
        languageList.put("Swedish", "SW");
        languageList.put("Ukrainian", "UA");
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

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public void setHireTerms(Map<String, String> hireTerms) {
        this.hireTerms = hireTerms;
    }

    public void setTimesFrame(int timesFrame) {
        this.timesFrame = timesFrame;
    }

    public void setHireTerm(String hireTerm) {
        this.hireTerm = hireTerm;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }
}
