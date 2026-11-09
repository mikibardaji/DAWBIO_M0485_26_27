/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9majorde3numeros;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa que demana tres nombres enters i diu quin és el valor més gran. 
 * Implementar un mètode amb el prototip int major(int x, int y) 
 * que retorni el valor major de dos.
 * 
 */
public class Ex9Majorde3Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2,n3, grande, maximo;
        n1 = pedirNumero("Pon el primer numero:");
        n2 = pedirNumero("Pon el segundo numero: ");
        n3 = pedirNumero("Pon el tercer numero:");
        
        
        grande = mayor(n1, n2);
        //grande = mayor(grande, n3);
        maximo = mayor(grande, n3);
        
        System.out.println("El numero más grande es " + maximo);
    }
    
    
    /**
     * me devuelva el numero siempre que sea positivo
     * si no sigue pidiendo numero
     * @param frase
     * @return 
     */
    public static int pedirNumero(String frase)
    {
        int num=0;
        Scanner sc = new Scanner(System.in);
        boolean valido=false;
        do
        {
            try
            {
                System.out.print(frase);
                num = sc.nextInt();
                if (num>0)
                {
                    valido = true;
                }
//                else
//                {
//                    valido = false;
//                }
            }
            catch (InputMismatchException ex)
            {
                System.out.println("Debes poner un numero");
                valido=false;
            }
        }while(valido==false); //}while(!valido);

        return num;
    }
    
    public static int mayor(int x, int y)
    {
        if (x>y)
        {
            return x;
        }
        else
        {
            return y;
        }
    } 
}
