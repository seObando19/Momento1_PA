/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Beans.ModelLogin;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sebas
 */
public class ControllerLogin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);  
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        //recibir los parametros
        String user=request.getParameter("user");
        String password=request.getParameter("password");
        
        //Instanciar el beans
        ModelLogin model=new ModelLogin();
        
        //Referencia de valores
        model.setUser(user);
        model.setPassword(password);
        
        //LLamar al metodo autenticacion
        boolean auth=model.authentation();
        
        //despachador de respuesta->validar auth
        
        RequestDispatcher desp=null;
        
        if(auth)
        {
            desp=request.getRequestDispatcher("inicio.jsp");
            request.setAttribute("user",user);            
        }else
        {
            desp=request.getRequestDispatcher("index.jsp");
        }
        desp.forward(request, response);
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
