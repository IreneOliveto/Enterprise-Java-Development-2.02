package Exercise3;

public class Wizard extends Player {
    private int mana;

    public Wizard(int health, int strength, int lives) {
        super(health, strength, lives);
        setMana(mana);
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void attack () {
        this.mana--;
    }

}
