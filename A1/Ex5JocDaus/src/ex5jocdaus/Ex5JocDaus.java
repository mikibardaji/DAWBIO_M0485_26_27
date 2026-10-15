/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5jocdaus;

import java.util.Random;
import java.util.Scanner;

/**
 *Simula un joc de dos daus. Genera aleatoriament dos números entre 1 y 6.
El programa et demanarà quants diners vols apostar.
    • Si la suma dels dos numeros es 7 guanyaràs el mateix que has apostat. Mostra: “Bravo! Has guanyat X euros” (canvia la X pel valor aconseguit)
    • Si els dos numeros son iguals tornarà a tirar un altre cop:
        ? Si torna a sortir un doble (dos numeros iguals) guanyes el triple que has apostat. Mostra: “COMBO! Tripliques ganacies, has guanyat X euros”
        ? Qualsevol altre resultat guanyes el doble. Mostra “Has doblat el valor: guanyes X euros”
    • Si no la suma no es 7 ni es un doble mostra: “Has perdut l’aposta”.
 */
public class Ex5JocDaus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int NUM_CARES_MAXIM = 6;
        final int TIRADA_BUENA = 7;
        int diners, dau1, dau2, suma;
        Scanner sc = new Scanner(System.in);
        
        Random rd = new Random();
        System.out.print("Que quieres apostar? ");
        diners = sc.nextInt();
        dau1 = rd.nextInt(1, NUM_CARES_MAXIM+1);
        dau2 = rd.nextInt(1, NUM_CARES_MAXIM+1);
        
        suma = dau1 + dau2;
        System.out.println("dau1 : " + dau1 + " dau2: " + dau2);
        
        if (suma == TIRADA_BUENA)
            {
                System.out.println("has tret 7 has guayat" + diners + " euros ");
            }
        else if(dau1==dau2)
            { //torno a tirar
                dau1 = rd.nextInt(1, NUM_CARES_MAXIM+1);
                dau2 = rd.nextInt(1, NUM_CARES_MAXIM+1);
                System.out.println("SEGONA TIRADA => dau1 : " + dau1 + " dau2: " + dau2);
                if (dau1==dau2)
                {
                    System.out.println("has guanyat el triple " + (diners*3) + " euros ");
                }
                else
                {
                    System.out.println("has guanyat el doble " + (diners*2) + " euros ");
                }
            }
        else
            {
                System.out.println("has perdut " + diners + " euros ");
            }
        
        
    }
    
}
