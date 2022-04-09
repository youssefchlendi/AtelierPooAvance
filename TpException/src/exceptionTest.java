import java.util.Scanner;

public class exceptionTest {
    public static void main(String[] args) {
        int a, b, res;
        Scanner clavier = new Scanner(System.in);
        System.out.println("a =");
        a = clavier.nextInt();
        System.out.println("b =");
        b = clavier.nextInt();
        try {
            res = a / b;
            System.out.println(a + " / " + b + " = " + res);
        } catch (ArithmeticException e) {
            System.out.println("oops ! un problème dans la division");
            System.out.println("le message officiel est " + e.getMessage());
        }
        clavier.close();
        System.out.println("Fin du programme");
    }
}
