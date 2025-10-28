package homework.day1.cycletask;

public class PrintArraySquared {
    private int[] array;

    public PrintArraySquared(int[] array) {
        this.array = array;
    }

    public void printArraySquared() {
        for (int i : array) {
            System.out.print(i * i + " ");
        }
        System.out.println();
    }
}
