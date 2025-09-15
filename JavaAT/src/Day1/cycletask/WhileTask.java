//-- используя while вывести в консоль все числа от 0 до 20 в 1 строку через пробел

package Day1.cycletask;

public class WhileTask {
    public int startPoint = 0;
    public int endPoint = 20;

    public void printWithWhile() {
        int i = startPoint;
        while (i < (endPoint + 1)) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    public void printWithWhile(int startPoint, int endPoint) {
        int i = startPoint;
        while (i < endPoint + 1) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
}
