/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5millas;

import java.util.Scanner;

/**
 *
 * Programa que demana a l’usuari una distància 
 * mesurada en milles i 
 * mostra el seu equivalent en quil?metres (1 milla = 1,6093 km). 
 * Ha d’implementar un mètode amb el prototip 
 * double millesAKm(int milles).
 */
public class Ex5Millas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int millas;
        double conversionKm;
        millas = pedirNumero("Cantidad millas a km: ");
        conversionKm = millasAkm(millas);
        
        //funcion mostrar REsultado
        System.out.println("a km son " + conversionKm);
        
    }

    public static int pedirNumero(String frase)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print(frase);
        num = sc.nextInt();
        return num;
    }    
    public static double millasAkm(int millas)
    {
        double resultado = millas * 1.6083;
        return resultado;
    }
}
