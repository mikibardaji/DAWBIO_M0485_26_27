/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1iteratiu;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex1Iteratiu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int globul;
        for(int i=1;i<=10;i++){
            System.out.println("Mostrant globul " +(i));
        }
        
        globul=1;
        while(globul<=10){
            System.out.println("Mostrant globul "+(globul));
            globul++;
        }
    }
    
}
