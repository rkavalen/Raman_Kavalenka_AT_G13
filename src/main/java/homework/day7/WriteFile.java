package homework.day7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {

    public void writeFile() throws IOException {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        try (BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"))) {
            out.write("Hello, I just got " + input + " from you!");
        }
    }

    public static void main(String[] args) throws IOException {
        WriteFile wf = new WriteFile();
        wf.writeFile();
    }
}