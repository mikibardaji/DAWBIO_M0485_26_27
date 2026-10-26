/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1nucleotids;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex1Nucleotids {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quin nucleotids es ? ");
        char lletra = sc.next().charAt(0);
        switch (lletra) {
            case 'A':
            case 'a':                
                System.out.println("Adenina");
                break;
            case 'T':
            case 't':                
                System.out.println("Timina");
                break; 
               //falta les altres lletres
            default:
                System.out.println("lletra no valida: " + lletra);
        }
    }
    
}
