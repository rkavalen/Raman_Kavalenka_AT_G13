package Day0;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Mainbk {
    static char aChar = 'a';

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }

    public static class Main {

        public static void main(String[] args) {
            int[] array = new int[10];
            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(10);
            }
            System.out.print("initial array : ");
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
            int avg = 0;
            for (int i =0; i < array.length; i++) {
                avg += array[i];
            }
            System.out.println("Average value is: " + avg); //sum?
        }
    }
}