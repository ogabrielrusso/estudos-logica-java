/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoaula4;

/**
 *
 * @author ogabrielrusso
 */
import java.util.Scanner;
public class ProjetoAula4 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor do primeiro numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Insira o valor do segundo numero: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " com " + numero2 + " resulta em " + soma);

        scanner.close();
      
    }
    
}
