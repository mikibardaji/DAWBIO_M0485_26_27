/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaexcepcions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class PracticaExcepcions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Introduce el primer número: ");
            int num1 = sc.nextInt();

            System.out.print("Introduce el segundo número: ");
            int num2 = sc.nextInt();

            int resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);
  
        }catch(InputMismatchException e){
            System.out.println(" No has escrito un entero");
        }catch(ArithmeticException e){
            System.out.println("Error dividir por 0");
         }
       


    }
    
}
