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
        return  "ord=" + ord +
                ", abs=" + abs;
    }
    public static void main(String[] args) throws Exception {
        Point<Integer> p1 = new Point<>(1,2);
        Point<Double> p2 = new Point<>(3.0,4.0);
        Point<String> p3 = new Point<>("a","b");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        PointColoreNG p4 = new PointColoreNG(1,2,"red");
        System.out.println(p4);

        PointColore<Integer,String> p5 = new PointColore<>(1,2,"red");
        System.out.println(p5);

        PointColore<Double,CouleurRVB> p6 = new PointColore<>(3.0,4.0,new CouleurRVB(255,0,0));
        System.out.println(p6);

        Cercle<Integer> c1 = new Cercle<>(5,p1);
        System.out.println(c1);

        CercleAvecRestriction<Point<Integer>> c2 = new CercleAvecRestriction<>(5,p1);
        System.out.println(c2);

    }

   
}
