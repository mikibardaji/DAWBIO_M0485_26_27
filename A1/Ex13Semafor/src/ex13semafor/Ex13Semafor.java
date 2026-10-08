/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex13semafor;

import java.util.Scanner;

/**
 * Desenvolupem un ajudant infantil per decidir què fer davant un semàfor. 
 * El programa demanarà de quin color està el semàfor (V-verd/T-Taronja/Roig-Aturar)
 * i segons la resposta recomanarà passar, esperar, o córrer.
 * @author mabardaji
 */
public class Ex13Semafor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("De quin color esta el semafor? V-verd/T-Taronja/R-Roig: ");
        char resposta = lector.next().charAt(0);
        
        /*if (resposta == 'V')
        {
            
        }
        else if (resposta == 'T')*/
        switch(resposta)
        {
            case 'V':
            case 'v':
                System.out.println("Verd - Pots passar");
                break;
            case 'T':
            case 't':    
                System.out.println("Taronja - Perill ");
                break;    
            case 'R':
            case 'r':
                System.out.println("Vermell  - No passis");
                break;
            default:
                System.out.println("Valor introduit incorrecte Correctes (V/R/T) " + 
                        resposta);
        }
            
    }
    
}
