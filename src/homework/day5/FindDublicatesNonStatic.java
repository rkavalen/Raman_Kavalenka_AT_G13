package homework.day5;

public class FindDublicatesNonStatic {
    public void findDublicates(String string) {
        String[] words = string.split("[^а-яА-Яa-zA-Z]+");
        int l = words.length;
        boolean[] counted = new boolean[l];
        int counter;

        for (int i = 0; i < l; i++) {
            if (counted[i]) {
                continue;
            }
            counted[i] = true;
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
                int dublicate = 1;
                while (dublicate < counter) {
                    for (int j = i + 1; j < l; j++) {
                        if (words[i].equalsIgnoreCase(words[j])) {
                            dubplicates[dublicate++] = words[j];
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