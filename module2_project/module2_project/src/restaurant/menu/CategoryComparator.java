package restaurant.menu;
import java.util.Comparator;
public class CategoryComparator implements Comparator<MenuItem> {
    @Override
    public int compare(MenuItem o1, MenuItem o2) {
        return o1.getCategory().compareTo(o2.getCategory());
    }
}