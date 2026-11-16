/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex11;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa que escriu la taula de multiplicació d’un número introduït per
 * teclat. Cal implementar un mètode que rebi com a paràmetre un enter i
 * imprimeixi la taula de multiplicació de l’enter rebut.
 *
 * @author mabardaji
 */
public class Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = demanaEnter();
        taulaDeMultiplicar(numero);
    }

    public static int demanaEnter() {
        Scanner scan = new Scanner(System.in);
        boolean ok = false;
        int num = 0;
        do {
            try {
                System.out.print("Escriu un numero enter: ");
                num = scan.nextInt();
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("No es un numero");
                scan.nextLine();
            }
        } while (!ok);

        return num;
    }
    
    public static void taulaDeMultiplicar(int num){
        int res;
        System.out.println("TAULA DEL " + num);
        for(int i=1; i<=10; i++){
            res= i*num;
            System.out.println(i + " x " + num + " = " + res);
        }
    }

 

}
