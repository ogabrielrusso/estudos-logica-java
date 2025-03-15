/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoaula7;

/**
 *
 * @author ogabrielrusso
 */
import java.util.Scanner;
public class ProjetoAula7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: "); 
        double numero2 = scanner.nextDouble();

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

        System.out.println("O resultado da soma de: " + numero1 + " + " + numero2 + " = " + soma);
        System.out.println("O resultado da subtracao de: " + numero1 + " - " + numero2 + " = " + subtracao);
        System.out.println("O resultado da multiplicacao de: " + numero1 + " x " + numero2 + " = " + multiplicacao);
        System.out.println("O resultado da divisao de: " + numero1 + " / " + numero2 + " = " + divisao);

        scanner.close();
    }
    
}
