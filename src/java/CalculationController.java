/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author wsoehrmann
 */
@WebServlet(name = "CalculationController", urlPatterns = {"/CalculationController"})
public class CalculationController extends HttpServlet {
    
     private static final String CALC_TYPE = "calcType";
    private static final String RECTANGLE = "rectangle";
    private static final String CIRCLE = "circle";

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
        
        String calcType = request.getParameter(CALC_TYPE);
        double answer = 0.00;
        String sAnswer = "";
        String calcTitle = "";
        String destination = "/answer.jsp";
        
        if(calcType.equals(RECTANGLE)) {
            calcTitle = "Area of a Rectangle";
            String sLength = request.getParameter("length");
            String sWidth = request.getParameter("width");
            double length = 0;
            double width = 0;
            try {
                length = Double.valueOf(sLength);
                width = Double.valueOf(sWidth);
                answer = length * width;
                sAnswer = ""+answer;
            }catch (NumberFormatException nfe) {
                sAnswer = "Sorry, you must submit 2 numerical value for this computation";
            }
            
            request.setAttribute("answer", sAnswer);
            request.setAttribute("title", calcTitle);
            request.setAttribute("formula", "length x width: (" + sLength + " x " + sWidth + ")");
            
        } else if(calcType.equals(CIRCLE)) {
            calcTitle = "Area of a Circle";
            String sRadius = request.getParameter("radius");
            double pi = 3.14159265395;
            double radius = 0;
            try {
                radius = Double.valueOf(sRadius);
                answer = pi * radius * radius;
                sAnswer = ""+answer;
            }catch (NumberFormatException nfe) {
                sAnswer = "Sorry, you must submit 1 numerical value for this computation";
            }
            
            request.setAttribute("answer", sAnswer);
            request.setAttribute("title", calcTitle);
            request.setAttribute("formula", "PI x radius squared: (" + 3.14 + " x " + sRadius + ")");
            
        } else {  // must be triangle
            calcTitle = "Calculate Unknown Side";
            String sA = request.getParameter("sideA");
            String sB = request.getParameter("sideB");
            String sC = request.getParameter("sideB");
            
            double a = 0;
            double b = 0;
            double c = 0;
            
            try {
                a = Double.valueOf(sA);
                b = Double.valueOf(sB);
                c = (a * a) + (b * b);
                answer = Math.sqrt(c);
                sAnswer = ""+answer;
            }catch (NumberFormatException nfe) {
                sAnswer = "Sorry, you must submit 2 and only 2 numerical value for this computation";
            }
            
            request.setAttribute("answer", sAnswer);
            request.setAttribute("title", calcTitle);
            request.setAttribute("formula", "c2 = a2 + b2: " + c + "2 = " + (a * a) + " + " + (b * b));
            
        }
        
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
