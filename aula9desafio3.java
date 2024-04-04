
import java.util.Scanner;

public class aula9desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da cidade:");
        String cidade = scanner.nextLine();

        if (cidade.equalsIgnoreCase("Curitiba")) {
            System.out.println("Sim, a cidade é Curitiba");
        } else {
            System.out.println("Não, a cidade não é Curitiba");
        }

        scanner.close();
    }
}