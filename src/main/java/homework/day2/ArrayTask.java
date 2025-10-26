package homework.day2;

import java.lang.reflect.Array;

public class ArrayTask {

    static int sumOfN(int[] arr, int i) {
        int n = 0;
        n += arr[i];
        System.out.println(n);
        return n;
    }

    static int[] returnNewArray(int[] arr, int n) {
        int arrayLength = 0;
        for (int i : arr) {
            if (i > n) {
                arrayLength++;
            }
        }

        int[] arr2 = new int[arrayLength];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > n) {
                arr2[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        return arr2;
    }

    static int returnSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i % arr.length == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        return sum;
    }

    static void drawTheCow() {
        System.out.println("      ^__^");
        System.out.println("      (oo)\\\\_______");
        System.out.println("     (__)\\ ) \\/\\  \\");
        System.out.println("          ||----w |\\");
        System.out.println("          ||     ||");
    }

    public static void main(String[] args) {
        int[] arr = {0, 11, 20, 13, 24, 45, 6, 7, 8, 9};

        sumOfN(arr, 8);
        returnNewArray(arr, 8);
        returnSum(arr);
        drawTheCow();
    }
}
