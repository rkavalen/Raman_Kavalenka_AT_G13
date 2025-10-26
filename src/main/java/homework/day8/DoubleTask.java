package homework.day8;

import java.util.ArrayList;
import java.util.Arrays;

public class DoubleTask {
    public static void main(String[] args) {
        Double[] d = {33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9};
        ArrayList<Double> doubles = new ArrayList<>(Arrays.asList(d));

        for (double i : doubles) {
            System.out.print(i + " ");
        }
        System.out.println();

        double result = 1.0;
        for (double i : doubles) {
            result *= i;
        }
        System.out.println(result);

        double sum = 0;
        for (double i : doubles) {
            double odd = i % 1;
            sum += odd;
        }
        System.out.println(sum);

        for (double i : doubles) {

            System.out.print((int) i + " ");
        }
    }
}
