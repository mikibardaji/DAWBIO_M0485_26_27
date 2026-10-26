/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exempledowhile;

import java.util.Scanner;

/**
 * Fem un menu d'un caixer automatic que ens deixi: Ingresar diners / Treure Diners / Veure saldo / Sortir
 * @author mabardaji
 */
public class ExempleDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcio;
        Scanner scan = new Scanner(System.in);
        do{
            //Instruccions del bucle
            System.out.println("MENU");
            System.out.println("1-Ingresar Diners");
            System.out.println("2-Treure diners");
            System.out.println("3-Veure saldo");
            System.out.println("0-Sortir");
            System.out.println("Tria una opcio: ");
            opcio = scan.nextInt();
            
        }while(opcio!=0);
    }
    
}
