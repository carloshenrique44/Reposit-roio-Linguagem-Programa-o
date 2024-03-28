import java.util.Scanner;

public class desafio03 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um dia da semana de 1 a 7:");
        int numero = scanner.nextInt();


String diaSemana;

switch (numero) {

case 1:
case 2:
case 3:
case 4:
case 5:
System.out.println("Esse é um dia útil");
break;

case 6:
case 7:
System.out.println("Esse é um final de semana");

    }
    }
}