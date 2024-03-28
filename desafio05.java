import java.util.Scanner;

public class desafio05 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um mês de 1 a 12:");
        int numero = scanner.nextInt();


String mes;

switch (numero) {

case 1:
mes = "1";
case 2:
mes = "2";
case 3:
mes = "3";
System.out.println("Esse mês corresponde ao verão");
break;

case 4:
mes = "4";
case 5:
mes = "5";
System.out.println("Esse mês corresponde ao outono");
break;

case 6:
mes = "6";
case 7:
mes = "7";
case 8:
mes = "8";
System.out.println("Esse mês corresponde ao inverno");
break;

case 9:
mes = "9";
case 10:
mes = "10";
case 11:
mes = "11";
System.out.println("Esse mês corresponde a primavera");
break;


case 12:
mes = "12";
System.out.println("Esse mês corresponde ao verão");
break;
    }
}
}

