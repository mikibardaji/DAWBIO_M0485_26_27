/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4signo;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex4Signo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
               
        num = pedirNumero("Pon un valor entero: ");
        
        int resultado = dimeSigno(num);
        
        mostrarResultado(resultado);
    }
    
    public static int pedirNumero(String frase)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print(frase);
        num = sc.nextInt();
        return num;
    }
    
    public static void mostrarResultado(int signo)
    {
        switch (signo) {
            case 1:
                System.out.println("El numero es positivo");
                break;
            case 0:
                System.out.println("El numero es 0");
                break;
            case -1:
                System.out.println("El numero es negativo");
                break;
            default:
                break;
        }
    }
    
    
    public static int dimeSigno(int num)
    {
        if (num>0)
        {
            return 1;
        }
        else if (num<0)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
