package game;

/**
 * this class represents a tank
 */
abstract class Tank {
    private int life; // determines how many life the tank has
    private float healthPoint; // health points of the tank
    private boolean adversary; // sets whether the tank is player controlled(0) or not(1)
    private boolean animated; // sets whether the tank is stationary(0) or not(1)
    private int turret; // remaining ammo of turret
    private int cannon; // remaining ammo of cannon
    private int bfCannon; // remaining ammo of bfCannon

    protected int getLife() {
        return life;
    }

    protected void setLife(int life) {
        this.life = life;
    }

    protected float getHealthPoint() {
        return healthPoint;
    }

    protected void setHealthPoint(float healthPoint) {
        this.healthPoint = healthPoint;
    }

    protected boolean isAdversary() {
        return adversary;
    }

    protected void setAdversary(boolean adversary) {
        this.adversary = adversary;
    }

    protected boolean isAnimated() {
        return animated;
    }

    protected void setAnimated(boolean animated) {
        this.animated = animated;
    }

    public int getTurret() {
        return turret;
    }

    public void setTurret(int turret) {
        this.turret = turret;
    }

    public int getCannon() {
        return cannon;
    }

    public void setCannon(int cannon) {
        this.cannon = cannon;
    }

    public int getBfCannon() {
        return bfCannon;
    }

    public void setBfCannon(int bfCannon) {
        this.bfCannon = bfCannon;
    }
}
