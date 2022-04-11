import java.util.ArrayList;
import java.util.Iterator;

public class Album {
     String nom;
    ArrayList<Chanson> tab;
    
    public Album(String nom){
        this.nom = nom;
        this.tab = new ArrayList<Chanson>();
    }

    public void ajoutChanson(Chanson c){
        this.tab.add(c);
    }

    public void supprimerChanson(String titre){
        for(int i = 0 ; i < tab.size() ; i++){
            if (tab.get(i).getTitre() == titre){
                tab.remove(i);
            }
        }
    }

    public void afficherChansons (){
        Iterator<Chanson> it = this.tab.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    public void afficherTitres(){
        for (Chanson chan : this.tab){
            System.out.println(chan.getTitre());
        }
    }

    public int dureeTotalAlbum(){

        int tot = 0;
        for (Chanson chan : this.tab){
            tot+=chan.getDurée();
        }
        return tot;
    }
}
