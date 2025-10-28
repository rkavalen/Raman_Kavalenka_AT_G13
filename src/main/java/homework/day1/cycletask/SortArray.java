package homework.day1.cycletask;

public class SortArray {
    private int[] array;

    public SortArray(int[] array) {
        this.array = array;
    }

    public void sortArray() {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
