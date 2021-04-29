import Iterator.*;
import Mediator.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> itemList = new ArrayList<>();

        itemList.add(new Item("item1"));
        itemList.add(new Item("item2"));
        itemList.add(new Item("item3"));
        itemList.add(new Item("item4"));

        ItemsIterator itemsIterator = new ItemsIterator(itemList);

        while (itemsIterator.hasNext()){
            System.out.println(itemsIterator.next().getName());
        }


        Mediator mediator = new mediatorClass();

    }
}
