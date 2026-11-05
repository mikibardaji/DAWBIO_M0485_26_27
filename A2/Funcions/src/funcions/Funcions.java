/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcions;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Funcions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //sin parametros, sin retorno de valor
        imprimeHolaMundo();
        
        //pasamos un parametro
        String nom = "Ramon";
        imprimeHolaNombre("Profe");
        imprimeHolaNombre(nom);
        
        //pasem valor y guardem el valor retornat en una variable
        int a = doble(10);
        System.out.println("Doble: "+a);
        int b = multiplica (2,6);
        System.out.println("Multiplica: "+b);
        System.out.println("Multiplica: "+multiplica(5,3));
        
        //pasando varios valores
        double maximo = maximo(6,9);
        
        //pueen combinarse funciones
        int c = doble(4) + multiplica(2,10);
        System.out.println("Combinado: "+c);
        System.out.println("12 por 12 son "+multiplica(12,12));
        
        //pido el valor por teclado antes de la funcion
        System.out.print("Dime un numero:");
        int d = scan.nextInt();
        System.out.println("El doble es: "+ doble(d));
        
        
        
       
    }
    
    public static void imprimeHolaMundo(){
        System.out.println("Hola Mundo!");
    }
    
    public static void imprimeHolaNombre(String nombre){
        System.out.println("Hola "+ nombre);
    }
    
    public static int doble(int a){
        int res = a * 2;
        return res;
    }
    
    public static int multiplica(int a, int b){
        int res = a * b;
        return res; 
    }
    
    public static double maximo (double valor1, double valor2){
        double max;
        if(valor1>valor2){
            max = valor1;
        }else{
            max = valor2;
        }
        return max;
    }
}
