package com.company;

public class Main {
    public static void main(String args[]){
        City city = new City("Астана", 10000,12366);
        WriterInfo info = new WriterInfo();
        info.showAllInformation(city);

    }
}
