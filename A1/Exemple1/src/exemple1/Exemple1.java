/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemple1;

import java.util.Scanner;

/**
 * Llegeix una distància en milles marines i la converteix a metres.
 * @author mabardaji
 */
public class Exemple1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       final double MILLES_A_METRES = 1852; //factor conversio CONSTANT
       //definir constante MILLES_A_METRES = 1852
       double distanciaEnMilles, distanciaEnMetres;
       //int num=0; variable
       Scanner lector = new Scanner(System.in);
        //llegir distància en milles
        System.out.println("Quantes milles son?"); //MOSTRAR "Quantes milles son?"
        distanciaEnMilles = lector.nextDouble(); //Esperar DistanciaEnMilles  
        distanciaEnMetres = distanciaEnMilles*MILLES_A_METRES; 
        //CALCULAR distanciaEnMetres = distanciaEnMilles*1852;
        
        System.out.println("Aixo son " + distanciaEnMetres +" metres"); //MOSTRAR "Aixo son " + distanciaEnMetres +" metres"

        distanciaEnMilles = 4000;
        distanciaEnMetres = distanciaEnMilles*MILLES_A_METRES;
        System.out.println("Aixo son " + distanciaEnMetres +" metres");
    }
    
}
