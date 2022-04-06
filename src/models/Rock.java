package models;

public class Rock extends SpacialElement{


    public Rock(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public void setX(int x) {
        super.setX(x);
    }

    @Override
    public int getY() {
        return super.getY();
    }

    @Override
    public void setY(int y) {
        super.setY(y);
    }


    @Override
    public String toString() {
        return "Rock{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
