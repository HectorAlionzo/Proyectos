/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extras;

import interfaz.Verificacion;

/**
 *
 * @author Lenovo
 */
public class Metodo {

    /**
     * @param args the command line arguments
     */
int [][] matriz = {{0,0,0},
                   {0,1,0},
                   {0,0,0}} ; 
    
//    public void Llamar(int a,int b)
    public void Llamar(int [][]a)

    {
        //return matriz[][] = a; 
        //matriz[i][j]=jugador;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matriz[i][j] = a[i][j];
                System.out.print(matriz[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    
    public static void main(String[] args) {
       Metodo llam = new Metodo();
      //System.out.println(llam.Llamar(0, 0));
      int [][] matriz = {{1,0,0},
                         {1,2,2},
                         {0,0,0}};
      llam.Llamar(matriz);
      Verificacion ver=new Verificacion();
      ver.verificarPeligro(1, matriz);
       //llam.llenar(1, 0,0);
    }
}
