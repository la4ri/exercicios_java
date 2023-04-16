import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo, numVagas, numCandMasc, numCandFem, totalCand = 0, codMaiorNumCand = 0, maiorNumCand = 0;
        double numCandPorVaga, porcCandFem;

        System.out.print("Digite o código do curso: ");
        codigo = sc.nextInt();

        while (codigo != 0) {
            System.out.print("Digite o número de vagas: ");
            numVagas = sc.nextInt();

            System.out.print("Digite o número de candidatos do sexo masculino: ");
            numCandMasc = sc.nextInt();

            System.out.print("Digite o número de candidatos do sexo feminino: ");
            numCandFem = sc.nextInt();

            totalCand += numCandMasc + numCandFem;

            numCandPorVaga = (double) (numCandMasc + numCandFem) / numVagas;

            porcCandFem = (double) numCandFem / (numCandMasc + numCandFem) * 100;

            System.out.printf("Código do curso: %d\n", codigo);
            System.out.printf("Número de candidatos por vaga: %.2f\n", numCandPorVaga);
            System.out.printf("Porcentagem de candidatos do sexo feminino: %.2f%%\n", porcCandFem);

            if (numCandPorVaga > maiorNumCand) {
                maiorNumCand = (int) numCandPorVaga;
                codMaiorNumCand = codigo;
            }

            System.out.print("Digite o código do curso (ou 0 para encerrar): ");
            codigo = sc.nextInt();
        }

        System.out.printf("O total de candidatos é: %d\n", totalCand);
        System.out.printf("O curso com maior número de candidatos por vaga é: %d com %.2f candidatos por vaga\n",
        codMaiorNumCand, (double) maiorNumCand);

        sc.close();
    }
}
