import java.util.Scanner;

public class exceptionTest {
    public static void main(String[] args) {
        int a, b, res;
        Scanner clavier = new Scanner(System.in);
        System.out.println("a =");
        a = clavier.nextInt();
        System.out.println("b =");
        b = clavier.nextInt();
        res = a / b;
        System.out.println(a + " / " + b + " = " + res);
        clavier.close();
        System.out.println ("Fin du programme") ;
        }
}
