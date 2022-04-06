package models;

public abstract class Humanoid extends House{

    public Humanoid(String name, int x, int y, int price, Ematerial ematerial) {
        super(name, x, y, price, ematerial);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "Humanoid{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
