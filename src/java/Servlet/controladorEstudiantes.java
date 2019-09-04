
package Servlet;


import Beans.Estudiantes;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

/**
 *
 * @author sebas
 */
public class controladorEstudiantes extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */            
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
        
        String identificacion = request.getParameter("txtIdentificacion");
        String nombres = request.getParameter("txtNombre");
        String apellidos = request.getParameter("txtApellidos");
        String cursos = request.getParameter("txtCurso");
        String jornada = request.getParameter("txtJornada");
        
        Estudiantes estudiante = new Estudiantes();
        
        estudiante.setTxtIdentificacion(identificacion);
        estudiante.setTxtNombre(nombres);
        estudiante.setTxtApellidos(apellidos);
        estudiante.setTxtCurso(cursos);
        estudiante.setTxtJornada(jornada);
        
        boolean InputEmpty = estudiante.InputEmpty();
        
        JSONObject dataStudent = new JSONObject();
        
        try {
            dataStudent.put("id", identificacion);
            dataStudent.put("nombres", nombres);
            dataStudent.put("apellidos", apellidos);
            dataStudent.put("cursos",cursos);
            dataStudent.put("jornada",jornada);
        } catch (JSONException e) {
            System.out.print(e);
        }      
        
        RequestDispatcher dispatch = null;
        /*
                dispatch = request.getRequestDispatcher("Success.jsp");
                request.setAttribute("data", data);
        
        */
        if(InputEmpty)
        {
            dispatch=request.getRequestDispatcher("Success.jsp");
            request.setAttribute("dataStudent", dataStudent);
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
