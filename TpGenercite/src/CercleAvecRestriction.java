public class CercleAvecRestriction<T extends Point> {
    private int rayon;
    private T centre;

    public CercleAvecRestriction(int rayon, T centre) {
        this.rayon = rayon;
        this.centre = centre;
    }

    public int getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }

    public T getCentre() {
        return centre;
    }

    public void setCentre(T centre) {
        this.centre = centre;
    }

    @Override
    public String toString() {
        return "CercleAvecRestriction{" +
                "rayon=" + rayon +
                ", centre=" + centre +
                '}';
    }

    
}
