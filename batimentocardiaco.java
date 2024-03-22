import java.util.Scanner;

public class batimentocardiaco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite seu batimento Cardiaco: ");
        int batimentocardiaco = scanner.nextInt();

    if (idade > 60 && batimentocardiaco >= 150) {
        System.out.println("URGENTE");
    }

    if (idade > 60 && batimentocardiaco <= 150) {
        System.out.println("Urgencia moderada");
    }

    if (idade <= 60 && batimentocardiaco < 150)   {
        System.out.println("Urgencia moderada ");
    }
    if (idade <= 60 && batimentocardiaco <= 150)    {
        System.out.println("Não urgente ");
    }

    } 


    }  


