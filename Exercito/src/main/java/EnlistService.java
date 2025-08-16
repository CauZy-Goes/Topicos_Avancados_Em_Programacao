import java.util.Objects;

public class EnlistService {

    public static Boolean needEnlist(String gender, Integer age) {

            return (Objects.equals(gender, "M") && age == 18 );
    }
}
