package Day1.cycletask;

public class PrintReversedArray {
    private int[] array;

    public void printReversedArray() {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public PrintReversedArray(int[] array) {
        this.array = array;
    }
}
