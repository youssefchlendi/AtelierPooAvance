import java.util.Comparator;

public class DureeComparator implements Comparator<Chanson>  {

    @Override
    public int compare(Chanson arg0, Chanson arg1) {
        return Integer.compare(arg0.getDurée(),arg1.getDurée());
    }
    
    
}
