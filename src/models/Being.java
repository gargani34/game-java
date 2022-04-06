package models;

public abstract class Being extends SpacialElement implements Comparable<Being>{
    private int maxHealth =100;
    protected int health;
    protected double resistance;

    public Being(String name, int x, int y, int maxHealth, int health, double resistance) {
        super(name, x, y);
        this.maxHealth = maxHealth;
        this.health = health;
        this.resistance = resistance;
    }

    @Override
    public int compareTo(Being o) {
        if(this.health > o.health){
            return -1;
        }else if(this.health < o.health){
            return 1;
        }else{
            return 0;
        }
    }

    public int receiveDamage(int amount){
        return maxHealth - amount;
     }
    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    @Override
    public String toString() {
        return "Being{" +
                "maxHealth=" + maxHealth +
                ", health=" + health +
                ", resistance=" + resistance +
                '}';
    }
}
