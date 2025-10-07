package homework.day8;

import java.util.ArrayList;

public class ElementsTask {
    public static void main(String[] args) {
        ArrayList<String> elements = new ArrayList<>();
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        for (String element : elements) {
            System.out.print(element + " ");
        }
        System.out.println("\n");

        int counter = 0;
        for (String element : elements) {
            if (element.contains(" ")) {
                counter++;
            }
        }
        System.out.println(counter + "\n");

        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }
        System.out.println();

        elements.add(3, "Spinner");
        elements.remove(1);
        elements.remove(4);
        elements.add(4, "Switch");

        for (String element : elements) {
            System.out.print(element + " ");
        }
    }
}
