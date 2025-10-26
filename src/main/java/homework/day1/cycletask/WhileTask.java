package homework.day1.cycletask;

public class WhileTask {

    public void printWithWhile(int startPoint, int endPoint) {
        int i = startPoint;
        while (i < endPoint + 1) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
}
