import java.util.Scanner;

public class Ex1Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numeros[], tamanho, numero = 1, primos = 0, i, cont1 = 0, cont2 = 0;
        int flag = 1;

        while (flag != 0) {
            System.out.print("Determine o tamanho da lista de números: ");
            tamanho = sc.nextInt();
            numeros = new int[tamanho];

            for (i = 0; i < numeros.length; i++) {
                System.out.print("Escreva o número da " + (i + 1) + "ª posição: ");
                numero = sc.nextInt();
                numeros[i] = numero;
            }
            for (i = 0; i < tamanho; i++) {
                for (int j = 2; j < numeros[i]; j++) {
                    if (numeros[i] % j == 0 && numeros[i] != j) {
                        cont1 = cont1 + 1;
                    } else if(numeros[i] % j == 0 && numeros[i] == j) {
                        cont2 = cont2 + 1;
                    }
                }
                if (cont1 == 0) {
                    primos = primos + 1;
                }
            }

            System.out.print("Na lista possui "+primos+" número(s) primo(s).\n");

            System.out.print("Deseja terminar o programa?\n");
            System.out.print("1 para sim; 0 para não: ");
            flag = sc.nextInt();
        }
    }
}
