public class PileTab {
    int pos;
    int[] tab;

    public PileTab() {
        tab = new int[4];
        this.pos = 0;
    }

    public void add(int e) {
        if (this.pos == tab.length) {
            System.out.println("Ajout impossible de " + e);
            // System.exit(-1);
        } else {
            tab[this.pos] = e;
            this.pos++;
        }
    }

    public int remove() {
        int elem = tab[this.pos - 1];
        this.pos--;
        return elem;
    }

    public boolean estVide() {
        return this.pos == 0;
    }

    public int size() {
        return this.pos;
    }

    public void affiche() {
        for (int i = 0; i < this.pos; i++) {
            System.out.println(this.tab[i]);
        }
    }

    public int getSommet() {
        return this.tab[pos - 1];
    }

    // main
    public static void main(String[] args) {
        PileTab pile = new PileTab();
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
