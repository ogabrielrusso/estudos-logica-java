/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosultimaaula;

/**
 *
 * @author ogabrielrusso
 */
public class ExerciciosUltimaAula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a = 1 + 2 + 3 + 4 + 5 + 6;
        double b = (7.0 / 4) - (5.0 / 8) - (3.0 / 2);
        double c = (10 - 5) / Math.pow((17 - 12), 4);
        double d = (45 + 98) / (123 - 786);
        double e = 1 / Math.pow(81 + 7.6, 1.0 / 6);
        double f = Math.cbrt((45 + 98) / 87);

        System.out.printf("%d%n", a);
        System.out.printf("%.2f%n", b);
        System.out.printf("%.2f%n", c);
        System.out.printf("%.6f%n", d);
        System.out.printf("%.5f%n", e);
        System.out.printf("%.6f%n", f);

    }

}
