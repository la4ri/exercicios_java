import java.util.Scanner;

public class Ex2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        String strNum = Integer.toString(num);

        for (int i = 0; i < strNum.length(); i++) {
            char ch = strNum.charAt(i);
            switch (ch) {
                case '0':
                    System.out.print("zero");
                    break;
                case '1':
                    System.out.print("um");
                    break;
                case '2':
                    System.out.print("dois");
                    break;
                case '3':
                    System.out.print("três");
                    break;
                case '4':
                    System.out.print("quatro");
                    break;
                case '5':
                    System.out.print("cinco");
                    break;
                case '6':
                    System.out.print("seis");
                    break;
                case '7':
                    System.out.print("sete");
                    break;
                case '8':
                    System.out.print("oito");
                    break;
                case '9':
                    System.out.print("nove");
                    break;
                default:
                    break;
            }

            if (i < strNum.length() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        sc.close();
    }
}
