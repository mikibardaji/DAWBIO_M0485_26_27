/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemple1while;

/**
 * Bucle que es repeteixi metres el comptador sigui mes petit que o igual que 5
 * @author mabardaji
 */
public class Exemple1While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 1;
        while(contador<=5){
            System.out.println("iteracio: "+contador); 
            contador = contador +1;
        }
        System.out.println("S'ha acabat de contar");
    }
    
}
