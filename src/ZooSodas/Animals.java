package ZooSodas;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

public class Animals {
    private String name;
    private String species;
    private boolean gender;
    private String previousResidence;
    private Integer age;
    private String color;
    private  double height;






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPreviousResidence() {
        return previousResidence;
    }

    public void setPreviousResidence(String previousResidence) {
        this.previousResidence = previousResidence;
    }

    public Integer getAge() {
//        while (LocalDate today = LocalDate.now();
//        LocalDate birthDate = LocalDate.of(age);
//        int years = Period.between(birthDate, today).getYears();)
            return age;
    }

    public void setAge(Integer age) {

        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }



    public Animals(String name, String species, boolean gender, String previousResidence, Integer age, String color, double height) {
        this.name = name;
        this.species = species;
        this.gender = gender;
        this.previousResidence = previousResidence;
        this.age = age;
        this.color = color;
        this.height = height;
    }




    public String toString(){
        return  "\n"+
                "Gyvūno " +
                "Vardas = "+ name + "\n"+
                "Rūšis = " + species +"\n"+
                "Lytis = " + (gender ? "Patinas" : "Patelė" )+"\n"+
                "Ankstesnė gyvenamoji vieta = " + previousResidence + "\n"+
                "Amžius = " + height + "m" +"\n"+
                "Gyvūno spalva = " + color +"\n"+
                "Suaugusio gyvūno aukštis = " + height + "\n";
    }
}







