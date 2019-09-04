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
public class Profesores implements Serializable{
    private String txtCedula;
    private String txtNombreP;
    private String txtApellidosP;
    private String txtEspecialidad;

    public String getTxtCedula() {
        return txtCedula;
    }

    public void setTxtCedula(String txtCedula) {
        this.txtCedula = txtCedula;
    }

    public String getTxtNombreP() {
        return txtNombreP;
    }

    public void setTxtNombreP(String txtNombreP) {
        this.txtNombreP = txtNombreP;
    }

    public String getTxtApellidosP() {
        return txtApellidosP;
    }

    public void setTxtApellidosP(String txtApellidosP) {
        this.txtApellidosP = txtApellidosP;
    }

    public String getTxtEspecialidad() {
        return txtEspecialidad;
    }

    public void setTxtEspecialidad(String txtEspecialidad) {
        this.txtEspecialidad = txtEspecialidad;
    }
    
    public boolean InputEmpty()
    {
        if(!(txtCedula.isEmpty()||txtNombreP.isEmpty()||txtApellidosP.isEmpty()||txtEspecialidad.isEmpty()))
        {
            return true;
        }else
        {
            return false;
        }
    }
    
}
