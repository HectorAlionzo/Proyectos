/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco
 */
public class colores {

    String color1;
    String color2;
    void color(){
         
        Inicializar();
        
    }
     private void Inicializar() {
        
        color1="";
        color2="";
    }
    public Vector Lista(){
        Vector al = new Vector();
        // Añadir elementos a un ArrayList
        al.add("Rojo");
        al.add("Azul");
        al.add("Negro");
        al.add("Verde");
        al.add("Amarillo");
        al.add("Blanco");
        return(al);
    } // Del mÈtodo 

    public void setAcademiaColor(String color1, String color2)
    {
        this.color1= color1;
        this.color2= color2;      
    }
    public String getColor(int turno){
        if(turno%2==0)
            return(this.color1);
        else
            return(this.color2);
        
    }

   
}
