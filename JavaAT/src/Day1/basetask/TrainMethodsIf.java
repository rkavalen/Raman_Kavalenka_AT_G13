//создать класс TrainMethodsIf и в нем,
//-- создать метод returnNewInt, который принимает на вход целое число (int) и если оно меньше 8, то возвращает это число умноженное на 7, в противном случае деленное на 4
//        -- создать метод returnNewLong, который принимает на вход целое число (long) и если оно больше 300, то возвращает это число минус 300, в противном случае плюс 20
//        -- создать метод returnNewChar, который принимает на вход символ (char) и если это 'g', то возвращает строку "go", в противном случае строку из этого символа с префиксом "o"
//        -- создать метод returnNewFloat, который принимает на вход дробное число (float) и если оно равно 0.67, то возвращает это число, в противном случае число умноженное на 2
//        -- создать метод returnNewDouble, который принимает на вход дробное число (double) и если оно больше 30, но меньше 80, то  возвращает это число плюс 87,если оно больше 80, но меньше 400, то возвращает это число минус 87, а если оно больше 400, то деленное на 4, в остальных случаях возвращает само число
//-- создать невозвратный метод returnNewBoolean, который принимает на вход булево значение (boolean) и если оно true то печатает в консоль "Я получил на вход значение истины", в противном случае печатает в консоль "Я получил на вход ложь"


package Day1.basetask;

public class TrainMethodsIf {

    private int aNumber;
    private long aLong;
    private char aChar;
    private float aFloat;
    private double aDouble;
    private boolean aBoolean;

    public double returnNewInt(int aNumber) {     // double - TBC
        if (aNumber < 8) {
            return aNumber * 7;
        } else {
            return (double) aNumber / 4;
        }
    }

    public long returnNewLong(long aLong) {
        if (aLong > 300) {
            return aLong - 300;
        } else {
            return aLong + 20;
        }
    }

    public String returnNewChar(char aChar) {
        if (aChar == 'g') {
            return "go";
        } else {
            return "o" + aChar;
        }
    }

    public float returnNewFloat(float aFloat) {
        if (aFloat == 0.67) {
            return aFloat;
        } else {
            return aFloat * 2;
        }
    }

    public double returnNewDouble(double aDouble) {
        if (30 < aDouble && aDouble < 80) {
            return aDouble + 87;
        } else if (80 < aDouble && aDouble < 400) {
            return aDouble - 87;
        } else if (aDouble > 400) {
            return aDouble / 4;
        } else {
            return aDouble;
        }
    }

    public void returnNewBoolean(boolean aBoolean) {
        if (aBoolean == true) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }

}
