package homework.day7;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CountAndWrite {
    public void countAndWrite() throws IOException {
        try (BufferedReader bf = new BufferedReader(new FileReader("out.txt"))) {
            int c;
            int sum = 0;
            while ((c = bf.read()) != -1) {
                sum++;
            }
            LocalDateTime localDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyHHmm");
            String filename = formatter.format(localDateTime) + "_" + sum + ".txt";
            try (BufferedWriter br = new BufferedWriter(new FileWriter(filename))) {
                br.write(sum + "");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        CountAndWrite cw = new CountAndWrite();
        cw.countAndWrite();
    }
}
