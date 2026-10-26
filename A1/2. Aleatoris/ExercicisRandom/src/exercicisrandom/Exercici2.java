/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisrandom;

import java.util.Random;

/**
 * Cara o creu. 0 es cara y 1 es creu
 * @author mabardaji
 */
public class Exercici2 {
    public static void main(String[] args) {
        //Generem un numero aleatori entre 0 y 1
        Random rand = new Random();
        int moneda = rand.nextInt(2);
        
        //imprimo valor cara o cruz
        if(moneda==0){
            System.out.println("Cara");
        }else{
            System.out.println("Cruz");
        }
        
    }
}
