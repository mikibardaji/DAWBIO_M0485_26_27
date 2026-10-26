/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionalmultiple;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class CondicionalMultiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcio;
        int result;
        Scanner scan = new Scanner(System.in);
        
        //demano 2 numeros
        System.out.print("Numero1: ");
        int num1 = scan.nextInt();
        System.out.print("Numero2: ");
        int num2 = scan.nextInt();
        
        //Mostro menu
        System.out.println("MENU");
        System.out.println("1.-Fer suma");
        System.out.println("2.-Fer resta");
        System.out.println("3.-Fer divisio");
        System.out.println("4.-Multiplicacio");
        System.out.println("Opcio: ");
        opcio=scan.nextInt();
        
        switch(opcio){
            case 1: 
                System.out.println("SUMA");
                result= num1 + num2;
                System.out.println("Total: "+result);
                break;
            case 2:
                System.out.println("RESTA");
                result=num1-num2;
                System.out.println("Total: "+result);
                break;
            case 3:
                System.out.println("DIVISIO");
                result = num1/num2;
                System.out.println("Total: "+result);
                break;
            case 4:
                System.out.println("MULTIPLICA");
                result = num1*num2;
                System.out.println("Total: "+result);
                break;
            default:
                System.out.println("opcio no valida");
            
        }
    }
    
}
