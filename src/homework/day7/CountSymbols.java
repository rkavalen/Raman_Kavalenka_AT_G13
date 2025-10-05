package homework.day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountSymbols {
    public void countSymbols() throws IOException {
        int sum = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("out.txt"))) {
            int c;
            while ((c = br.read()) != -1) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) throws IOException {
        CountSymbols cs = new CountSymbols();
        cs.countSymbols();
    }
}
