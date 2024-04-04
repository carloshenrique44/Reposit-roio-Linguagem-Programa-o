public class aula9desafio7 {
    public static void main(String[] args) {

        String minhaString = " teste123 ";

        System.out.println("String original: '" + minhaString + "'");

        minhaString = minhaString.trim();
        System.out.println("String sem espaços no início e no final: '" + minhaString + "'");

        minhaString = minhaString.replaceAll("\\s+", " ");
        System.out.println("String com apenas um espaço entre as palavras: '" + minhaString + "'");
    }
}