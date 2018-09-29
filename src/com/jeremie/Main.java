package com.jeremie;

import com.jeremie.garage.Car;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Clio III", "Renault Clio 3 Gris métallisé année 2005", "Renault", 2005
        , "Gris métallisé", 225, new int[]{4032, 1720, 1497}, 1240, 5, 4, "Diesel",
                List.of(new String[]{"vitres électriques", "GPS", "Grosse capacité du coffre", "Enceinte de ouf", "Ouverture centralisée"}));

        System.out.println(car.getDoor());
        System.out.println(car.getOptions());
        System.out.println(Arrays.toString(car.getDimensions()));
        car.start();
        car.startHeadLight();

    }

}
