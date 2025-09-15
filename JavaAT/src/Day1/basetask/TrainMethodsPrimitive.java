//создать класс TrainMethodsPrimitive и в нем,
//-- создать невозвратный метод printInt, который принимает на вход целое число (int) и печатает в консоль «я получил на вход число » и это число
//-- создать невозвратный метод printLong, который принимает на вход целое число (long) и печатает в консоль «я получил на вход  длинное число » и это число
//-- создать невозвратный метод printChar, который принимает на вход символ (char) и печатает в консоль «я получил на вход символ » и это число
//-- создать невозвратный метод printFloat, который принимает на вход дробное число (float) и печатает в консоль «я получил на вход дробное число » и это число
//-- создать невозвратный метод printDouble, который принимает на вход дробное число (double) и печатает в консоль «я получил на вход длинное дробное число » и это число
//-- создать невозвратный метод printShort, который принимает на вход целое число (short) и печатает в консоль «я получил на вход короткое число » и это число
//-- создать невозвратный метод printByte, который принимает на вход целое число (byte) и печатает в консоль «я получил на вход очень короткое число » и это число
//-- создать невозвратный метод printBoolean, который принимает на вход булево значение (boolean) и печатает в консоль «я получил на вход булево » и это число

package Day1.basetask;

public class TrainMethodsPrimitive {

    public static void printInt(int number) {
        System.out.println("я получил на вход число " + number);
    }

    public static void printLong(long longNumber) {
        System.out.println("я получил на вход длинное число " + longNumber);
    }

    public static void printChar(char symbol) {
        System.out.println("я получил на вход символ " + symbol);
    }

    public static void printFloat(float floatNumber) {
        System.out.println("я получил на вход дробное число " + floatNumber);
    }

    public static void printDouble(double doubleNumber) {
        System.out.println("я получил на вход длинное дробное число " + doubleNumber);
    }

    public static void printShort(short shortNumber) {
        System.out.println("я получил на вход короткое число " + shortNumber);
    }

    public static void printByte(byte byteToPrint) {
        System.out.println("я получил на вход очень короткое число " + byteToPrint);
    }

    public static void printBoolean(boolean booleanToPrint) {
        System.out.println("я получил на вход булево " + booleanToPrint);
    }

}
