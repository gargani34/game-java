package models;

public abstract class Animal extends Being{
    public Animal(String name, int x, int y, int maxHealth, int health, double resistance) {
        super(name, x, y, maxHealth, health, resistance);
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
        return "Animal{" +
                "health=" + health +
                ", resistance=" + resistance +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
