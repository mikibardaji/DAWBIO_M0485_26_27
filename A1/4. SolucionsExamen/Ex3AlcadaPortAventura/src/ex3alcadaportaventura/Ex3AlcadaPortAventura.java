/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3alcadaportaventura;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex3AlcadaPortAventura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double alcada;
        System.out.print("Quina alçada tens? ");
        alcada = sc.nextDouble();
        
        
        if (alcada>0 && alcada<1.00)
        {
            System.out.println("no pot pujar.");
        }
        else if (alcada>=1.00 && alcada <= 1.19)
        {
            System.out.println("pot pujar acompanyat d'un adult.");
        }
        //la resta
        else if (alcada <= 0){
            System.out.println("Alçada no pot ser negatiu");
            
        }
    }
    
    
}
