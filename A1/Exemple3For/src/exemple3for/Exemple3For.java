/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemple3for;

import java.util.Scanner;

/**
 * Es demana un numero i es fa la taula de multiplicar d'aquell numero
 * @author mabardaji
 */
public class Exemple3For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tabla;
        int res;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Que tabla quieres mostrar:");
        tabla = scan.nextInt();
        
        System.out.println("TAULA DEL "+tabla);
        for(int i=0; i<=10;i++){
            res = tabla*i;
            System.out.println(tabla + " x " + i + " = " + res);
        }
    }
    
}
