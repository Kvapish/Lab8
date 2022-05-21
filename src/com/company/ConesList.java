package com.company;

import java.io.Serializable;
import java.util.ArrayList;

public class ConesList implements Serializable {
    public ArrayList<Cone> cones;

    public ConesList() {
        this.cones = new ArrayList<>();
    }
    public double getLargestVolume(){
        double  maximum = 0;
        for (int i = 0; i < cones.size(); i++) {
            if (cones.get(i).getVolume() > maximum) {
                maximum = cones.get(i).getVolume();
            }
        }
        return maximum;
    }


    public String getLargestVolumeAsString(){
        String temp4="";
        for (Cone cone : cones) {
            if (getLargestVolume() <= cone.getVolume())
            temp4 = cone+System.lineSeparator();
        }
        return temp4;
    }

    @Override
    public String toString() {
        return "Cones : "+ System.lineSeparator() + cones  ;
    }
}
