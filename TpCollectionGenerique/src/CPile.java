import java.util.Iterator;
import java.util.LinkedList;

public class CPile<T> implements IPile<T>{
    LinkedList<T> list;
    
    public CPile(){
        list = new LinkedList<>();
    }

    @Override
    public boolean estVide() {
        return list.isEmpty();
    }

    @Override
    public void empile(T a) {
        list.addFirst(a);
    }

    @Override
    public T depile() {
        return list.removeFirst();
    }

    @Override
    public int nbElements() {
        return list.size();
    }

    @Override
    public T sommet() {
        return list.getFirst();
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public void affiche(){
        for(T elem : list){
            System.out.println(elem);
        }
    }

    // main
    public static void main(String[] args) {
        CPile<Integer> pile = new CPile<>();
        pile.empile(1);
        pile.empile(2);
        pile.empile(3);
        pile.empile(4);
        pile.empile(5);
        pile.affiche();
        System.out.println("Sommet : " + pile.sommet());
        System.out.println("Taille : " + pile.nbElements());
        System.out.println("Retrait : " + pile.depile());
        pile.affiche();
        System.out.println("Sommet : " + pile.sommet());
        System.out.println("Taille : " + pile.nbElements());
        System.out.println("Retrait : " + pile.depile());
        pile.affiche();
        System.out.println("Sommet : " + pile.sommet());
        System.out.println("Taille : " + pile.nbElements());
        System.out.println("Retrait : " + pile.depile());
        pile.affiche();
        System.out.println("Sommet : " + pile.sommet());
        System.out.println("Taille : " + pile.nbElements());
        System.out.println("Retrait : " + pile.depile());
    }


}
