package models;

public class Castle extends House{
    private int price;


    public Castle(String name, int x, int y, int price, Ematerial ematerial, int price1) {
        super(name, x, y, price, ematerial);
        this.price = price1;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Castle{" +
                "price=" + price +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
