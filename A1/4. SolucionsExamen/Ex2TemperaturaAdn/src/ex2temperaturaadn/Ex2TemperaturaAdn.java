/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2temperaturaadn;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex2TemperaturaAdn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int adenina,guanina,timina,citosina, sumaTotal, temperatura;
        
        System.out.print("Quantes adenina tens? ");
        adenina = sc.nextInt();
        System.out.print("Quantes guanina tens? ");
        guanina = sc.nextInt();
        System.out.print("Quantes timina tens? ");
        timina = sc.nextInt();
        System.out.print("Quantes citosina tens? ");
        citosina = sc.nextInt();
        sumaTotal = adenina  + guanina + citosina + timina;
        if (sumaTotal!= 10)
        {
            System.out.println("Mostra no vàlida");
        }
        else
        {
            temperatura = (adenina + timina) * 2 + (citosina + guanina) * 4;
            if (temperatura<25)
            {
                System.out.println("Temperatura massa baixa. L'experiment fallarà.");
            }
            else if (temperatura >=25 && temperatura <=40)
            {
                System.out.println("Temperatura ?ptima per a la PCR.");
            }
            else
            {
                System.out.println("Temperatura massa alta. El DNA es degradarà.");
            }

        }
    }
    
}
