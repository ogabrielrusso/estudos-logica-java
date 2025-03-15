/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoaula15;
import java.util.Scanner;
/**
 *
 * @author ogabrielrusso
 */
public class ProjetoAula15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int idade, countIdadePeso = 0, countAltura = 0, countPeso = 0;
        double peso, altura, somaIdadeAltura = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Dados da Pessoa: " + i);
            System.out.print("Digite a idade: ");
            idade = scanner.nextInt();
            System.out.print("Digite o peso: ");
            peso = scanner.nextDouble();
            System.out.print("Digite a altura: ");
            altura = scanner.nextDouble();

            if (idade > 50 && peso < 60) {
                countIdadePeso++;
            }
            if (altura < 1.50) {
                somaIdadeAltura += idade;
                countAltura++;
            }
            if (peso > 100) {
                countPeso++;
            }
        }

        double porcentagemIdadePeso = (countIdadePeso / 5.0) * 100;
        double mediaIdadeAltura = countAltura > 0 ? somaIdadeAltura / countAltura : 0;
        double porcentagemPeso = (countPeso / 5.0) * 100;

        System.out.println("A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kgs eh: " + countIdadePeso);
        System.out.println("A porcentagem de pessoas com idade superior a 50 anos e peso inferior a 60 kgs eh: " + porcentagemIdadePeso + "%");
        System.out.println("A media de idade das pessoas com altura inferior a 1.50m eh: " + mediaIdadeAltura);
        System.out.println("A porcentagem de pessoas com peso superior a 100 kgs eh: " + porcentagemPeso + "%");

        scanner.close();
    }

    }