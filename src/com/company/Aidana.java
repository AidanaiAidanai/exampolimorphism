package com.company;

public class Aidana extends Student{
    private int year;
    private String color;

    public Aidana(String name, int age, int year, String color) {
        super(name, age);
        this.year= year;
        this.color = color;
    }

    public Aidana() {
    }

    @Override
    void study() {
        System.out.println("she must learn");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Aidana{" +
                "year=" + year +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
