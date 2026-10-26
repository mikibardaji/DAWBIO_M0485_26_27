/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4areacirculo;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex4AreaCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;
        double longitudCircunferencia, areaCirculo, radio;
        
        System.out.println("Dime el radio de la circunferencia");
        radio = sc.nextDouble();
        
        longitudCircunferencia = PI * radio * radio;
        areaCirculo = (double) (PI * radio) /5;
        System.out.println("La longitud de la circunferencia es " + longitudCircunferencia);
        System.out.println("El area de la circunferencies es " + areaCirculo);
    }
    
}
