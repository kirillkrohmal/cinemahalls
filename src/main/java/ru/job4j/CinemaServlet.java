package ru.job4j;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CinemaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        List<Place> places = new ArrayList<>();
        int width = 4, height = 10;

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
        for (int i = 0; i < height; i++) {
            table.append("<tr>");
            for (int j = 0; j < width; j++) {
                for (Place place : places) {
                    if (Integer.parseInt(place.getColumn()) == j && Integer.parseInt(place.getRow()) == i) {
                        table.append("<td>busy</td>");
                    } else {
                        table.append("<td></td>");
                    }
                }
            }
            table.append("</tr>");
        }

        table.append("</table>");
        table.append("</html>");

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/cinema.jsp");

        dispatcher.forward(req, resp);
    }
}
