/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosaleatoris;

import java.util.Random;

/**
 *
 * @author mabardaji
 */
public class NumerosAleatoris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Random rand = new Random();
        num = rand.nextInt();
        System.out.println("Numero: "+ num);
        
        //numero entre 0 y 3
        num = rand.nextInt(3); //el 0 esta inclos, el 3 no esta inclos
        System.out.println("Numero entre 0 y 3: " + num);
        
        //numero entre 5 y 10
        num = rand.nextInt(5,11);
        System.out.println("Numero entre 5 y 10: " + num);
        
        //aleatori amb decimals entre 0 y 1
        double decimals = rand.nextDouble();
        System.out.println("Amb Decimals: " + decimals);
        System.out.printf("Mostra dos decimals: %.2f", decimals); //per mostrar nomes dos decimals
        
        
        
        
    }
    
}
