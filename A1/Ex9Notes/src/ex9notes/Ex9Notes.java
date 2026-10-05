/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9notes;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex9Notes {

    /**
     *     9. Programa que llegeix una qualificació numèrica decimal 
     * x entre 0 i 10 i la transforma en qualificació alfabètica, ç
     * escrivint-ne el resultat.
    • 0<=x<3 Molt Deficient
    • 3<=x<5 Insuficient
    • 5<=x<6 Suficient
    • 6<=x<7 Bé
    • 7<=x<9 Notable
    • 9<=x<=10 Excel·lent
     */
    public static void main(String[] args) {
        double nota;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quina nota has tret? ");
        nota = sc.nextDouble();
        
        if (nota >= 0 && nota<3)
        {
            System.out.println("Molt deficient");
        }
        else if(nota>= 3 && nota < 5)
        {
            System.out.println("Suspes");
        }
        else if(nota>= 5 && nota < 6)
        {
            System.out.println("Suficient");
        }
        else if(nota>= 6 && nota < 7)
        {
            System.out.println("Bé");
        }
        else if(nota>= 7 && nota < 9)
        {
            System.out.println("Notable");
        }
        if(nota>= 9 && nota < 10)
        {
            System.out.println("Excelent");
        }
        else
        {
            System.out.println("Valor no correcte ha d'estar entre 0 i 10");
        }
    }
    
}
