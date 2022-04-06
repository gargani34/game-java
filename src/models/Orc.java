package models;

public class Orc extends Humanoid{
    public int range;


    public Orc(String name, int x, int y, int price, Ematerial ematerial, int range) {
        super(name, x, y, price, ematerial);
        this.range = range;
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "Orc{" +
                "range=" + range +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
