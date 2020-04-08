package ru.job4j;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*List<Place> places = new ArrayList<>();
        int width_and_height=10;

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

        for(int i=0;i<width_and_height ; i++) {
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
        }
*/

        String html = "<<!DOCTYPE html>\n" +
                "<html lang=\"en\" xmlns:c=\"\">\n" +
                "<head>\n" +
                "    <!-- Required meta tags -->\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
                "\n" +
                "    <!-- Bootstrap CSS -->\n" +
                "    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n" +
                "    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n" +
                "    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n" +
                "    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n" +
                "\n" +
                "    <title>Сервис - Кинотеатр</title>\n" +
                "</head>\n" +
                "\n" +
                "\n" +
                "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n" +
                "<div class=\"container\">\n" +
                "    <div class=\"row pt-3\">\n" +
                "        <h4>\n" +
                "            Бронирование месте на сеанс\n" +
                "        </h4>\n" +
                "        <table class=\"table table-bordered\">\n" +
                "            <thead>\n" +
                "            <tr>\n" +
                "                <th style=\"width: 120px;\">Ряд / Место</th>\n" +
                "                <th>1</th>\n" +
                "                <th>2</th>\n" +
                "                <th>3</th>\n" +
                "            </tr>\n" +
                "            </thead>\n" +
                "            <tbody>\n" +
                "            <tr>\n" +
                "                <th>1</th>\n" +
                "                <td><input type=\"radio\" name=\"place\" value=\"11\"> занято место. Ряд 1, Место 1</td>\n" +
                "                <td><input type=\"radio\" name=\"place\" value=\"11\"> занято место. Ряд 1, Место 2</td>\n" +
                "                <td><input type=\"radio\" name=\"place\" value=\"11\"> Ряд 1, Место 3</td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <th>2</th>\n" +
                "                <td><input type=\"radio\" name=\"place\" value=\"11\"> занято место. Ряд 2, Место 1</td>\n" +
                "                <td><input type=\"radio\" name=\"place\" value=\"11\"> Ряд 2, Место 2</td>\n" +
                "                <td><input type=\"radio\" name=\"place\" value=\"11\"> Ряд 2, Место 3</td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <th>3</th>\n" +
                "                <td><input type=\"radio\" name=\"place\" value=\"11\"> Ряд 3, Место 1</td>\n" +
                "                <td><input type=\"radio\" name=\"place\" value=\"11\"> Ряд 3, Место 2</td>\n" +
                "                <td><input type=\"radio\" name=\"place\" value=\"11\"> занято место. Ряд 3, Место 3</td>\n" +
                "            </tr>\n" +
                "            </tbody>\n" +
                "        </table>\n" +
                "    </div>\n" +
                "    <div class=\"row float-right\">\n" +
                "        <button type=\"button\" class=\"btn btn-success\" onclick=\"addRowAndPlace()\">Оплатить</button>\n" +
                "    </div>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>";


        System.out.println(html);
    }
}
