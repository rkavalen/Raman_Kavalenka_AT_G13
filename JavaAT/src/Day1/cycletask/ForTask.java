//-- используя for вывести в консоль каждое нечетное число от 3 до 19 включительно

package Day1.cycletask;

public class ForTask {
    public int startPoint = 3;
    public int endPoint = 19;

    public void printWithFor(int startPoint, int endPoint) {
        for (int i = startPoint; i < endPoint + 1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void printWithFor() {
        for (int i = startPoint; i < endPoint + 1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
