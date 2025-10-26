package homework.day1.cycletask;

import java.util.Random;

public class CreateArray {
    int arraySize;

    public CreateArray(int arraySize) {
        this.arraySize = arraySize;
    }

    public int[] createArray() {
        int[] array = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }
}
