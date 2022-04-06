package models;

public class House extends SpacialElement{
    private int price;

    private Ematerial ematerial;


    public House(String name, int x, int y, int price, Ematerial ematerial) {
        super(name, x, y);
        this.price = price;
        this.ematerial = ematerial;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "price=" + price +
                '}';
    }
}
