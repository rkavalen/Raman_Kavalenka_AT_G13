package playground.utils;

import java.util.Random;

public class DistanceGenerator {
    public static int generateDistance() {
        int randomDirValue;
        String direction = "";

        Random random = new Random();
        randomDirValue = random.nextInt(99) + 1;
        System.out.printf("DistanceGenerator: I have generated distance with value: %d\n", randomDirValue);
        return randomDirValue;
    }
}
