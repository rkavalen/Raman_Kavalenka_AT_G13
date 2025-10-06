package homework.day7;

import java.util.ArrayList;
import java.util.Arrays;

public class FiguresTask {
    public static void main(String[] args) throws InterruptedException {
        String[] f = {"Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"};
        ArrayList<String> figures = new ArrayList<>(Arrays.asList(f));


        for (String figure : figures) {
            System.out.print(figure + "-");
        }
        System.out.println("\n");

        int counter = figures.size();
        for (String figure : figures) {
            if (figure.contains("и")) {
                counter--;
            }
        }
        System.out.println(counter);
        System.out.println();

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }
        System.out.println("\n");

        figures.add(2, "Треугольник");
        for (String figure : figures) {
            System.out.print(figure + " ");
        }
        System.out.println();
    }
}
