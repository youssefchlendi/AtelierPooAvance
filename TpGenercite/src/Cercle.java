public class Cercle<T> {
    private int rayon;
    private Point<T> centre;

    public Cercle(int rayon, Point<T> centre) {
        this.rayon = rayon;
        this.centre = centre;
    }


    public int getRayon() {
        return this.rayon;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }

    public Point<T> getCentre() {
        return this.centre;
    }

    public void setCentre(Point<T> centre) {
        this.centre = centre;
    }

    @Override
    public String toString() {
        return "{" +
            " rayon='" + getRayon() + "'" +
            ", centre='" + getCentre() + "'" +
            "}";
    }

}
