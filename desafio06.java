import java.util.Scanner;
import java.util.Random;

public class desafio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa;
        int contadorTentativas = 0;

        System.out.println("Adivinhe o número entre 1 e 100");

        do {
            System.out.print("Digite o seu palpite: ");
            tentativa = scanner.nextInt();
            contadorTentativas++;

            if (tentativa < numeroSecreto) {
                System.out.println("O número secreto é maior");
            } else if (tentativa > numeroSecreto) {
                System.out.println("O número secreto é menor");
            } else {
                System.out.println("Parabéns, você acertou o número secreto em " + contadorTentativas + " tentativas.");
            }
        } while (tentativa != numeroSecreto);

        scanner.close();
    }
}