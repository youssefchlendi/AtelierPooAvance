public class CouleurRVB {

    private int r,v,b;

    public CouleurRVB(int r, int v, int b) {
        this.r = r;
        this.v = v;
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public int getV() {
        return v;
    }

    public int getB() {
        return b;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setV(int v) {
        this.v = v;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "r=" + r +
                ", v=" + v +
                ", b=" + b;
    }
    
    
}
