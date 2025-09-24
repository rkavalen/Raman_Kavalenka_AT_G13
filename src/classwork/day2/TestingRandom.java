package classwork.day2;

import java.util.Random;

public class TestingRandom {

    static Random random = new Random();

    public static void main(String[] args) {
        while (true) {
            int i = random.nextInt(3);
            if (i == 3) {
                System.out.println(i);
                break;
            } else {
                System.out.println(i);
            }
        }
    }
}
