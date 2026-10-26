/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex8suspesaprovat;

import java.util.Scanner;

/**
 * Programa que demani dues notes d’una assignatura (amb decimals). 
 * Si alguna de les dues es mes petita que 5 ha de sortir el text 
 * «Has d’anar a segona convocatoria». 
 * Si no ha de dir «Felicitats, modul superat»
 * @author mabardaji
 */
public class Ex8SuspesAprovat {

    /** Demana dues notes i si una es menor que 5 diu que has d'anar a segona convocatoria
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double nota1, nota2;
        Scanner teclado = new Scanner(System.in);
        
        //demanem les 2 notes
        System.out.println("Nota A1?");
        nota1 = teclado.nextDouble();
        System.out.println("Nota A2?");
        nota2= teclado.nextDouble();
        
        //fem la comparacio
        /*
        if(nota1>=5 && nota2>=5){
            System.out.println("Aprovado");
        }else{
            System.out.println("Suspendido");
        }
        */
        if(nota1<5 || nota2<5){
            System.out.println("Has d'anar a segona convocatoria");
        }else{
            System.out.println("Aprovado");
        }
        
        
        
    }
    
}
