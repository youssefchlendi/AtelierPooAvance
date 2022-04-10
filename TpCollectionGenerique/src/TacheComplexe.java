import java.util.ArrayList;

public class TacheComplexe implements Tache{
    public String nom;
    public ArrayList<Tache> taches;
    public TacheComplexe(String nom){
        this.nom = nom;
        this.taches = new ArrayList<Tache>();
    }

    public void addTache(Tache tache){
        this.taches.add(tache);
    }

    public void removeTache(Tache tache){
        this.taches.remove(tache);
    }

    public String getNom(){
        return this.nom;
    }

    public int getCout(){
        int cout = 0;
        for(Tache tache : this.taches){
            cout += tache.getCout();
        }
        return cout;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String toString(){
        String s = "TacheComplexe{" +
                "nom='" + nom + '\'' +
                ", taches={";
        for(Tache tache : this.taches){
            s += tache.toString() + ", ";
        }
        s += "}}";
        return s;
    }

    public static void main(String[] args){
        TacheComplexe tacheComplexe = new TacheComplexe("TacheComplexe");
        TacheElementaire tacheElementaire1 = new TacheElementaire("TacheElementaire1", 1);
        TacheElementaire tacheElementaire2 = new TacheElementaire("TacheElementaire2", 2);
        TacheElementaire tacheElementaire3 = new TacheElementaire("TacheElementaire3", 3);
        tacheComplexe.addTache(tacheElementaire1);
        tacheComplexe.addTache(tacheElementaire2);
        tacheComplexe.addTache(tacheElementaire3);
        System.out.println(tacheComplexe);
        System.out.println(tacheComplexe.getCout());
    }
}
