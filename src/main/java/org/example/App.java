package org.example;


public class App {
    int modelYear;
    String modelName;

//    public App(int year, String name) {
//        modelYear = year;
//        modelName = name;
//}


    public App(int modelYear, String modelName) {
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public static void main(String[] args) {
        App myCar = new App(2014, "SUPRA");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}


