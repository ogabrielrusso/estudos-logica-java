/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoAula8;

/**
 *
 * @author ogabrielrusso
 */
import java.util.Scanner;

public class ProjetoAula8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salario do funcionario: ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("Digite o percentual de aumento: ");
        double percentualAumento = scanner.nextDouble();

        double novoSalario = salarioAtual * (1 + percentualAumento / 100);

        double descontoINSS = salarioAtual * 0.14;

        double salarioLiquido = novoSalario - descontoINSS;

        System.out.println("\n**** Calculo de Reajuste Salarial ****");
        System.out.println("Seu salario anterior: " + salarioAtual);
        System.out.println("Percentual de aumento: " + percentualAumento + "%");
        System.out.println("Seu novo Salario: " + novoSalario);
        System.out.println("Desconto do INSS 14%: " + descontoINSS);
        System.out.println("Salário Liquido: " + salarioLiquido);

        scanner.close();
    }

}
