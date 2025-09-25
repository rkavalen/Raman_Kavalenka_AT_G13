package homework.day5;

public class FindDublicates {
    public void findDublicates(String string) {
        String[] words = string.split("[^a-zA-Z0-9]]");
        int counter = 0;

        for (int i = 1; i < words.length(); i++) {
            counter = 1;

            for (int j = i + 1; j < words.length(); j++) {

                if (words[i].compareToIgnoreCase(words[j])) {
                    counter++;
                }
            }


        }


    }


    public static void main(String[] args) {

    }
}