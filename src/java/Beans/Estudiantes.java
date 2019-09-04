/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;

/**
 *
 * @author sebas
 */
public class Estudiantes implements Serializable{
    private String txtIdentificacion;
    private String txtNombre;
    private String txtApellidos;
    private String txtCurso;
    private String txtJornada;

    public String getTxtIdentificacion() {
        return txtIdentificacion;
    }

    public void setTxtIdentificacion(String txtIdentificacion) {
        this.txtIdentificacion = txtIdentificacion;
    }

    public String getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(String txtNombre) {
        this.txtNombre = txtNombre;
    }

    public String getTxtApellidos() {
        return txtApellidos;
    }

    public void setTxtApellidos(String txtApellidos) {
        this.txtApellidos = txtApellidos;
    }

    public String getTxtCurso() {
        return txtCurso;
    }

    public void setTxtCurso(String txtCurso) {
        this.txtCurso = txtCurso;
    }

    public String getTxtJornada() {
        return txtJornada;
    }

    public void setTxtJornada(String txtJornada) {
        this.txtJornada = txtJornada;
    }
    
        public boolean InputEmpty()
    {
        if(!(txtIdentificacion.isEmpty()||txtNombre.isEmpty()||txtApellidos.isEmpty()||txtCurso.isEmpty()))
        {
            return true;
        }else
        {
            return false;
        }
    }
}
