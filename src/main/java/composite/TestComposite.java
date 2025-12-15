package composite;

public class TestComposite {
    public static void main(String[] args) {
        BaseItem inventory = new Bag("Inventory");
        BaseItem bagCoins = new Bag("Bag Coins");
        BaseItem bagPotion = new Bag("Bag Potion");

        BaseItem coins = new Item(300, "Coins");
        bagCoins.add(coins);
        BaseItem magicPotion = new Item(300, "Magic Potion");
        BaseItem healthPotion = new Item(300, "Health Potion");
        bagPotion.add(magicPotion);
        bagPotion.add(healthPotion);

        BaseItem blade = new Item(300, "Blade");
        BaseItem shield = new Item(300, "Shield");
        BaseItem armor = new Item(300, "Armor");

        inventory.add(bagCoins);
        inventory.add(bagPotion);
        inventory.add(blade);
        inventory.add(shield);
        inventory.add(armor);

        System.out.println("Inventary total value: " + inventory.getValue());


    }
}
