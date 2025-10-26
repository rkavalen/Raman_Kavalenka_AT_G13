package homework.day7;

import java.io.*;

public class RemoveVowels {
    public void removeVowels() throws IOException {
        try (BufferedReader in = new BufferedReader(new FileReader("out.txt"))) {
            String line;
            while ((line = in.readLine()) != null) {
                line = line.replaceAll("[aoeiuyаоуыэяёюиеAOEIUYАОУЫЭЯЁЮИЕ]", "");
                try (BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"))) {
                    out.write(line);
                }
            }

        }
    }

    public static void main(String[] args) throws IOException {
        RemoveVowels rw = new RemoveVowels();
        rw.removeVowels();
    }
}
