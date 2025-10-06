package homework.day7;

import java.util.ArrayList;

public class NoodlesTask {
    public static void main(String[] args) {
        ArrayList<String> noodles = new ArrayList<>();
        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        for (String noodle : noodles) {
            System.out.print(noodle + "-");
        }
        System.out.println();

        for (int i = 0; i < noodles.size(); i++) {
            String noodle1 = noodles.get(i).replace("a", "o");
            noodles.remove(i);
            noodles.add(i, noodle1);
        }

        for (int i = 0; i < noodles.size(); i++) {
            System.out.println(noodles.get(i));
        }
    }
}
