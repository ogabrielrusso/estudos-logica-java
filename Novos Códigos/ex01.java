/*Declare uma variável soma, para armazenar a soma dos números.
Crie uma lista de inteiros chamada numeros.
Adiciona cinco números à lista.
Itera sobre a lista e calcule a soma dos números.
Exiba a soma dos valores na lista.*/


public class SomaNumeros {
    public static void main(String[] args) {
        // Declara a variável soma para armazenar a soma dos números
        int soma = 0;
        
        // Cria um array de inteiros com cinco números
        int[] numeros = {10, 20, 30, 40, 50};
        
        // Itera sobre o array e calcula a soma
        for (int numero : numeros) {
            soma += numero;
        }
        
        // Exibe a soma dos valores
        System.out.println("A soma dos valores na lista é: " + soma);
    }
}

