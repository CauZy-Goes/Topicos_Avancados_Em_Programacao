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


        String[] window = new String[3];

        window[0] = "b";
        window[1] = "y";
        window[2] = ".";


        System.out.println(StringService.MyIndexOf(sentence, window));

    }
}
