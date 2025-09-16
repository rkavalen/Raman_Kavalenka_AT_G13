package homework.day1.cycletask;

public class PrintArrayX5 {
    private int[] array;

    public PrintArrayX5(int[] array) {
        this.array = array;
    }

    public void printArrayX5() {
        for (int i : array) {
            System.out.print(i * 5 + " ");
        }
        System.out.println();
    }
}
