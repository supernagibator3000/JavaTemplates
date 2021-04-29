package Iterator;

import java.util.List;

public class ItemsIterator implements Iterator{
    private List<Item> itemsList;
    private int position = 0;

    public ItemsIterator(List<Item> itemsList){
        this.itemsList = itemsList;
    }

    @Override
    public boolean hasNext() {
        return position < itemsList.size();
    }

    @Override
    public Item next() {
        if (!hasNext())
            return null;

        Item item = itemsList.get(position);
        position++;
        return item;
    }

    @Override
    public void reset() {
        position = 0;
    }
}
