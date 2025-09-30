package homework.day5;

public class FindDigits {
    public static void findDigits(String text) {
        String[] digits = text.replaceAll("[^0-9]+", "").split("");
        int[] d = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            d[i] = Integer.parseInt(digits[i]);
        }
        for (int i : d) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
