package com.arkhipov.drools.utils;

import java.util.Random;

public class Coordinates {
    private double lan;
    private double lon;

    public Coordinates(double lan, double lon) {
        this.lan = lan;
        this.lon = lon;
    }

    public static Coordinates RandomCoordinates() {
        Random rand = new Random();
        return new Coordinates(rand.nextInt(181) - 90, rand.nextInt(361) - 180);
    }

    public double getLan() {
        return lan;
    }

    public void setLan(double lan) {
        this.lan = lan;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double distanceTo(Coordinates other) {
        return Math.sqrt((lan - other.lan) * (lan - other.lan) + (lon - other.lon) * (lon - other.lon));
    }

    public static double distance(Coordinates a, Coordinates b) {
        return Math.sqrt((a.lan - b.lan) * (a.lan - b.lan) + (a.lon - b.lon) * (a.lon - b.lon));
    }
}
