/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4randomdau;

import java.util.Random;

/**
 *
 * @author mabardaji
 */
public class Ex4RandomDau {

    /**
     * Fes un programa que simuli el llançament d’un dau de 6 cares.
Genera aleat?riament un número entre 1 i 6 i mostra el resultat.
A més:
    • Si surt un 6, mostra «Has tret un 6!».
    • Si surt un 1, mostra «Quina mala sort!».
    • En qualsevol altre cas, mostra «Resultat normal».
     */
    public static void main(String[] args) {
        final int NUM_CARES_MAXIM = 6;
        final int TIRADA_BUENA = 6;
        final int TIRADA_MALA = 1;
        Random rd = new Random();
        
        int tirada = rd.nextInt(1, NUM_CARES_MAXIM+1);
        
        switch (tirada) {
            case TIRADA_BUENA:
                System.out.println("Que suerte has sacado " + TIRADA_BUENA + "!!!");
                break;
            case TIRADA_MALA:
                System.out.println("Que mala suerte has sacado un " + TIRADA_MALA);
                break;
            default:
                System.out.println("Tirada normal " + tirada);
                break;
        }
    }
    
}
