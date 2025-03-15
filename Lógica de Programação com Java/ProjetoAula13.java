/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoaula13;
import java.util.Scanner;

/**
 *
 * @author ogabrielrusso
 */
public class ProjetoAula13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o Limite Minimo: ");
        int limiteMinimo = scanner.nextInt();
        System.out.print("Informe o Limite Maximo: ");
        int limiteMaximo = scanner.nextInt();

        System.out.println("***** ORDEM CRESCENTE **** ENTRE: " + limiteMinimo + " ate " + limiteMaximo);
        for (int i = limiteMinimo; i <= limiteMaximo; i++) {
            System.out.println(i);
        }

        System.out.println("***** ORDEM DECRESCENTE **** ENTRE: " + limiteMaximo + " ate " + limiteMinimo);
        for (int i = limiteMaximo; i >= limiteMinimo; i--) {
            System.out.println(i);
        }

        scanner.close();
        
    }
    
}
