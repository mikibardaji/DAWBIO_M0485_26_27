/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exempleformatexception;

/**
 *
 * @author mabardaji
 */
public class ExempleFormatException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto = "hola";
        
        try{
            int numero = Integer.parseInt(texto);
            System.out.println(numero);
        }catch(NumberFormatException e){
            System.out.println("El texto no es un numero");
        }
        

        

    }
    
}
