/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7precioiva;

import java.util.Scanner;

/**
 *
 * Programa que pregunta a l’usuari preus d’articles fins que decideix no continuar 
 * (cal preguntar a cada iteració) 
 * i mostra el preu amb IVA (21 %). Implementa el mètode float preuAmbIva(float preu).
 */
public class Ex7PrecioIVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precio = pedirNumero("Cuanto cuesta sin iva: ");
        double precioConIVA = IVA(precio);
        //void mostrarResultado(precioConIVA)
        System.out.println("El precio con IVA es : " + precioConIVA);
    }
    
    public static double IVA(double precioSinIVA)
    {
        double precioIVA = precioSinIVA + (precioSinIVA*0.21);
        return precioIVA;
    }
    
    public static double pedirNumero(String frase)
    {
        double num;
        Scanner sc = new Scanner(System.in);
        System.out.print(frase);
        num = sc.nextDouble();
        
        return num;
    }     
}
