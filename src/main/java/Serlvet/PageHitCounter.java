/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serlvet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Asger
 */
public class PageHitCounter extends HttpServlet {

    private int hitCount;

    public void init() {
        // Reset hit counter.
        hitCount = 0;
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        // This method executes whenever the servlet is hit 
        // increment hitCount 
        hitCount++;
        PrintWriter out = response.getWriter();
        String info = "Hey! Vi er i gang med et eksamensprojekt i Security.\n Vi har prøvet at scamme dig men der er selvfølgelig ikke sket dig noget.\n Pas på i fremtiden med hvilke links du trykker på.";
        String title = "Mængde af mennesker der har trykket på dette link.";
        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

        out.println(docType
                + "<html>\n"
                + "<head><title>" + title + "</title></head>\n"
                + "<body bgcolor = \"#f0f0f0\">\n"
                + "<h1 align = \"center\">" + title + "</h1>\n"
                + "<h2 align = \"center\">" + hitCount + "</h2>\n"
                + "</body>\n"
                + "</html >"
        );
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
