/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplesif;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExemplesIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edat;
        Scanner scan = new Scanner(System.in);
        System.out.println("Diguem la teva edat: ");
        edat = scan.nextInt();
        
        if(edat>=0 && edat<150){
            if(edat>=67){
                System.out.println("Estas jubilat/da");
            }else{
                System.out.println("No estas jubilat/da");
            }
        }else{
            System.out.println("Edat no valida");
        }
        
        System.out.println("Final del programa");
        
    }
    
}
