package com.company;

import java.io.Serializable;

public class Cone extends Circle implements Serializable {
    public double getHeight() {
        return height;
    }

    public Cone(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double height;

    public Cone(double radius) {
        super(radius);
        setHeight(height);
    }

    public double getVolume() {
        return super.getSquare() * getHeight()  / 3;
    }

    @Override
    public double getSquare() {
        return (Math.PI * getRadius() * Math.sqrt((getRadius() * getRadius()) + (getHeight() * getHeight())) + super.getSquare());
    }

    @Override
    public String toString() {
        return System.lineSeparator()+"Cone{" + "radius = " + getRadius() + ", square = " + this.getSquare() + ", volume = " + getVolume() +
                " height = " + height +
                '}';
    }

    public static double CorrectHeight(String value) {
        double side = -1;
        try {
            side = Double.parseDouble(value) > 0 ? Double.parseDouble(value) : -1;
        } catch (Exception exception) {

        }
        return side;
    }
}
