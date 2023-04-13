import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = sc.nextLine();

        int numCaracteres = texto.length();
        int numPalavras = texto.split("\\s+").length;

        System.out.println("Número total de caracteres: " + numCaracteres);
        System.out.println("Número total de palavras: " + numPalavras);

        sc.close();
    }
}
