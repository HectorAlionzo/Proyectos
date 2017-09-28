/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author Francisco
 */
public class Verificacion {
    int[][] matriz = {{0,0,0},{0,0,0},{0,0,0}};
    public void verificarPeligro(int jugador, int[][] matriz) {
        
        ////Fila 1       
        if(matriz[0][0]==jugador && matriz[0][1]==jugador && matriz[0][2]==0){
            JOptionPane.showMessageDialog(null, "Casilla de peligro 0,2");
        }
        if(matriz[0][0]==jugador && matriz[0][2]==jugador && matriz[0][1]==0){
            JOptionPane.showMessageDialog(null, "Casilla de peligro 0,1");
        }
        if(matriz[0][1]==jugador && matriz[0][2]==jugador && matriz[0][1]==0){
            JOptionPane.showMessageDialog(null, "Casilla de peligro 0,0");
        }
        
        ////Fila2
        if(matriz[1][0]==jugador && matriz[1][1]==jugador && matriz[1][2]==0){
            JOptionPane.showMessageDialog(null, "Casilla de peligro 1,2");
        }
        if(matriz[1][0]==jugador && matriz[1][2]==jugador && matriz[1][1]==0){
            JOptionPane.showMessageDialog(null, "Casilla de peligro 1,1");
        }
        if(matriz[1][1]==jugador && matriz[1][2]==jugador && matriz[1][0]==0){
            JOptionPane.showMessageDialog(null, "Casilla de peligro 1,0");
        }
        
        ////Fila3
        if(matriz[2][0]==jugador && matriz[2][1]==jugador && matriz[2][2]==0){
            JOptionPane.showMessageDialog(null, "Casilla de peligro 2,2");
        }
        if(matriz[2][0]==jugador && matriz[2][2]==jugador && matriz[2][1]==0){
            JOptionPane.showMessageDialog(null, "Casilla de peligro 2,1");
        }
        if(matriz[2][1]==jugador && matriz[2][2]==jugador && matriz[2][0]==0){
            JOptionPane.showMessageDialog(null, "Casilla de peligro 2,0");
        }
        
        ////Columna 1
        if(matriz[0][0]==jugador && matriz[1][0]==jugador && matriz[2][0]==0){
            JOptionPane.showMessageDialog(null, "Casilla de peligro 2,0");
        }
        if(matriz[0][0]==jugador && matriz[2][0]==jugador && matriz[1][0]==0){
            JOptionPane.showMessageDialog(null, "Casilla de peligro 1,0");
        }
        if(matriz[1][0]==jugador && matriz[2][0]==jugador && matriz[0][0]==0){
            JOptionPane.showMessageDialog(null, "Casilla de peligro 0,0");
        }
        
        ////Columna 2
        if(matriz[0][1]==jugador && matriz[1][1]==jugador && matriz[2][1]==0){
            JOptionPane.showMessageDialog(null, "Casilla de peligro 2,1");
        }
        if(matriz[0][1]==jugador && matriz[2][1]==jugador && matriz[1][1]==0){
            JOptionPane.showMessageDialog(null, "Casilla de peligro 1,1");
        }
        if(matriz[1][1]==jugador && matriz[2][1]==jugador && matriz[0][1]==0){
            JOptionPane.showMessageDialog(null, "Casilla de peligro 0,1");
        }
        
        //Columna 3
        if(matriz[0][2]==jugador && matriz[1][2]==jugador && matriz[2][2]==0){
            JOptionPane.showMessageDialog(null, "Casilla de peligro 2,2");
        }
        if(matriz[0][2]==jugador && matriz[2][2]==jugador && matriz[1][2]==0){
            JOptionPane.showMessageDialog(null, "Casilla de peligro 1,2");
        }
        if(matriz[1][2]==jugador && matriz[2][2]==jugador && matriz[0][2]==0){
            JOptionPane.showMessageDialog(null, "Casilla de peligro 0,2");
        }
        
        ////Diagonal
        if(matriz[0][0]==jugador && matriz[1][1]==jugador && matriz[2][2]==0){
            JOptionPane.showMessageDialog(null, "Casilla de peligro 2,2");
        }
        if(matriz[2][2]==jugador && matriz[1][1]==jugador && matriz[0][0]==0){
            JOptionPane.showMessageDialog(null, "Casilla de peligro 0,0");
        }
        
        ////Diagonal
        if(matriz[0][2]==jugador && matriz[1][1]==jugador && matriz[2][0]==0){
            JOptionPane.showMessageDialog(null, "Casilla de peligro 2,0");
        }
        if(matriz[2][0]==jugador && matriz[1][1]==jugador && matriz[0][2]==0){
            JOptionPane.showMessageDialog(null, "Casilla de peligro 0,2");
        }
    }
    
}
