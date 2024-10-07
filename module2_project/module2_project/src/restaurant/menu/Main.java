package restaurant.menu;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        RestaurantMenu menu = new RestaurantMenu();

        // Adding items to the menu
        menu.addMenuItem(new MenuItem("Burger", 5.99, "Fast Food"));
        menu.addMenuItem(new MenuItem("Pasta", 8.99, "Italian"));
        menu.addMenuItem(new MenuItem("Salad", 4.99, "Healthy"));

        // Iterating through the menu
        System.out.println("Menu Items:");
        for (MenuItem item : menu) {
            System.out.println(item);
        }

        // Sorting by name
        System.out.println("\nMenu Items Sorted by Name:");
        Collections.sort(menu.getMenuItems(), new NameComparator());
        for (MenuItem item : menu) {
            System.out.println(item);
        }

        // Sorting by category
        System.out.println("\nMenu Items Sorted by Category:");
        Collections.sort(menu.getMenuItems(), new CategoryComparator());
        for (MenuItem item : menu) {
            System.out.println(item);
        }

        // Cloning an item
        try {
            MenuItem clonedItem = (MenuItem) menu.getMenuItems().get(0).clone();
            System.out.println("\nCloned Item: " + clonedItem);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

