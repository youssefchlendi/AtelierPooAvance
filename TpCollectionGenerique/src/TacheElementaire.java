public class TacheElementaire implements Tache{
    public String nom;
    public int cout;

    public TacheElementaire(String nom, int cout){
        this.nom = nom;
        this.cout = cout;
    }

    public String getNom(){
        return this.nom;
    }

    public int getCout(){
        return this.cout;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setCout(int cout){
        this.cout = cout;
    }

    public String toString(){
        return "TacheElementaire{" +
                "nom='" + nom + '\'' +
                ", cout=" + cout +
                '}';
    }

    
}
