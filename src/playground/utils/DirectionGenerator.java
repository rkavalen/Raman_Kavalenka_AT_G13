package playground.utils;

import java.util.Random;

public class DirectionGenerator {


    public static String generateDirection() {
        int randomDirValue;
        String direction = "";

        Random random = new Random();
        randomDirValue = random.nextInt(39) + 1;
        if (randomDirValue <= 9) {
            direction = "NORTH";
        } else if (randomDirValue <= 19) {
            direction = "SOUTH";
        } else if (randomDirValue <= 29) {
            direction = "WEST";
        } else {
            direction = "EAST";
        }
        return direction;
    }
}
