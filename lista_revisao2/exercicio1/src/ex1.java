import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        int numCaracteres = palavra.length();
        System.out.println("Número de caracteres: " + numCaracteres);

        String palavraMaiuscula = palavra.toUpperCase();
        System.out.println("Palavra em maiúsculo: " + palavraMaiuscula);

        int vogais = 0;
        for (int i = 0; i < numCaracteres; i++) {
            char ch = Character.toUpperCase(palavra.charAt(i));
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vogais = vogais + 1;
            }
        }
        System.out.println("Número de vogais: " + vogais);

        if (palavra.toUpperCase().startsWith("UNI")) {
            System.out.println("A string começa com UNI");
        } else {
            System.out.println("A string não começa com UNI");
        }

        if (palavra.toUpperCase().endsWith("RIO")) {
            System.out.println("A string termina com RIO");
        } else {
            System.out.println("A string não termina com RIO");
        }

        int digitos = 0;
        for (int i = 0; i < numCaracteres; i++) {
            char ch = palavra.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digitos= digitos + 1;
            }
        }
        System.out.println("Número de dígitos: " + digitos);

        sc.close();
    }
}
