import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SlotsGame {
    private SlotReel[] reel = SlotReel.values();
    public Random rand = new Random();
    SlotReel[] characters = new SlotReel[3];

    public SlotReel[] spin() {
        for (int i = 0; i < characters.length; i++) {
            characters[i] = reel[rand.nextInt(5)];
        }
        return characters;
    }

    public boolean isWinner() {
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == SlotReel.BOWSER) {
                if (characters[0] == characters[1] && characters[1] == characters[2]) {
                    return true;
                }
            }
        }
        return false;
    }

    public String getSlotReel(SlotReel[] result) {
        String[] printSlotReel = new String[3];
        for (int i = 0; i < printSlotReel.length; i++) {
            printSlotReel[i] = result[i].toString();
        }
        String stringSlotReel = printSlotReel[0] + "\n" + printSlotReel[1] + "\n" + printSlotReel[2] + "\n";
        System.out.println(stringSlotReel);
        return stringSlotReel;
    }

    public Integer takeBet(Integer input, String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        boolean bet = ((input == 5) || ((input == 10) || (input == 20) || (input == 50) || (input == 100)));
        while (bet == false) {
            System.out.println("\"" + scanner.next() + "\" isn't a bet you can place!");
            scanner.nextInt();
        }
        return input;
    }

    public void results(boolean winner) {
        if (winner) {
            System.out.println("Congratulations, you won!");
        }
        System.out.println("You lose.");
    }

    public boolean spinCheck(SlotReel[] results) {
        for (int i = 0; i < results.length; i++) {
            for (int j = 0; j < reel.length; j++) {
                if (results[i] == reel[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}

