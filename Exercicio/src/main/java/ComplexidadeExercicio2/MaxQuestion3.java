package ComplexidadeExercicio2;

import java.util.Random;

public class MaxQuestion3 {

    public static void main(String[] args) {

        int vetorLength = 100;

        Integer[] integerVetor = new Integer[vetorLength];
        Random random = new Random();

        for (int i = 0; i < integerVetor.length; i++) {
            integerVetor[i] = random.nextInt(1000);
        }

        for (int i = 0; i < integerVetor.length; i++) {
            System.out.println("Posição " + i + ": " + integerVetor[i]);
        }
        System.out.println();

        System.out.println("O maior valor do array é : " + StringService.MyMax(integerVetor, vetorLength));
    }
}
