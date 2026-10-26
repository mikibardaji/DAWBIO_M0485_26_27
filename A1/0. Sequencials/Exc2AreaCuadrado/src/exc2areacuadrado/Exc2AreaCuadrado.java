/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exc2areacuadrado;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Exc2AreaCuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double lado, areaCuadrado;
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuanto vale el lado del cuadrado(cm)? ");
        lado = sc.nextDouble();
        areaCuadrado = lado * lado;
        System.out.println("El area del cuadrado es " + areaCuadrado + " cm^2");
    }
    
}
