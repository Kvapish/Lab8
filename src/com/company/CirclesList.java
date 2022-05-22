package com.company;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CirclesList implements Serializable {
    ArrayList<Circle> circles;

    public CirclesList() {
        circles = new ArrayList<>();
    }
    public CirclesList(ArrayList <Circle> list){
        this.circles = list;
    }
    public ArrayList<Circle> getList() {
        return circles;
    }

    public void add(Circle circle) {
        circles.add(circle);
    }

    public void remove(int number) {
        if (number < circles.size() && number >= 0) {
            circles.remove(number);
        }
    }

    public void remove(Circle circle) {
        circles.remove(circle);
    }

    public double getAverageSquare() {
        double average = 0;
        for (Circle circle : circles) {
            average += circle.getSquare();
        }
        return average / circles.size();
    }

    public String findAverageReturn() {
        String temp3 = "";
        for (Circle circle : circles) {
            if (getAverageSquare() > circle.getSquare()) {
                temp3 += circle;
            }
        }
        return temp3;
    }
    @Override
    public String toString() {
        return "Circles : " + System.lineSeparator() + circles;
    }
}
