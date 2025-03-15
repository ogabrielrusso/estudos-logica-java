/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoaula9;
import java.util.Scanner;

/**
 *
 * @author ogabrielrusso
 */
public class ProjetoAula9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da base: ");
        double base = scanner.nextDouble();

        System.out.print("Digite o tamanho da altura: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        
        if (base == altura) {
            System.out.println("O quadrado com base " + base + " e altura " + altura + " tem area: " + area);
        } else {
            System.out.println("O retangulo com base " + base + " e altura " + altura + " tem area: " + area);
        }

        scanner.close();
    }
}
