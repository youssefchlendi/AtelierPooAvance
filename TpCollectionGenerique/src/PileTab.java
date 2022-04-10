import java.util.ArrayList;
import java.util.Iterator;

public class PileTab<T> {
    ArrayList <T> tab;

    public PileTab() {
        tab = new ArrayList<>();
    }

    public void add(T e) {
        tab.add(e);
    }

    public T remove() {
        return tab.remove(tab.size() - 1);
    }

    public boolean estVide() {
        return tab.size() == 0;
    }

    public int size() {
        return tab.size();
    }

    public void affiche() {
        Iterator<T> it = tab.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public T getSommet() {
        return this.tab.get(tab.size() - 1);
    }

    // main
    public static void main(String[] args) {
        PileTab<Integer> pile = new PileTab<>();
        pile.add(1);
        pile.add(2);
        pile.add(3);
        pile.add(4);
        pile.add(5);
        pile.affiche();
        System.out.println("Sommet : " + pile.getSommet());
        System.out.println("Taille : " + pile.size());
        System.out.println("Retrait : " + pile.remove());
        pile.affiche();
        System.out.println("Sommet : " + pile.getSommet());
        System.out.println("Taille : " + pile.size());
        System.out.println("Retrait : " + pile.remove());
        pile.affiche();
        System.out.println("Sommet : " + pile.getSommet());
        System.out.println("Taille : " + pile.size());
        System.out.println("Retrait : " + pile.remove());
        pile.affiche();
        System.out.println("Sommet : " + pile.getSommet());
        System.out.println("Taille : " + pile.size());
        System.out.println("Retrait : " + pile.remove());
        pile.affiche();



    }
}
