package models;

public class Eagle extends Animal{
    public int vision;

    public Eagle(String name, int x, int y, int maxHealth, int health, double resistance, int vision) {
        super(name, x, y, maxHealth, health, resistance);
        this.vision = vision;
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
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
        return "Eagle{" +
                "health=" + health +
                ", resistance=" + resistance +
                ", vision=" + vision +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
