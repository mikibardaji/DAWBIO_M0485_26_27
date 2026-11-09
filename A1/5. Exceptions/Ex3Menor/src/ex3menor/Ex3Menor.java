/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3menor;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex3Menor {

    /**
     * Programa que demana a l’usuari dos números enters i mostra quin és el menor.
     * Cal implementar i usar el mètode int menor(int x, int y), el qual retorna el menor dels dos passats com a paràmetres.
     */
    public static void main(String[] args) {
        int n1,n2, maspequenyo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el primer numero");
        n1 = sc.nextInt();
        System.out.println("Dime el segundo numero");
        n2 = sc.nextInt();
        maspequenyo = menor(n1, n2);
        System.out.println("Valor mas pequeño es " + maspequenyo);
    }
    
    public static int menor(int x, int y)
    {
        if (x>y)
        {
            return y;
        }
        else
        { //igual es valido porque X 
            return x;
        }
    }
    
}
