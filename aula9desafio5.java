import java.util.Scanner;

public class aula9desafio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota do primeiro bimestre:");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a nota do segundo bimestre:");
        double nota2 = scanner.nextDouble();
        System.out.println("Sua nota do primeiro bimestre: " + nota1);
        System.out.println("Sua nota do segundo bimestre: " + nota2);
        double media = (nota1 + nota2) / 2;
        System.out.printf("Sua média final é: %.2f%n", media);

        scanner.close();
    }
}