package Day1.cycletask;

public class SwapFirstAndLast {
    private int[] array;

    public SwapFirstAndLast(int[] array) {
        this.array = array;
    }

    public int[] swapFirstAndLast() {
        int first = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = first;
        return array;
    }
}
