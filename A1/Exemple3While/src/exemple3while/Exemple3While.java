/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemple3while;

import java.util.Scanner;

/**
 * Programa que demana un numero negatiu (si no torna a demanar fins que el posis be)
 * @author mabardaji
 */
public class Exemple3While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int numero;
        
        System.out.println("AMB WHILE");
        System.out.print("Escriu un número enter NEGATIU: ");
        numero = scan.nextInt();
        
        //BUCLE WHILE
        while(numero>=0){
            System.out.println("El numero no es negatiu");
            System.out.print("Escriu un numero NEGATIU: ");  
            numero = scan.nextInt();
        }
        System.out.println("Has escrit un numero negatiu ("+numero+")");
        
        System.out.println("----------------");
        System.out.println("ARA AMB DO-WHILE");
        
        int numero2;
        
        do{
            System.out.println("Escriu numero negatiu: ");
            numero2=scan.nextInt();
        }while(numero2>=0);
        
        System.out.println("Has escrit un numero negatiu ("+numero2+")"); 
         
    }
    
}
