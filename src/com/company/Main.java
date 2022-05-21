package com.company;

import java.io.IOException;

/**
 * Вариант 8. Создать класс окружность, член класса – R. Предусмотреть в классе методы вычисления и
 * вывода сведений о фигуре – площади, длины окружности. Создать производный класс – конус с высотой
 * h, добавить в класс метод определения объема фигуры, перегрузить методы расчета площади и вывода
 * сведений о фигуре. Написать программу, демонстрирующую работу с классом: дано N окружностей и M
 * конусов, найти количество окружностей, у которых площадь меньше средней площади всех окружностей,
 * и наибольший по объему конус.
 */
public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        double side = -1;
        double height = -1;
        int M = 10;
        /*Circle circle;
        double side = -1;
        Circles circles = new Circles();
        for (int i = 0; i < 10; i++) {
            while (Circle.CorrectRadius("" + (side = Math.random() * 11 - 5)) < 0) {
            }
            circle = new Circle(side);
            circles.add(circle);
        }
        System.out.println(circles);


        System.out.println("\nAverage square of circles : " + circles.getAverageSquare());
        System.out.println(circles.findAverageReturn());
        Cone cone;
        double height = -1;
        Cones cones = new Cones();
        for (int i = 0; i < 10; i++) {
            while (Cone.CorrectRadius("" + (side = Math.random() * 11 - 5)) < 0 || Cone.CorrectHeight("" + (height = Math.random() * 11 - 5)) < 0) {

            }
            cone = new Cone(side, height);
            cones.list.add(cone);
        }
        for (int i = 0; i < cones.list.size(); i++) {
            System.out.println(cones.list.get(i));
        }
        System.out.println("\nThe largest volume of the cone : " + cones.getLargestVolume());
        System.out.println(cones.getLargestVolumeAsString());
        */


        CirclesList circlesList = new CirclesList();
        for (int i = 0; i < M; i++) {
            while (Circle.CorrectRadius("" + (side = Math.random() * 11 - 5)) < 0) {
            }
            //circle = new Circle(side);
            circlesList.add(new Circle(side));
        }
        System.out.println(circlesList);
        System.out.println("\nAverage square of circles : " + circlesList.getAverageSquare());
        System.out.println(circlesList.findAverageReturn()+System.lineSeparator());

        ConesList conesList = new ConesList();
        for (int i = 0; i < M; i++) {
            while (Cone.CorrectRadius("" + (side = Math.random() * 11 - 5)) < 0 || Cone.CorrectHeight("" + (height = Math.random() * 11 - 5)) < 0) {
            }
            //cone = new Cone(side, height);
            conesList.cones.add(new Cone(side,height));
        }
        System.out.println(conesList);
        System.out.println("\nThe largest volume of the cone : " + conesList.getLargestVolume());
        System.out.println(conesList.getLargestVolumeAsString());
        DataBase.serializeCircles(circlesList);
        DataBase.serializeCones(conesList);
        CirclesList circlesList1 = DataBase.deserializationCircles();
        System.out.println(circlesList1);
        ConesList conesList1 = DataBase.deserializationCones();
        System.out.println(conesList1);
    }
}