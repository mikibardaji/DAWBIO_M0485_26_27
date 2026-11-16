/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10dates;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class EX10Dates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //entrada datos
        int any,mes,dia;
        //entrada datos per funcio
        any = introdueixData("Introdueix any: ");
        mes = introdueixData("Introdueix mes: ");
        dia = introdueixData("Introdueix dia: ");
        //System.out.println("2012, 4, 31 " + validarFecha(2012, 4, 31));
        //sortida del programa
        if (validarFecha(any, mes, dia)) //validarFecha(2012, 4, 31)==true)
        {
            System.out.println("Data correcta");
        }
        else
        {
            System.out.println("Data introduida incorrecta");
        }
    }
    
    
    public static int introdueixData(String frase)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(frase);
        int dato = sc.nextInt();
        return dato;
    }
 
    
    public static boolean validarFecha(int any, int mes, int dia)
    {
        if (any<0)
        {
            return false;
        } //si passa aqiuet if, la data POT SER CORRECTA
        if (mes>12 || mes < 1)
        {
            return false;
        }
        if (dia> 31 || dia < 1)
        {
            return false;
        }
        if (mes==2 && dia<=28)
        {
            return true;
        }
        if ((mes==1 || mes ==3 || mes ==5 || mes==7 || mes ==8 || mes ==10 || mes==12)
                && dia <=31)
        {
            return true;
        }
        if ((mes==4 || mes ==6 || mes ==9 || mes ==11)
                && dia <=30)
        {
            return true;
        }
        
        return false;
            
    }
    
}
