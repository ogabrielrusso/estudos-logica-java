/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoaula10;
import java.util.Scanner;


/**
 *
 * @author ogabrielrusso
 */
public class ProjetoAula10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();

        if (numero1 == numero2) {
            System.out.println("Os numeros sao iguais. " + numero1 + " , " + numero2);
        } else {
            System.out.println("Os numeros sao diferentes. " + numero1 + " , " + numero2);
            if (numero1 > numero2) {
                System.out.println("O numero " + numero1 + " eh maior e " + numero2 + " eh o menor.");
            } else {
                System.out.println("O numero " + numero2 + " eh maior e " + numero1 + " eh o menor.");
            }
        }

        scanner.close();
    }
    
}
