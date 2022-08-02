package Exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerTest {
    @Test
    public void whenIsKilled_shouldDecrementLivesByOne() {
        int expectedLives = 9;
        int expectedHealth = 10;

        Player player = new Player(10, 10, 10);

        player.kill();

        int resultLives = player.getLives();
        int resultHealth = player.getHealth();

        assertEquals(expectedLives, resultLives);
        assertEquals(expectedHealth, resultHealth);
    }

    @Test
    public void whenPlayerAttacks_shouldDecrementHealthOfAttackedPlayerByAttackerStrength() {
        int expectedHealth = 7 - 5;
        Player attacker = new Player(10, 5, 9);
        Player attacked = new Player(7,8,6);

        attacker.attack(attacked);

        int resultingHealth = attacked.getHealth();

        assertEquals(expectedHealth, resultingHealth);
    }

}