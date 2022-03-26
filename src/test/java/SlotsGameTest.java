import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlotsGameTest {
    SlotsGame game = new SlotsGame();

    @Test
    void spin() {
        SlotReel[] results = game.spin();
        Assert.assertTrue(game.spinCheck(results));
    }

    @Test
    void isWinner() {
    }

    @Test
    void getSlotReel() {
        String actual = game.getSlotReel(game.spin());
        Assert.assertTrue(actual != null);
    }

    @Test
    void takeBet() {
    }

    @Test
    void results() {
    }
}