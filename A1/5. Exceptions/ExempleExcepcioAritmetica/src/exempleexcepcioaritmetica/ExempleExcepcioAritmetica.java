/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exempleexcepcioaritmetica;

/**
 *
 * @author mabardaji
 */
public class ExempleExcepcioAritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            int result = a/b;
            System.out.println("Resultado: "+result);
        }catch(ArithmeticException e){
            System.out.println("Error al dividir por 0");
        }
        
    }
    
}
