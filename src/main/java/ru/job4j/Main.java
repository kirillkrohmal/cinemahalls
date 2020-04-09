package ru.job4j;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Place> places = new ArrayList<>();
        int width_and_height = 10;

        Place place1 = new Place("0", "0");
        Place place2 = new Place("1", "2");
        Place place3 = new Place("1", "3");
        Place place4 = new Place("2", "1");
        Place place5 = new Place("2", "2");
        Place place6 = new Place("2", "3");
        Place place8 = new Place("3", "1");
        Place place9 = new Place("3", "2");
        Place place11 = new Place("3", "3");

        places.add(place1);
        places.add(place2);
        places.add(place3);
        places.add(place4);
        places.add(place5);
        places.add(place5);
        places.add(place6);
        places.add(place8);
        places.add(place9);
        places.add(place11);

        StringBuilder table = new StringBuilder();
        table.append("<html><head></head><table>");
        for (int i = 0; i < width_and_height; i++) {
            table.append("<tr>");
            for (int j = 0; j < width_and_height; j++) {
                if (j == width_and_height - 1) {
                    for (Place place : places) {
                        if (Integer.parseInt(place.getColumn()) == j && Integer.parseInt(place.getRow()) == i) {
                            table.append("Место" + place + "занято");
                        } else {
                            table.append("Место " + place + " свободно ");
                        }
                    }
                }
                table.append("</tr>");
            }
            table.append("</table>");
            table.append("</html>");
            System.out.println(table);
        }
    }
}
        /*for(int i=0;i<width_and_height ; i++) {
            System.out.println("+----+----+----+----+----+----+----+----+----+----+");

            for(int j=0;j<width_and_height;j++) {

                if(j==width_and_height-1) { // closing | for last column
                    System.out.print("|");
                    for (Place place : places) {
                        if (place != null) {
                            System.out.printf("Место " + place + " занято ");
                        } else {
                            System.out.printf("Место " + place + " свободно ");
                        }
                    }
                }
            }
        }*/








