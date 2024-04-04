import java.util.Scanner;

public class aula9desafio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira string:");
        String str1 = scanner.nextLine();

        System.out.println("Digite a segunda string:");
        String str2 = scanner.nextLine();

        System.out.println("Digite a terceira string:");
        String str3 = scanner.nextLine();
        String maiorString = str1;
        if (str2.length() > maiorString.length()) {
            maiorString = str2;
        }
        if (str3.length() > maiorString.length()) {
            maiorString = str3;
        }

        System.out.println("A maior string digitada  é: " + maiorString);

        scanner.close();
    }
}