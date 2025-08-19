package ComplexidadeExercicio2;

public class IndexOfQuestion2 {

    public static void main(String[] args) {

        String[] sentence = new String[10];

        sentence[0] = "a";
        sentence[1] = "b";
        sentence[2] = "c";
        sentence[3] = "d";
        sentence[4] = "e";
        sentence[5] = "f";
        sentence[6] = "g";
        sentence[7] = "h";
        sentence[8] = "o";
        sentence[9] = ".";


//        String[] window = new String[3]; sentença com 2 letras
//
//        window[0] = "h";
//        window[1] = "o";
//        window[2] = ".";

        String[] window = new String[4]; // sentença com 3 letras
        window[0] = "g";
        window[1] = "h";
        window[2] = "o";
        window[3] = ".";


        System.out.println(StringService.MyIndexOf(sentence, window));

    }
}
