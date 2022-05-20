package com.company;

public class Guljan extends Student{
    private String hobby;
    public Guljan(){}


    public Guljan(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    void study() {
        System.out.println("guljan is reading");
    }

    @Override
    public String toString() {
        return "Guljan{" +
                "hobby='" + hobby + '\'' +
                "} " + super.toString();
    }
}
