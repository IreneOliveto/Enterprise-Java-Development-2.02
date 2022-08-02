package Exercise3;

public class Elf extends Player {

    public Elf(int health, int strength, int lives) {

        super(health, strength, lives);
    }

    public void improveStrength() {
        setStrength(getStrength() * 2);
        setHealth(getHealth() - 1);
    }
}
