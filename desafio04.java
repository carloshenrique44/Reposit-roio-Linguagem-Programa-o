import java.util.Scanner;

public class desafio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido. Por favor, digite um número inteiro positivo.");
        } else {
            int fatorial = 1;
            switch (numero) {
                case 0:
                case 1:
                    fatorial = 1;
                    break;
                default:
                    for (int i = 2; i <= numero; i++) {
                        fatorial *= i;
                    }
            }
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        scanner.close();
    }
}