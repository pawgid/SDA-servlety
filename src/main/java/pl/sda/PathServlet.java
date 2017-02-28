package pl.sda;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class PathServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> names = Arrays.asList("Szymon", "Jan", "Anna", "Pawel", "Krzysztof");
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
//        writer.write("Hello World");

//        String requestURI = req.getRequestURI();
//        String name = requestURI.substring(requestURI.lastIndexOf("/") + 1);
//        writer.write("<h1>" + name + "</h1>");

        String requestURI = req.getRequestURI();
        Integer index = new Integer(requestURI.substring(requestURI.lastIndexOf("/") + 1));
        writer.write("<h1>" + names.get(index) + "</h1>");
    }
}
