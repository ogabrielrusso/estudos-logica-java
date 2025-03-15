/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoaula14;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ogabrielrusso
 */
public class ProjetoAula14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        while (true) {
            System.out.print("Digite um numero ou -1 para ver o resultado: ");
            int numero = scanner.nextInt();

            if (numero == -1) {
                break;
            }
            
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        // Relatório dos números pares
        int somaPares = 0;
        for (int num : pares) {
            somaPares += num;
        }
        double mediaPares = pares.size() > 0 ? (double) somaPares / pares.size() : 0;

        System.out.println("**** Relatorio dos Numeros Pares ****");
        System.out.println("A quantidade de numeros pares: " + pares.size());
        System.out.println("A soma dos numeros pares é: " + somaPares);
        System.out.println("A media de numeros pares: " + mediaPares);

        // Relatório dos números ímpares
        int somaImpares = 0;
        for (int num : impares) {
            somaImpares += num;
        }
        double mediaImpares = impares.size() > 0 ? (double) somaImpares / impares.size() : 0;

        System.out.println("**** Relatorio dos Numeros impares ****");
        System.out.println("A quantidade de numeros impares: " + impares.size());
        System.out.println("A soma dos numeros impares eh: " + somaImpares);
        System.out.println("A media de numeros impares: " + mediaImpares);

        scanner.close();
        
    }
    
}
