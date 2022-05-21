package com.company;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CirclesList implements Serializable  {
    List<Circle> circles;

    public CirclesList(){
        circles = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Circles : "+ System.lineSeparator() + circles  ;
    }
    public void add(Circle circle){
        circles.add(circle);
    }
    public void remove(int number){
        if (number < circles.size() && number >= 0) {
            circles.remove(number);
        }
    }
    public void remove(Circle circle) {
        circles.remove(circle);
    }
    public double getAverageSquare(){
        double average = 0;
        for (Circle circle : circles) {
            average+=circle.getSquare();
        }
        return average/circles.size();
    }
    public String findAverageReturn(){
        String temp3="";
        for (Circle circle :circles) {
            if(getAverageSquare()>circle.getSquare()){
                temp3+=circle;
            }
        }
        return temp3;
    }
}
