import java.util.HashMap;

public class Annuaire {

    HashMap<String , Fiche> tab;

    public Annuaire() {
        this.tab = new HashMap<String, Fiche>();
    }

    public int getNBconttacts() {
        return this.tab.size();
    }

    public void addContact(Fiche f){
        this.tab.put(f.getNom(), f);
    }

    public void addContact(String s, int n, String a){
        this.tab.put(s, new Fiche(n, s, a));
    }

    public void addContact(String s){
        this.tab.put(s, new Fiche(s));
    }

    public int getnumero(String name) {
        return this.tab.get(name).getNumero();
    }

    public void affiche(){
        for(String s : this.tab.keySet()){
            System.out.println(s + " : " + this.tab.get(s));
        }
    }

    // main
    public static void main(String[] args) {
        Annuaire annuaire = new Annuaire();
        annuaire.addContact("toto", 1, "toto");
        annuaire.addContact("titi", 2, "titi");
        annuaire.addContact("tata", 3, "tata");
        annuaire.affiche();
        System.out.println(annuaire.getnumero("toto"));
        
    }
}
