/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicisrandom;

import java.util.Random;
import java.util.Scanner;

/**
 * Endevina el número entre 1 y 10
 * @author mabardaji
 */
public class ExercicisRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        // Generem aleatori
        Random rand = new Random();
        int numComp = rand.nextInt(1, 11);
        System.out.println("Numero generat!! ");
        
        //demanem numero a l'usuari
        System.out.print("Endevina numero (del 1 al 10):");
        int numUsr = scan.nextInt();
        
        if(numComp == numUsr){
            System.out.println("Has encertat!!");
        }else if(numComp>numUsr){
            System.out.println("El numero es mes gran");
        }else if(numComp<numUsr){
            System.out.println("T'has passat!!");
        }
        
    }
}
