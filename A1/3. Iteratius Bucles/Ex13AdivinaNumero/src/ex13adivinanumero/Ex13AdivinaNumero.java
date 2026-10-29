/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex13adivinanumero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex13AdivinaNumero {

    /**
     * Programa on l’ordinador pensa un número (aleatòriament) entre 1 i 100 
     * i l’usuari intenta endevinar-lo. 
     * El programa demanarà de forma iterativa a l’usuari 
     * que entri números i indicarà si el número a endevinar 
     * és més gran o més petit. El programa acaba quan l’usuari endevina el número 
     * i s’haurà de mostrar el nombre d’intents que s’han utilitzat.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rd = new Random();
        int intents = 0;
        int numJugador;
        
        System.out.println("L'ordinador pensara un numero....");
        //el random pensa un numero del 1 al 100
        int numOrdinador = rd.nextInt(1,101);
        //el mostra (fase desarrollo
        System.out.println("Ja hi ha numero ("+numOrdinador+")");
        
        //inici bucle
        do{
            //demanar el numero
            System.out.println("Endevina el numero entre 1 y 100:");
            numJugador = scan.nextInt();

            //si el numero es mes gran que el random decir
            // que es mas grande
            if(numJugador>numOrdinador){
                System.out.println("El teu numero es mes gran, torna a intentar..");
            }else if(numJugador<numOrdinador){
                System.out.println("El teu numero es mes petit, torna a intentar");
            }else{
                System.out.println("Has encertat!!!!");
            }
            intents++;      
        }while(numOrdinador!=numJugador);
        
        System.out.println("Molt Be, has utilitzat "+intents+" intents");
              
    }
    
}
