import java.util.Scanner;

public class Chanson {
    private String titre;
	private int durée;
		
	public Chanson() {
		this.saisirChanson();
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getDurée() {
		return durée;
	}
	public void setDurée(int durée) {
		this.durée = durée;
	}
	
    public void lireDurée() throws InvalidDureeException{
        Scanner  sca = new Scanner(System.in);
        System.out.println("Donner le durée de chanson");
        int dr = sca.nextInt();
        
        if (dr<0){
            throw new InvalidDureeException();
        }else{
            this.setDurée(dr);
        }
    }

    public void lireTitre() throws InvalidTitreException{
        Scanner  sca = new Scanner(System.in);
        System.out.println("Donner le nom de chanson");
        String ttr = sca.nextLine();
        if (ttr.length() > 20){
            throw new InvalidTitreException();
        }else{
            this.setTitre(ttr);
        }
    }

    public void saisirChanson() {
        Boolean b = true;
        while(b){
            try {
                this.lireTitre();
                this.lireDurée();
                b=false;
            } catch (InvalidTitreException|InvalidDureeException e) {
                b=true;
            }
        }
    }

	@Override
	public String toString() {
	return "Chanson [titre=" + titre + ", durée=" + durée + "]";
	}

    // main
    public static void main(String[] args) {
        Chanson s = new Chanson();
    }
}
