import java.util.Scanner;

public class aula10exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[3];
        double[][] notas = new double[3][2];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            nomes[i] = scanner.nextLine();

            System.out.println("Digite a nota do primeiro bimestre para " + nomes[i] + ":");
            notas[i][0] = scanner.nextDouble();

            System.out.println("Digite a nota do segundo bimestre para " + nomes[i] + ":");
            notas[i][1] = scanner.nextDouble();

            scanner.nextLine(); 
        }

        System.out.println("Média dos alunos:");
        for (int i = 0; i < 3; i++) {
            double media = (notas[i][0] + notas[i][1]) / 2;
            System.out.println(nomes[i] + ": " + media);
        }

        scanner.close();
    }
}