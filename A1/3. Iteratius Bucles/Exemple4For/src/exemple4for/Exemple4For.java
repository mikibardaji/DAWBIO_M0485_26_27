/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemple4for;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Exemple4For {

    /**
     * demanar 5 numeros 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int num;
        
        for(int i=1; i<=5;i++){
            System.out.print(i+".-Escriu un numero: ");
            num = scan.nextInt();   
        }
        
        
        
    }
    
}
