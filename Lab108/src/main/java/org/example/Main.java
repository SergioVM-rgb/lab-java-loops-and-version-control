package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //BigDecimal Operations

        //1
        BigDecimal bd1 = new BigDecimal("4.245245");
        double bigRounded = roundBigHundreth(bd1);
        System.out.println(bigRounded);

        //2
        BigDecimal bd2 = new BigDecimal("1.23456");
        System.out.println(bigReversed(bd2));
    }
    //BigDecimal Operations

    //1

    public static double roundBigHundreth(BigDecimal big1) {
        return big1.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }

    //2

    public static BigDecimal bigReversed(BigDecimal big2) {
        return big2.setScale(1, RoundingMode.HALF_EVEN).negate();
    }
}

//Car Inventory System

abstract class Car {
    String vinNumber;
    String make;
    String model;
    int mileage;
    public abstract String getInfo();

    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }
}

class Sedan extends Car {
    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    @Override
    public String getInfo() {
        return "Las características del Sedan son: \nVin:" + vinNumber + "\nMake: " + make + "\nModel: " + model + "\nMileage: " + mileage;
    }
}

class UtilityVehicle extends Car {
    public boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String getInfo() {
        return "Las características del Utility Vehicle son: \nVin:" + vinNumber + "\nMake: " + make + "\nModel: " + model + "\nMileage: " + mileage + "\nFour Wheel Drive: " + fourWheelDrive;
    }
}

class Truck extends Car {
    public double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String getInfo() {
        return "Las características del Utility Vehicle son: \nVin:" + vinNumber + "\nMake: " + make + "\nModel: " + model + "\nMileage: " + mileage + "\nTowing Capacity: " + towingCapacity;
    }
}

//Video Streaming Service

abstract class Video {
    String title;
    int duration;
    public abstract String getInfo();

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
}

class TvSeries extends Video {
    public int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    @Override
    public String getInfo() {
        return "La serie " + title + "dura un total de " + duration + "minutos y tiene " + episodes + "episodios";
    }
}

class Movie extends Video {
    public double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    @Override
    public String getInfo() {
        return "La película " + title + "dura un total de " + duration + "minutos y tiene una califación de " + rating;
    }
}

//IntList Interface
interface IntList {
    void add(int number);
    int get(int id);
}

class IntArrayList implements IntList {
    int[] lista;
    int arrSize;

    public IntArrayList() {
        lista = new int[10];
        arrSize = 0;
    }

    @Override
    public void add(int number) {
        if (arrSize == lista.length) {
            int[] newLista = new int[lista.length + lista.length / 2];
            for (int i = 0; i < lista.length; i++) {
                newLista[i] = lista[i];
            }
            lista = newLista;
        }
        lista[arrSize] = number;
        arrSize++;
    }


    @Override
    public int get(int id) {
        return lista[id];
    }
}
class IntVector implements IntList {
    int[] vector;
    int vectorSize;

    public IntVector() {
        vector = new int[20];
        vectorSize = 0;
    }

    @Override
    public void add(int number) {
        if (vectorSize == vector.length) {
            int[] newVector = new int[vector.length*2];
            for (int i = 0; i < vector.length; i++) {
                newVector[i] = vector[i];
            }
            vector = newVector;
        }
        vector[vectorSize] = number;
        vectorSize++;
    }


    @Override
    public int get(int id) {
        return vector[id];
    }
}