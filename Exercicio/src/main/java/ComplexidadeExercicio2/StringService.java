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

//    public static Integer MyIndexOf(String [] sentence, String [] window){
//        Integer windowPosition = null;
//        int counterSentence = 0;
//
//        while ( MyLength(sentence) != counterSentence ){
//            int counterWindow = 0;
//            while ( MyLength(window) != counterWindow ){
//                if(window[counterWindow].equals(sentence[counterSentence])){
//
//                    if(counterWindow == window.length - 1){}
//                } else {
//                    break;
//                }
//                counterWindow ++;
//            }
//            counterSentence ++;
//            }
//
//
//    }
//  return windowPosition;
//}
}
