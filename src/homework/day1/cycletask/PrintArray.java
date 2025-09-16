package homework.day1.cycletask;

public class PrintArray {
    private int[] array;

    public PrintArray(int[] array) {
        this.array = array;
    }

    public void printArray() {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
