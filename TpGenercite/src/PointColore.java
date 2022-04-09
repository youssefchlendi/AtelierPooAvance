public class PointColore<T,T1> extends Point<T>{
    private T1 color;

    public PointColore(T ord, T abs, T1 color) {
        super(ord, abs);
        this.color = color;
    }

    public T1 getColor() {
        return color;
    }

    public void setColor(T1 color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", color='" + color + '\'';
    }
    
    
    
}
