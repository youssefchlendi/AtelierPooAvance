public class Exercice2 {
    // main
    public static void main(String[] args) {
        int i = 0;
        int resu = 0;
            for (i = 0; i < args.length; i++) {
                resu = resu + Integer.parseInt(args[i]);
            }
        System.out.println("Resultat " + resu);
        System.out.println("Fin du programme");

    }
}
