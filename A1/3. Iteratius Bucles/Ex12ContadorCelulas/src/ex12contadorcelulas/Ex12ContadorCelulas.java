/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex12contadorcelulas;

/**
 *
 * @author mabardaji
 */
public class Ex12ContadorCelulas {

    /**
     * Una cèl·lula es divideix en dues cada hora. Mostra quantes cèl·lules hi ha després de 1, 2, 3, ..., 10 hores.
Hora 1 ? 2 cèl·lules
Hora 2 ? 4 cèl·lules
Hora 3 ? 8 cèl·lules
     */
    public static void main(String[] args) {
        int acumCelulas=1;
        for (int horas = 1; horas <= 10; horas++) {
            acumCelulas = acumCelulas *2;
            System.out.println("Horas " + horas + " numero de celulas " + acumCelulas);
        }
        
        
    }
    
}
