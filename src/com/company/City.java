package com.company;

public class City {

    private String name;
    private int population;
    private int area;

    public City() {
        this.name = "";
        this.population=10;
        this.area=1111;
    }

    public City(String name, int population, int area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public void showName(){
        System.out.println(getName()) ;
    }

    public void showPopulation(){
        System.out.println(getPopulation()) ;
    }
    public void showArea(){
        System.out.println(getArea()) ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
