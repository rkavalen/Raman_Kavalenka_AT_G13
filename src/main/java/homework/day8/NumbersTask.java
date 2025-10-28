package homework.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NumbersTask {
    public static void main(String[] args) {
        Integer[] n = {3342, 34, 79, 23426, 68, 1324, 55, 7699};
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(n));

        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println();

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum + "\n");


        Collections.sort(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();

        Collections.sort(numbers, Collections.reverseOrder());
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
