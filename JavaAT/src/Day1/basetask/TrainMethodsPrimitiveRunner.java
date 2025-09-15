//-- создать класс TrainMethodsPrimitiveRunner с методом main, в этом методе создать обьект класса TrainMethodsPrimitive и вызвать всего его методы

package Day1.basetask;

public class TrainMethodsPrimitiveRunner {

    static TrainMethodsPrimitive TrainMethodsPrimitive = new TrainMethodsPrimitive();
    static int anInt = 5;
    static long aLong = -55;
    static char aChar = 'д';
    static float aFloat = 0f;
    static double aDouble = -138d;
    static short aShort = 135;
    static byte aByte = 1;
    static boolean aBoolean = true;

    public static void main(String[] args) {
        TrainMethodsPrimitive.printInt(anInt);
        TrainMethodsPrimitive.printLong(aLong);
        TrainMethodsPrimitive.printChar(aChar);
        TrainMethodsPrimitive.printFloat(aFloat);
        TrainMethodsPrimitive.printDouble(aDouble);
        TrainMethodsPrimitive.printShort(aShort);
        TrainMethodsPrimitive.printByte(aByte);
        TrainMethodsPrimitive.printBoolean(aBoolean);
    }
}
