/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2funcions;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex2Funcions {

public static void main(String[] args) {
        // Creem l'objecte Scanner per llegir les dades de l'usuari
        Scanner scanner = new Scanner(System.in);

        // Demanem l'edat a l'usuari
        System.out.print("Introdueix la teva edat: ");
        int edat = scanner.nextInt();

        // Cridem al mètode i comprovem el resultat
        if (esMajorEdat(edat)) {
            System.out.println("Ets major d'edat.");
        } else {
            System.out.println("Ets menor d'edat.");
        }


    }

    /**
     * Mètode que indica si una edat correspon a la majoria d'edat (>= 18 anys).
     * 
     * @param edat L'edat a comprovar
     * @return true si és major o igual a 18, false en cas contrari
     */
    public static boolean esMajorEdat(int edat) {
        //return edat >= 18; <-- opciò correcta
        if (edat<18)
            {
                return false;
            }
        else
            {
                return true;
            }    
    }
    
}
