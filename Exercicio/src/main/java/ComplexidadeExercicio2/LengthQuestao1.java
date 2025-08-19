package ComplexidadeExercicio2;

public class LengthQuestao1 {

    public static void main(String[] args) {

        int vetorMaxPositions = 102;

        String [] vetor = new String[vetorMaxPositions];
        vetor[vetorMaxPositions - 1] = ".";

        System.out.println(StringService.MyLength(vetor));
    }
}
