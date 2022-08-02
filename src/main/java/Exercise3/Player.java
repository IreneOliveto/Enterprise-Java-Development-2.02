package Exercise3;

public class Player {
    private final int maxHealth;
    private int health;
    private int strength;
    private int lives;

    public int getMaxHealth() {
        return maxHealth;
    }

    public Player(int health, int strength, int lives) {
        this.maxHealth = health;
        setHealth(health);
        setStrength(strength);
        setLives(lives);
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getHealth() {
        return health;
    }


    public int getStrength() {
        return strength;
    }

    public int getLives() {
        return lives;
    }

    public void kill() {
        setLives(getLives() - 1);
        setHealth(getMaxHealth());
    }

    public void attack(Player player) {
        int attackerStrength = getStrength();
        int attackedHealth = player.getHealth();

        player.setHealth(attackedHealth - attackerStrength);
    }

}
