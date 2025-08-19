package ComplexidadeExercicio2;

public class StringService {

    public static Integer MyLength(String[] stringVetor) {
        Integer lastPosition = null;
        int counter = 0;
        while (true) {
            if (".".equals(stringVetor[counter])) {
                lastPosition = counter;
                break;
            }
            counter++;
        }

        return lastPosition + 1;
    }

    public static Integer MyIndexOf(String [] sentence, String [] window){
        Integer windowPosition = null;
        int counterSentence = 0;

        while ( MyLength(sentence) - 2  != counterSentence ){
            int counterWindow = 0;
            while ( MyLength(window) - 2  != counterWindow ){
                if(window[counterWindow].equals(sentence[counterSentence])){

                    if(counterWindow  == MyLength(window) - 3){
                        windowPosition = counterSentence - counterWindow;
                        break;
                    }
                } else {
                    break;
                }
                counterWindow ++;
            }
            if(windowPosition != null)
                break;
            counterSentence ++;
            }

        return windowPosition;
    }

}

