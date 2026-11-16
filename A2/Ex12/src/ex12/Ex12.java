/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex12;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa que demana a l’usuari un preu sense i amb descompte i informa del 
 * percentatge de descompte que s’hi ha aplicat. Cal crear un mètode que rebi 
 * els preus i retorni el percentatge de descompte.
 * @author mabardaji
 */
public class Ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Preu sense descompte: ");
        double preuSenseDescompte = demanaPreu();
        System.out.print("Ara escriu el preu amb descompte: ");
        double preuAmbDescompte = demanaPreu();
        calculaDescompte(preuSenseDescompte, preuAmbDescompte);
        
    }
    
    public static double calculaDescompte(double preuSense, double preuAmb){
        double descompte;
        descompte = ((preuSense-preuAmb)/preuSense)*100;
        System.out.println("Decompte: "+descompte);
        return descompte;
    }
    
    public static double demanaPreu() {
        Scanner scan = new Scanner(System.in);
        boolean ok = false;
        double num = 0;
        do {
            try {
                System.out.print("Preu: ");
                num = scan.nextDouble();
                scan.nextLine();
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("No es correcte");
                scan.nextLine();
            }
        } while (!ok);

        return num;
    }
}
