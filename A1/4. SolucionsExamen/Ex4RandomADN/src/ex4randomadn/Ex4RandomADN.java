/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4randomadn;

import java.util.Random;

/**
 *
 * @author mabardaji
 */
public class Ex4RandomADN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rd = new Random();
        int aleatori = rd.nextInt(1, 4);
        char nucleotid;
        
        if (aleatori==1)
        {
            nucleotid = 'A';
            System.out.println("Ha sortit.... " + nucleotid);
        }
        else if (aleatori==2)
        {
            nucleotid = 'T';
            System.out.println("Ha sortit.... " + nucleotid);
        }
        if (aleatori==3)
        {
            nucleotid = 'C';
            System.out.println("Ha sortit.... " + nucleotid);
        }
        else
        {
            nucleotid = 'G';
            System.out.println("Ha sortit.... " + nucleotid);
        }
        
        if ((nucleotid=='A') || (nucleotid == 'G') )
        {
            System.out.println("Es una purina");
        }
        else
        {
            System.out.println("Es una pirimidina ");
        }
        
        
    }
    
}
