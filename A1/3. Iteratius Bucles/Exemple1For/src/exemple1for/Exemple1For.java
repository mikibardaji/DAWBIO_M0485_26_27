/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemple1for;

/**
 * Programa que escriu 100 vegades "No hablare en clase"
 * @author mabardaji
 */
public class Exemple1For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int NUM_VECES=100;
        for(int i=0;i<NUM_VECES;i++){
            System.out.println(i+"-No hablare en clase");
        }
        //con while
        
        int j=0;
        while(j<NUM_VECES){
            System.out.println(j+"-No hablare en clase");
            j=j+1;
        }
    }
    
}
