package Exercise3;

public class Warrior extends Player{
    private int stamina;

    public Warrior(int health, int strength, int lives, int stamina) {
        super(health, strength, lives);
        setStamina(stamina);
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void attack () {
        this.stamina--;
    }

}
