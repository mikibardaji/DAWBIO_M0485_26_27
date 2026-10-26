/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notes;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Notes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        //demanem un nom
        System.out.println("Digues el teu nom: ");
        String nom = lector.next();
        System.out.println("El teu nom es: "+nom);  
        
        //demanem una lletra
        System.out.println("Posa la nota (A/B/C/D/E/F):");
        char qualificacio = lector.next().charAt(0);
        
        switch(qualificacio){
            case 'A': 
                System.out.println("Excel·lent!");
                break;
            case 'B':
            case 'C':
                System.out.println("Be!");
                break;
            case 'D':
                System.out.println("Aprovat");
                break;
            case 'E':
                System.out.println("Insuficient :(");
                break;
            case 'F':
                System.out.println("Molt malament!!!");
                break;
            default:
                System.out.println("Qualificacio no valida");            
        }
        
        
        
        
        
    }
    
}
