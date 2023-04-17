public class Ex5Main {
    public static void main(String[] args) throws Exception {

        Double A = 90000.0, B = 200000.0;
        int qntAno = 0;

        while (A < B){

            A += A * 0.03;
            B += B * 0.015;

            qntAno++;

        };

        System.out.println("Em "+ qntAno +" anos a cidade A ultrapassará ou se igualará a quantidade de habitantes da cidade B.");

    }
}
