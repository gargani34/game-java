package models;

public class Human extends Humanoid{
    public int mana;


    public Human(String name, int x, int y, int price, Ematerial ematerial, int mana) {
        super(name, x, y, price, ematerial);
        this.mana = mana;
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "Human{" +
                "mana=" + mana +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
