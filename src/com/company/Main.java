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
        CirclesList circlesList = new CirclesList();
        ConesList conesList = new ConesList();
        try {
            circlesList = DataBase.JacksonDeserializationCirclesList();
            conesList = DataBase.JacksonDeserializationConesList();
        } catch (Exception e) {
            double side = -1;
            double height = -1;
            int M = 10;
            for (int i = 0; i < M; i++) {
                while (Circle.CorrectRadius("" + (side = Math.random() * 11 - 5)) < 0) {
                }
                circlesList.add(new Circle(side));
            }
            System.out.println(circlesList);
            System.out.println("\nAverage square of circles : " + circlesList.getAverageSquare());
            System.out.println(circlesList.findAverageReturn() + System.lineSeparator());
            for (int i = 0; i < M; i++) {
                while (Cone.CorrectRadius("" + (side = Math.random() * 11 - 5)) < 0 || Cone.CorrectHeight("" + (height = Math.random() * 11 - 5)) < 0) {
                }
                conesList.cones.add(new Cone(side, height));
            }
            System.out.println(conesList);
            System.out.println("\nThe largest volume of the cone : " + conesList.getLargestVolume());
            System.out.println(conesList.getLargestVolumeAsString());
        }
        DataBase.serializeCircles(circlesList);
        DataBase.serializeCones(conesList);
        CirclesList circlesList1 = DataBase.deserializationCircles();
        System.out.println(circlesList1);
        ConesList conesList1 = DataBase.deserializationCones();
        System.out.println(conesList1);
        DataBase.JacksonSerializeCirclesList(circlesList);
        DataBase.JacksonSerializeConesList(conesList);

        CirclesList circlesList2 = DataBase.JacksonDeserializationCirclesList();
        System.out.println(circlesList2);
        ConesList conesList2 = DataBase.JacksonDeserializationConesList();
        System.out.println(conesList2);

    }
}