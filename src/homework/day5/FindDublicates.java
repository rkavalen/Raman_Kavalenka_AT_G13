package homework.day5;

public class FindDublicates {
    public static void findDublicates(String string) {
        String[] words = string.split("[^а-яА-Яa-zA-Z]+");
        int l = words.length;
        boolean[] counted = new boolean[l];
        int counter;

        for (int i = 1; i < l; i++) {
            if (counted[i]) {
                continue;
            }

            counter = 1;
            for (int j = i + 1; j < l; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    counter++;
                    counted[j] = true;
                }
            }

            if (counter > 1) {
                String[] dubplicates = new String[counter];
                dubplicates[0] = words[i];
                for (int dublicate = 1; dublicate < counter; dublicate++) {
                    for (int j = i + 1; j < l; j++) {
                        if (words[i].equalsIgnoreCase(words[j])) {
                            dubplicates[dublicate] = words[j];
                        }
                    }
                }
                for (String w : dubplicates) {
                    System.out.print(w + " ");
                }
                System.out.println();
            }
        }
    }
}