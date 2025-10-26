package homework.day1.cycletask;

public class FindMin {
    private int[] array;

    public FindMin(int[] array) {
        this.array = array;
    }

    public void findMin() {
        int min = 11;
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);
    }
}
