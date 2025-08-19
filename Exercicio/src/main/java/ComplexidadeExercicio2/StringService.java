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
        int counterWindow = 0;


        while ( MyLength(sentence) - 1  != counterSentence ){


            while ( MyLength(window) - 1 != counterWindow ){
                System.out.println(counterSentence + "E " + counterWindow);
                if(window[counterWindow].equals(sentence[counterSentence])){
                    System.out.println(counterSentence + "z " + counterWindow);
                    if(counterWindow  == MyLength(window) - 2){
                        System.out.println(counterSentence + "A " + counterWindow);
                        windowPosition = counterSentence - counterWindow;
                        break;
                    }
                    counterWindow ++;
                    break;
                } else {
                     counterWindow = 0;
                    break;
                }
            }

            counterSentence ++;

            if(windowPosition != null)
                break;
            }

        return windowPosition;
    }

}

