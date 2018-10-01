package com.jeremie;

import com.jeremie.garage.Bike;
import com.jeremie.garage.Car;
import com.jeremie.garage.Vehicle;
import com.jeremie.homeshop.*;
import com.jeremie.paris.Bus;
import com.jeremie.paris.MoyenDeLocomotion;
import com.jeremie.paris.Parisien;
import com.jeremie.paris.Taxis;


import javax.swing.text.TabableView;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*Car car = new Car("Clio III", "Renault Clio 3 Gris métallisé année 2005", "Renault", 2005
        , "Gris métallisé", 225, new int[]{4032, 1720, 1497}, 1240, 5, 4, "Diesel",
                List.of(new String[]{"vitres électriques", "GPS", "Grosse capacité du coffre", "Enceinte de ouf", "Ouverture centralisée"}));

        car.start();

        Vehicle bike = new Bike("BMX", "RX110","Nike", 2018, "Blue", 45, new int[]{140,12,22}, 123
        , "Crentée", "AllTerrains", 2);*/


        Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
        Product tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, "LED");
        Fridge fridge = new Fridge("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);

        Customer customer = new Customer("Juste Leblanc", "19 rue Germain Pilon, Paris");

        Bill bill = new Bill(customer, new RelayDelivery(27));
        bill.addProduct(cafe, 1);
        bill.addProduct(tv, 1);
        bill.addProduct(fridge, 1);
        bill.addProduct(tv, 4);

        bill.generate(new FileWriter("facture_leblanc"));

        /*Parisien segolene = new Parisien();

        Bus bus = new Bus();
        segolene.seDeplacer(bus);
        Taxis taxi = new Taxis();
        segolene.seDeplacer(taxi);
        MoyenDeLocomotion taxi2 = new Taxis();
        segolene.seDeplacer(taxi2);*/





    }

    }


