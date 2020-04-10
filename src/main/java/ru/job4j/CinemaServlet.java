package ru.job4j;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class CinemaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.write
                (
                        "<table>\n" + "<tr>\n"
                                + "     <th>Raw/Place</th>\n"
                                + "     <th>1</th>\n"
                                + "     <th>2</th>\n"
                                + "     <th>3</th>\n"
                                + "</tr>\n"
                                + "<tr>\n"
                                + "     <td>1</td>\n"
                                + "     <td>X Raw 1, Place 1 </td>\n"
                                + "     <td>X Raw 1, Place 2 </td>\n"
                                + "     <td>Raw 1, Place 3 </td>\n"
                                + "</tr>\n"
                                + "<tr>\n"
                                + "     <td>2</td>\n"
                                + "     <td>X Raw 2, Place 1 </td>\n"
                                + "     <td>Raw 2, Place 2 </td>\n"
                                + "     <td>Raw 2, Place 3 </td>\n"
                                + "</tr>\n"
                                + "<tr>\n"
                                + "     <td>3</td>\n"
                                + "     <td>Raw 3, Place 1 </td>\n"
                                + "     <td>Raw 3, Place 2 </td>\n"
                                + "     <td>X Raw 3, Place 3 </td>\n"
                         + "</tr>\n" + "</table>\n");
        writer.flush();
    }
}
