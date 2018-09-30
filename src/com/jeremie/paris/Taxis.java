package com.jeremie.paris;

public class Taxis implements MoyenDeLocomotion {
    @Override
    public void deplace(String adresse) {
        System.out.println("Je suis un taxis et je vais à l'adresse " + adresse);
    }
}
