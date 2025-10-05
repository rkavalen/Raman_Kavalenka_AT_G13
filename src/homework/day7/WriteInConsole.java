package homework.day7;

import java.util.Scanner;

public class WriteInConsole {
    public void print() {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        System.out.printf("I just got %s from you!", text);
    }

    public static void main(String[] args) {
        WriteInConsole w = new WriteInConsole();
        w.print();
    }
}
