package homework.day8;

import java.util.ArrayList;

public class Butterflies {
    public static void main(String[] args) {
        ArrayList<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        for (String b : butterflies) {
            System.out.println("\"" + b + "\"");
        }
        System.out.println();

        int bCount = 0;
        for (int i = 0; i < butterflies.size(); i++) {
            if (butterflies.get(i).contains("Oo")) {
                bCount++;
            }
        }
        System.out.println(bCount);
        System.out.println();

        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i) + " ");
        }
        System.out.println("\n");

        for (String b : butterflies) {
            System.out.println(b);
        }
    }
}
