/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6pedrapapertisores;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex6PedraPaperTisores {

    /**
     * Demana a l’usuari que et demani si tria “pedra, paper o tisora”:
0: Pedra 	1:Paper	2:Tisora
Despres genera un numero aleatori entre 0 i 2 que simuli la tirada de l’ordinador. Mostra.-la per pantalla.
Mostra per pantalla qui ha guanyat:
     */
    public static void main(String[] args) {
        final int PIEDRA=0, PAPER = 1, TISORA=2;
        int tiradaUsuari, tiradaMaquina;
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("tria pedra(0), paper(1) o tisora(2): ");
        tiradaUsuari = sc.nextInt();
        
        tiradaMaquina = rd.nextInt(0, 3);
        if (tiradaMaquina == PIEDRA)
            {
                System.out.println("La maquina ha tret PIEDRA");
            }
        else if (tiradaMaquina == PAPER)
            {
                System.out.println("La maquina ha tret PAPER");
            }
        else
            {
                System.out.println("La maquina ha tret TISORA");
            }
        
        
        //si han tret
        if (tiradaMaquina == tiradaUsuari)
            {
                System.out.println("Empate");
            }
        else if ((tiradaUsuari == PIEDRA  && tiradaMaquina == TISORA)
               || (tiradaUsuari == TISORA  && tiradaMaquina == PAPER)
               || (tiradaUsuari == PAPER  && tiradaMaquina == PIEDRA))
            {
                System.out.println("Has guanyat");
            }
//        else if (tiradaUsuari == TISORA  && tiradaMaquina == PAPER)
//            {
//                System.out.println("Has guanyat");
//            }
//        else if (tiradaUsuari == PAPER  && tiradaMaquina == PIEDRA)
//            {
//                System.out.println("Has guanyat");
//            }
        else
        {
            System.out.println("Has perdido LOOOSER!!!");
        }
    }
    
}
