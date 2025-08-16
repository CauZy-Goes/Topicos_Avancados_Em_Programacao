import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade");
        Integer age = sc.nextInt();
        sc.nextLine();


        System.out.println("Digite seu sexo: 'M' ou 'F'");
        String gender = sc.nextLine();


        System.out.println(
                EnlistService.needEnlist(gender, age)
                        ? "Você deve se alistar no exército"
                        : "Você não precisa se alistar"
        );
    }
}
