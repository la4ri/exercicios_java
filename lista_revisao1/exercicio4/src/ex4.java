import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int qntTermo;
        Double soma = 100.0, dividendo = 997.0, divisor = 2.0;


        System.out.print("Escreva a quantidade de termos a ser calculado: ");
        qntTermo = sc.nextInt();

        for (int i = 1; i < qntTermo; i++) {

            if (divisor % 2 == 0) {
                soma += - (dividendo/divisor);
            } else {
                soma += (dividendo/divisor);
            }

            dividendo += -3;
            divisor += 1;

        }

        System.out.print("Soma: " + soma);

        sc.close();

    }
}
