/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputmismatchexceptionexemple;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class InputMismatchExceptionExemple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        try{
            System.out.print("Introduce tu edad: ");
            int edad = scan.nextInt();
            System.out.println("Tu edad es:"+edad);
        }catch(InputMismatchException e){
            System.out.println("No has introducido un entero");
        }
        
        
        
        
    }
    
}
