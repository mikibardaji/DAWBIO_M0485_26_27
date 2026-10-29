/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exbuclesexceptions;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExBuclesExceptions {

    /**
     * Escriu un programa en Java que demani a l'usuari que introdueixi per consola la nota final d'un examen (un nombre sencer entre 0 i 10).
 
Per demanar el numero, no ho farem amb nextInt(), s'ha de demanar amb nextLine i transformar el String  amb  la instrucció Integer.parseInt(entrada)
 
El programa ha de complir els següents requisits:
Ús d'un bucle: El programa demanar nota fins que  l'usuari introdueixi un valor vàlid.
Captura d'excepcions: Si l'usuari introdueix un text que no es pot convertir a un nombre sencer (ex.,  "excel·lent" o "vuit"), el programa ha de capturar l'excepció NumberFormatException (o InputMismatchException), mostrar un missatge d'error per pantalla ("Error: Has d'introduir un nombre sencer.") i tornar a demanar la nota.
Validació del rang: Si l'usuari introdueix un nombre fora del rang (el programa ha de mostrar ("La nota ha d'estar entre 0 i 10.") i continuar demanant-la.
Finalització: Quan la nota sigui un nombre sencer correcte i estigui dins del rang, el bucle acaba i surt : "Nota registrada correctament: [nota].
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota=-1; 
        String numeroString;
        boolean notaValida = false;
        do
        {
            try
            {
                System.out.print("Quina nota has tret: ");
                numeroString = sc.nextLine();
                nota = Integer.parseInt(numeroString);
                if (nota < 0 || nota > 10)
                {
                    System.out.println("La nota te que estar entre 0 i 10");
                    //notaValida = false;
                }
                else
                { //nota correcta 
                    notaValida = true;
                }
            }
            catch(NumberFormatException ex)
            {
                System.out.println("Tens que introduir un numero (entre 0 i 10), no un text");
            }
            
        }while(!notaValida); //lo mismo que poner }while(notaValida==false);       
        System.out.println("Nota registrada correctament: " + nota);
    }
    
}
