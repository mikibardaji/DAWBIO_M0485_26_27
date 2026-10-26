/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diadelasetmana;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class DiaDeLaSetmana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        System.out.println("Entra dia de la setmana:");
        int dia =lector.nextInt();
        
        switch(dia){
            case 1: 
                System.out.println("Ohh, avui es dilluns");
                break;
            case 2:
                System.out.println("Dimarts");
                break;
            case 3:
                System.out.println("Dimecres, anem per la meitat");
                break;
            case 4:
                System.out.println("Els dijous son els nous divendres");
                break;
            case 5:
                System.out.println("Per fi es divendres!!");
                break;
            case 6:
                System.out.println("Dissabte, festa festa festa!");
                break;
            case 7:
                System.out.println("Diumenge, tot lo bo s'acaba");
                break;
            default:
                System.out.println("Numero no valid");
        }
    }
    
}
