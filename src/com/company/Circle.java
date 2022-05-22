package com.company;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Circle implements Serializable {
    private double radius;
    public static double CorrectRadius(String value) {
        double side = -1;
        try {
            side = Double.parseDouble(value) > 0 ? Double.parseDouble(value) : -1;
        } catch (Exception exception) {

        }
        return side;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(){

    }

    public void setRadius(double radius) {
        this.radius = radius > 0 ? radius : -1;
    }

    public double getRadius() {
        return radius;
    }


    @Override
    public String toString() {
        return getRadius() > 0 ? System.lineSeparator() + "Circle{" +
                "Radius = " + radius +
                " , Square = " + getSquare() +
                " , Perimeter = " + getPerimeter() +
                '}' : "Error circle (radius = " + getRadius() + ").";
    }

    public double getSquare() {
        return getRadius() * getRadius() * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

}
