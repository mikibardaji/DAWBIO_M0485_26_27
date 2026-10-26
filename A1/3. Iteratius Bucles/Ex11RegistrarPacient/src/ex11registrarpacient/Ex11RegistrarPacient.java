/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex11registrarpacient;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex11RegistrarPacient {

    /**
     *     11. El programa demana el nom d’un pacient i la seva temperatura corporal.
Ha de comprovar que la temperatura sigui numèrica i raonable, és a dir, entre 30 °C i 45 °C (ambdós inclosos).
Si la temperatura introduïda no és vàlida, el programa la torna a demanar fins que ho sigui.
Finalment, mostra un missatge amb el nom del pacient i la temperatura validada.
Exemple de sortida:
Introdueix el nom del pacient: Marc
Introdueix la temperatura corporal: 12
Temperatura no vàlida. Torna-ho a provar.
Introdueix la temperatura corporal: 37.2
Pacient registrat: Marc, 37.2 °C
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        double temperatura;
        
        System.out.print("Pon nombre paciente: ");
        nombre = sc.nextLine();
        do{
            System.out.print("Pon temperatura paciente: ");
            temperatura = sc.nextDouble();
            if (temperatura<30 || temperatura>45)
            {
                System.out.println("Temperatura introducide debe estar entre 30 y  45");
            }
        }while(temperatura<30 || temperatura>45);
        
        System.out.println("Paciente registrado: " + nombre + ", " + temperatura + "º");

    }
    
}
