package classwork.day7;

import java.util.ArrayList;
import java.util.List;

public class ColorsTask {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        for (String s : colors) {
            System.out.print(s + " ");
        }
        System.out.println();

        colors.add(1, "Pink");
        colors.add(3, "Yellow");

        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i) + " ");
        }
        System.out.println();

        System.out.printf("%s %s", colors.get(2), colors.get(6));
    }
}
