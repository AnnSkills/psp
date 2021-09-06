package com.company;

public class WriterInfo {
    public void showAllInformation(City city) {

        System.out.println("Информация о городе");
        System.out.print("Название города: ");
        city.showName();
        System.out.print("Население: ");
        city.showPopulation();
        System.out.print("Площадь: ");
        city.showArea();

    }
}
