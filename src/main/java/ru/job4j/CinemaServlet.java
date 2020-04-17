package ru.job4j;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class CinemaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Place place1 = new Place("1", "1");
        Place place2 = new Place("1", "2");
        Place place3 = new Place("1", "3");
        Place place4 = new Place("2", "1");
        Place place5 = new Place("2", "2");
        Place place6 = new Place("2", "3");
        Place place8 = new Place("3", "1");
        Place place9 = new Place("3", "2");
        Place place11 = new Place("3", "3");

        List<Place> places = new ArrayList<>();

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
        int width_and_height = 10;

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();


        writer.println("<table>\n" + "<tr>\n");
        writer.println("     <th>Raw/Place</th>\n");
        writer.println("     <th>1</th>\n");
        writer.println("     <th>2</th>\n");
        writer.println("     <th>3</th>\n");
        writer.println("</tr>\n");
        writer.println("<tr>\n");
        writer.println("     <td>1</td>\n");
        writer.println("     <td>");
        writer.println("/td>");
        writer.println("     <td>X Raw 1, Place 2 </td>\n");
        writer.println("     <td>Raw 1, Place 3 </td>\n");
        writer.println("</tr>\n");
        writer.println("<tr>\n");
        writer.println("     <td>2</td>\n");
        writer.println("     <td>X Raw 2, Place 1 </td>\n");
        writer.println("     <td>Raw 2, Place 2 </td>\n");
        writer.println("     <td>Raw 2, Place 3 </td>\n");
        writer.println("</tr>\n");
        writer.println("<tr>\n");
        writer.println("     <td>3</td>\n");
        writer.println("     <td>Raw 3, Place 1 </td>\n");
        writer.println("     <td>Raw 3, Place 2 </td>\n");
        writer.println("     <td>X Raw 3, Place 3 </td>\n");
        writer.println("</tr>\n" + "</table>\n");
    }
}


