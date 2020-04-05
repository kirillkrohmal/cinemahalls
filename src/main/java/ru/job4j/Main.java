package ru.job4j;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Place> places = new ArrayList<>();

        Place place1 = new Place("0", "0 ");
        Place place2 = new Place("1", "2");
        Place place3 = new Place("1", "3");
        Place place4 = new Place("2", "1");
        Place place5 = new Place("2", "2");
        Place place6 = new Place("2", "3");
        Place place7 = null;
        Place place8 = new Place("3", "1 ");
        Place place9 = new Place("3", "2 ");
        Place place10 = null;
        Place place11 = new Place("3", "3");
        Place place12 = null;

        places.add(place1);
        places.add(place2);
        places.add(place3);
        places.add(place4);
        places.add(place5);
        places.add(place5);
        places.add(place6);
        places.add(place7);
        places.add(place8);
        places.add(place9);
        places.add(place10);
        places.add(place11);
        places.add(place12);


        for (Place place : places) {
            if (place != null) {
                System.out.println("Место " + place + " занято");
            } else {
                System.out.println("Место " + place + " свободно");
            }
        }
    }
}
