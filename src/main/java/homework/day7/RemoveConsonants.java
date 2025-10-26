package homework.day7;

import java.io.*;
import java.util.ArrayList;

public class RemoveConsonants {
    public void removeConsonants() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("out.txt"))) {
            ArrayList<String> initialText = new ArrayList<>();
            ArrayList<String> newText = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                initialText.add(line);
                newText.add(line.replaceAll("[zxcvbnmsdfghjklqwrtpZXCVBNMSDFGHJKLQWRTPчсмтбфвпрлджйцкнгшщзхЧСМТБФВПРЛДЖЙЦКНГШЩЗХ]", ""));
            }

            try (BufferedWriter fw = new BufferedWriter(new FileWriter("out.txt"))) {
                for (String s : newText) {
                    fw.write(s+"\n");
                }
                fw.write("\n");
                for (String s : initialText) {
                    fw.write(s+"\n");
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        RemoveConsonants rc = new RemoveConsonants();
        rc.removeConsonants();
    }
}