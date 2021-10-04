package by.it.academy.tomcat.test;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    private int hitCount;

    public void init() {
        hitCount = 0;
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        hitCount++;

        PrintWriter out = resp.getWriter();

        out.println("Total Number of Hits - " + hitCount + "    Thread name - " + Thread.currentThread().getName());
    }
}

