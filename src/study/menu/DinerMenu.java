package study.menu;

import java.util.Iterator;

public class DinerMenu implements Menu {

    static final int MAX_ITEMS = 0;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];
    }

    public void addItem( String name, String description, boolean vegetarian, double price ){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if( numberOfItems>=MAX_ITEMS ){
            System.out.println("Sorry, menu is null! Can't add item to menu");
        }else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }

}
