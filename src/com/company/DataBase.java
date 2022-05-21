package com.company;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;


public class DataBase {
    public static void serializeCircles(CirclesList circlesList) throws FileNotFoundException {
        try {
            FileOutputStream fileOut = new FileOutputStream("./src/DataBase/"  + LocalDate.now()+"-"+ LocalDateTime.now().getHour() + "-" + LocalDateTime.now().getMinute() +"-"+ LocalDateTime.now().getSecond()+ ".ci");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(circlesList);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void serializeCones(ConesList conesList) throws FileNotFoundException {
        try {
            FileOutputStream fileOut = new FileOutputStream("./src/DataBase/"  + LocalDate.now() +"-"+ LocalDateTime.now().getHour() + "-" + LocalDateTime.now().getMinute() +"-"+ LocalDateTime.now().getSecond() + ".co");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(conesList);
            out.close();            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CirclesList deserializationCircles() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(Objects.requireNonNull(new File("./src/DataBase").listFiles())[Objects.requireNonNull(new File("./src/DataBase").listFiles()).length - 2]);
        ObjectInputStream in = new ObjectInputStream(fileInputStream);
        CirclesList circlesList = (CirclesList) in.readObject();
        in.close();
        fileInputStream.close();
        return circlesList;
    }
    public static ConesList deserializationCones() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(Objects.requireNonNull(new File("./src/DataBase").listFiles())[Objects.requireNonNull(new File("./src/DataBase").listFiles()).length - 1]);
        ObjectInputStream in = new ObjectInputStream(fileInputStream);
        ConesList conesList = (ConesList) in.readObject();
        in.close();
        fileInputStream.close();
        return conesList;
    }

}



