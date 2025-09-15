//-- создать класс TrainMethodsReturnRunner с методом main, в котором создать обьект класса TrainMethodsReturn, и отпечатать в консоль значение, возвращаемое каждым из его методов в виде "метод <название метода> вернул " и возвращаемое значение

package Day1.basetask;

public class TrainMethodsReturnRunner {

    static TrainMethodsReturn TrainMethodsReturn = new TrainMethodsReturn();   // TBD

    static int anInt = 1;
    static long aLong = 3;
    static char aChar = 'b';
    static float aFloat = 178f;
    static double aDouble = 12355d;
    static short aShort = 123;
    static byte aByte = 7;
    static boolean aBoolean = false;

    public static void main(String[] args) {
        TrainMethodsReturn.returnNewInt(anInt);
        TrainMethodsReturn.returnNewLong(aLong);
        TrainMethodsReturn.returnNewChar(aChar);
        TrainMethodsReturn.returnNewFloat(aFloat);
        TrainMethodsReturn.returnNewDouble(aDouble);
        TrainMethodsReturn.returnNewShort(aShort);   // TBD
        TrainMethodsReturn.returnNewByte(aByte);
        TrainMethodsReturn.returnNewBoolean(aBoolean);
    }
}
