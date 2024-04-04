public class aula10exercicio1 {
    public static void main(String[] args) {
        int[] numeros = {400, 350, 800, 40, 90};

        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        System.out.println("A soma de todos os elementos é: " + soma);
    }
}