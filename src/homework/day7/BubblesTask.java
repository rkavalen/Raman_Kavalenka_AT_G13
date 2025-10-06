package homework.day7;

import homework.day7.prep.Bubble;

import java.util.ArrayList;
import java.util.Arrays;

public class BubblesTask {
    public static void main(String[] args) {
        Bubble[] b = {new Bubble(2, "CO2"),
                new Bubble(4, "O2"),
                new Bubble(5, "CO")};

        ArrayList<Bubble> bubbles = new ArrayList<>(Arrays.asList(b));
        for (Bubble bub : bubbles) {
            System.out.print(bub.getVolume() + " ");
        }
        System.out.println();

        for (Bubble bub : bubbles) {
            System.out.print(bub.getName() + " ");
        }
        System.out.println();

        int sum = 0;
        for (Bubble bub : bubbles) {
            sum += bub.getVolume();
        }
        System.out.println(sum);

        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i).toString());
        }

    }
}
