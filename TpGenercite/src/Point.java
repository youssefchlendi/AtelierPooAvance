public class Point<T> {
    private T ord,abs;

    public Point(T ord, T abs) {
        this.ord = ord;
        this.abs = abs;
    }

    public T getOrd() {
        return ord;
    }

    public T getAbs() {
        return abs;
    }

    public void setOrd(T ord) {
        this.ord = ord;
    }

    public void setAbs(T abs) {
        this.abs = abs;
    }

    @Override
    public String toString() {
        return "Point{" +
                "ord=" + ord +
                ", abs=" + abs +
                '}';
    }
    
}
