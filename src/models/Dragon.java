package models;

public class Dragon extends Animal{
    private int power;
    private int range;

    public Dragon(String name, int x, int y, int maxHealth, int health, double resistance, int power, int range) {
        super(name, x, y, maxHealth, health, resistance);
        this.power = power;
        this.range = range;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }


    @Override
    public int receiveDamage(int amount) {
        return super.receiveDamage(amount);
    }

    @Override
    public int getMaxHealth() {
        return super.getMaxHealth();
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public double getResistance() {
        return super.getResistance();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public int getY() {
        return super.getY();
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "health=" + health +
                ", resistance=" + resistance +
                ", power=" + power +
                ", range=" + range +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
