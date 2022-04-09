public class Exercice2 {
    // main
    public static void main(String[] args) {
        int i = 0;
        int resu = 0;
        try {
            for (i = 0; i < args.length; i++) {
                resu = resu + Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage() + " A la position " + i);
        }
        System.out.println("Resultat " + resu);
        System.out.println("Fin du programme");

    }
}
