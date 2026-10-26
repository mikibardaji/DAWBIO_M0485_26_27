/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemple2while;

import java.util.Random;

/**
 * programa que tiri un dau fins que surti 6 y compti el numero de tirades
 * @author mabardaji
 */
public class Exemple2While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Tirem el dau:");
        int tirada = rand.nextInt(1,7);
        int contador =1;
        
        while(tirada!=6){
            System.out.println("Tirada: "+tirada);
            //hem de tornar a tirar
            tirada = rand.nextInt(1,7);
            contador = contador+1;
        }
        System.out.println("Ultima tirada: "+tirada);
        System.out.println("Numero tirades: "+contador);
        
    }
    
}
