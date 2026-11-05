/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caixaregistradorexceptions;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class CaixaRegistradorExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preu=0, preuAcum=0;
        String precioString;
        
        try
        {
            do
            {
               // try
               // {
                    System.out.print("Pon el precio del producto lo registro en la caja: ");
                    precioString = sc.nextLine();
                    preu = Double.parseDouble(precioString);
                    preuAcum = preuAcum + preu;
                    System.out.println("Por ahora gastado: " + preuAcum);
    //            }catch(NumberFormatException ex)
    //            {
    //                System.err.println("Error de format. Operació cancel·lada per seguretat");
    //                preu = 0;
    //                //break;
    //            }

            }while(preu!=0);
         }catch(NumberFormatException ex)
            {
                System.err.println("Error de format. Operació cancel·lada per seguretat");

            }
        System.out.println("Total gastado: " + preuAcum);
    }
    
}
