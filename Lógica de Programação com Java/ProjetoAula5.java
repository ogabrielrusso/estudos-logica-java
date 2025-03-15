/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoaula5;

/**
 *
 * @author ogabrielrusso
 */
import java.util.Scanner;
public class ProjetoAula5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        System.out.print("Insira o nome do professor: ");
        String nomeProfessor = scanner.nextLine();

        System.out.print("Insira o nome da disciplina: ");
        String nomeDisciplina = scanner.nextLine();

        System.out.print("Digite o valor da primeira nota: ");
        double notaA1 = scanner.nextDouble();

        System.out.print("Digite o valor da segunda nota: ");
        double notaA2 = scanner.nextDouble();

        double media = (notaA1 + notaA2) / 2;

        System.out.println("\nResultados:");
        System.out.println("Nome do aluno: " + nomeAluno);
        System.out.println("Nome do professor: " + nomeProfessor);
        System.out.println("Disciplina: " + nomeDisciplina);
        System.out.println("Media: " + media);

        scanner.close();
    }
    
}
