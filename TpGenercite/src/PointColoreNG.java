public class PointColoreNG extends Point<Integer> {
    private String color;

    public PointColoreNG(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", color='" + color + '\'';
    }

}
