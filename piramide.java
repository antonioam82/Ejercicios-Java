/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramide;
import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class Piramide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de filas: ");
        int numFilas = sc.nextInt();
        sc.close();
        
        System.out.println();
        for(int altura = 1; altura<=numFilas; altura++){
            for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                System.out.print(" ");
            }
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
            }
        // TODO code application logic here
    }
    
}
