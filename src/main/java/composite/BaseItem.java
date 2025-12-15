package composite;

import java.util.List;

public abstract class BaseItem {

    protected String name;
    protected int value;
    protected List<BaseItem> items;

    public BaseItem(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public abstract void add(BaseItem baseItem );
    public abstract void delete(BaseItem baseItem );
    public abstract int getValue();
}
