import java.util.Scanner;

public class exercicioifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota: ");
        int nota = scanner.nextInt();

    if (nota >= 70) {
        System.out.println("Aprovado");
    }

    else {
        System.out.println("Reprovado");
    }
    if (nota >= 90) {
    System.out.println("Aprovado Parabéns");


    }
}
}