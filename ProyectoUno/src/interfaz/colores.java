/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Color;

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
