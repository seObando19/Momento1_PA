/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Beans.Profesores;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author sebas
 */
public class ControladorProfesores extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
        }
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

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //capturar los valores del modelo en variables
        String cedula = request.getParameter("txtCedula");
        String nombres = request.getParameter("txtNombreP");
        String apellidos = request.getParameter("txtApellidosP");
        String especialidad = request.getParameter("txtEspecialidad");
        
        //Instanciar el modelo
        Profesores profesor = new Profesores();
        
        //Cambiar los valores dentro del modelo        
        profesor.setTxtCedula(cedula);
        profesor.setTxtNombreP(nombres);
        profesor.setTxtApellidosP(apellidos);
        profesor.setTxtEspecialidad(especialidad);
        
        //Validar por medio de este metodo que todo los parametros no estan vacios
        boolean InputEmpty = profesor.InputEmpty();
        
        //crear el objeto JSON y guardar los valores 
        JSONObject dataTeacher = new JSONObject();
        
        try {
            dataTeacher.put("id", cedula);
            dataTeacher.put("nombres", nombres);
            dataTeacher.put("apellidos", apellidos);
            dataTeacher.put("especialidad", especialidad);
        } catch (JSONException e) {
            System.out.print(e);
        }
        
        RequestDispatcher dispatch=null;
        
        if(InputEmpty)
        {
            dispatch=request.getRequestDispatcher("Success.jsp");
            request.setAttribute("dataTeacher", dataTeacher);
        }else
        {
            dispatch=request.getRequestDispatcher("Error.jsp");
        }
        dispatch.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
