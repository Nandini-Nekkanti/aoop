package restaurant.menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RestaurantMenu implements Iterable<MenuItem> {
    private List<MenuItem> menuItems;

    public RestaurantMenu() {
        menuItems = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return menuItems.iterator();
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
