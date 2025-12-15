package composite;

import com.sun.jdi.Value;

import java.util.ArrayList;

public class Bag extends BaseItem{

    public Bag(String name) {
        super(  0, name);
        items = new ArrayList<>();
    }

    @Override
    public void add(BaseItem baseItem) {
        items.add(baseItem);
    }

    @Override
    public void delete(BaseItem baseItem) {
        items.remove(baseItem);
    }

    @Override
    public int getValue() {
        int resul = value;
        for (BaseItem item : items)
            resul += item.getValue();
        return resul;
    }
}
