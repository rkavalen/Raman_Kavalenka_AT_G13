package homework.day8;

import java.util.ArrayList;
import java.util.Arrays;

public class BirdsTask {
    public static void main(String[] args) {
        String[] b = {"Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"};
        ArrayList<String> birds = new ArrayList<>(Arrays.asList(b));

        for (String bird : birds) {
            System.out.println("--" + bird + "--");
        }
        System.out.println();

        int counter = 0;
        for (String bird : birds) {
            String newBird = bird.replaceAll("[aoeiuyаоуыэяёюиеAOEIUYАОУЫЭЯЁЮИЕ]", "");
            if ((bird.length() - newBird.length()) > 1) {
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println();

        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }
        System.out.println();
        birds.remove(2);
        birds.add(2, "Синица");
        for (String bird : birds) {
            System.out.print(bird + " ");
        }
    }
}
