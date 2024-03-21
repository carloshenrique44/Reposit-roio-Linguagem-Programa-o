import java.util.Scanner;

public class Desafio {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o nome da pessoa: ");
            String nome = scanner.nextLine();
            
            System.out.print("Digite a idade da pessoa: ");
            int idade = scanner.nextInt();
            
            scanner.nextLine();
            
            System.out.print("Digite o signo da pessoa: ");
            String signo = scanner.nextLine();
            
            scanner.close();
            
            System.out.println("A pessoa de nome " + nome + ", de " + idade + " anos, tem o signo de " + signo + ".");
        }
    }