import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome completo: ");
        String nome = sc.nextLine().toLowerCase();
        String[] palavras = nome.split(" ");
        String iniciais = "";

        for (String palavra : palavras) {
            if (!palavra.matches("(e|do|da|dos|das|de|di|du)")) {
                iniciais += palavra.charAt(0);
            }
        }

        System.out.println(iniciais.toUpperCase());

        sc.close();
    }
}
