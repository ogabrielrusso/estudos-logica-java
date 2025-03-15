/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoaula12;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author ogabrielrusso
 */
public class ProjetoAula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        double nota;

        while (true) {
            System.out.print("Digite a nota ou -1 para ver a Media: ");
            nota = scanner.nextDouble();

            if (nota == -1) {
                break;
            }

            notas.add(nota);
                 }

        double soma = 0;
        for (double n : notas) {
            soma += n;
        }

        double media = soma / notas.size();

        // Exibe o resultado
        System.out.println("****Calculando a Media*****");
        System.out.println("Total de notas digitadas: " + notas.size());
        System.out.println("A media de notas eh: " + media);

        scanner.close();
    }
}

