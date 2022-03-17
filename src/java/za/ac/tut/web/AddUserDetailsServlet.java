/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import ac.za.tut.business.Person;
import ac.za.tut.business.PersonProcess;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
public class AddUserDetailsServlet extends HttpServlet {


    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // extract information from request object
        String name = request.getParameter("name");
        String gender= request.getParameter("gender");
        String dob = request.getParameter("dob");
        // intantiate objects
        Person pr = new Person(name,gender,dob);
        PersonProcess pp = new PersonProcess(pr);
        String title = pp.determineTitle();
        String age = pp.determineAge();
        // attach  the data  to the request object
        request.setAttribute("name", name);
        request.setAttribute("age", age);
        request.setAttribute("title", title);
        // foward data to a JSP
        RequestDispatcher disp = request.getRequestDispatcher("addUserDetailsOutcome.jsp");
        disp.forward(request, response);
    }

    

}
