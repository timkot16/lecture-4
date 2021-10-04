package by.it.academy.tomcat.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SecondServlet",
        urlPatterns = "/second")
public class SecondServlet extends HttpServlet {

    private int hitPost;
    private int hitGet;

    public void init() {
        hitPost = 0;
        hitGet = 0;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        hitPost++;

        PrintWriter out = resp.getWriter();

        out.println("Total Number of Post hits - " + hitPost + " Thread name - " + Thread.currentThread().getName());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        hitGet++;

        PrintWriter out = resp.getWriter();

        out.println("Total Number of Get hits - " + hitGet + "  Thread name - " + Thread.currentThread().getName());
    }
}
