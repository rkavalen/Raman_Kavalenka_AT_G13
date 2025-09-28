package classwork.day7;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            if (incoming.equals("Stop")) {
                break;
            }
            System.out.printf("Just got '%s' text!", incoming);
            System.out.println();
        }
    }
}
