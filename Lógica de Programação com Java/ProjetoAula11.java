/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoaula11;
import java.util.Scanner;

/**
 *
 * @author ogabrielrusso
 */
public class ProjetoAula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
        System.out.print("Digite a quantidade de vezes: ");
        int quantidade = scanner.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Disciplina Logica de Programacao " + i);
        }

        scanner.close();
    }
    }

