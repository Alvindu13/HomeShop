package com.jeremie.garage;

public class Bike extends Vehicle{
    private String pedaleType;
    private String typeTerrain;
    private int nbRoue;


    public Bike(String modelName, String description, String manufacturer, int yeah, String color, int speed, int[] dimensions, int weight, String pedaleType, String typeTerrain, int nbRoue) {
        super(modelName, description, manufacturer, yeah, color, speed, dimensions, weight);
        this.pedaleType = pedaleType;
        this.typeTerrain = typeTerrain;
        this.nbRoue = nbRoue;
    }

    public String getPedaleType() {
        return pedaleType;
    }

    public String getTypeTerrain() {
        return typeTerrain;
    }

    public int getNbRoue() {
        return nbRoue;
    }

    @Override
    public void start() {
        System.out.println("Je suis un vélo avec des pédales " + pedaleType +" avec "); //nbRoue + " roues" );
    }

    @Override
    public void stop() {

    }
}
