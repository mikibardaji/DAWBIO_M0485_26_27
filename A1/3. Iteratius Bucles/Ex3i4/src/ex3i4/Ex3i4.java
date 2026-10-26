/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3i4;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex3i4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un valor");
        int N = sc.nextInt();
        
//        for (int i = 2; i <= N; i = i+2) {
//            System.out.println("numero " + i);
//        }
//        int i = 2;
//        while(i<=N)
//        {
//            System.out.println("numero " + i);
//            i = i+2;
//        }
//        
//        i = 2;
//        
//        
//        do{
//            System.out.println("numero " + i);
//            i = i+2;
//        }while(i<=N);
            System.out.println("Contador de unon en uno ");
            for (int i = 1; i <= N; i++) {
                if ((i%2)==0) //residuo 0 por tanto es divisible entre su divisor
                {
                    System.out.println("numero " + i);
                }
                //else no per
            
        }
        
    }
    
}
