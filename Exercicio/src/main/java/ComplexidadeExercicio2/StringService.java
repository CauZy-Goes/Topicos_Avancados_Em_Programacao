package ComplexidadeExercicio2;

public class StringService {

    public static Integer MyLength(String [] stringVetor){
        Integer lastPosition = null;
        int counter = 0;
        while(true){
            if(".".equals(stringVetor[counter])){
                lastPosition = counter;
                break;
            }
            counter++;
        }

        return lastPosition;
    }
}
