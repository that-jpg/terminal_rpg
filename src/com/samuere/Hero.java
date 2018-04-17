import java.util.*;
public class Hero{

    private ArrayList<Item> items;
    private int level;
    private int money;

    public Hero(ArrayList<Item> items, int level, int money) {
        this.items = items;
        this.level = level;
        this.money = money;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}