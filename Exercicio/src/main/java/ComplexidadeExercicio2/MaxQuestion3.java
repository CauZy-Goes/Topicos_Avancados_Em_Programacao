package ComplexidadeExercicio2;

public class MaxQuestion3 {

    public static void main(String[] args) {

        Integer[] integerVetor = new Integer[10];

        integerVetor[0] = 1;
        integerVetor[1] =  44;
        integerVetor[2] = 3;
        integerVetor[3] = 5;
        integerVetor[4] = 8;
        integerVetor[5] = 99;
        integerVetor[6] = 200 ;
        integerVetor[7] = 343;
        integerVetor[8] = 4;
        integerVetor[9] = 5;

        System.out.println(StringService.MyMax(integerVetor));
    }
}
