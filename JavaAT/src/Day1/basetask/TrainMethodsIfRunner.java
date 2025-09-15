//        -- создать класс TrainMethodsIfRunner с методом main, в котором создать обьект класса TrainMethodsIf,
//        и отпечатать в консоль значение, возвращаемое каждым из его методов в виде "метод <название метода> вернул " и возвращаемое значение, последний метод просто вызвать

package Day1.basetask;

public class TrainMethodsIfRunner {

    static TrainMethodsIf TrainMethodsIf = new TrainMethodsIf();
    static int aNumber = 256;
    static long aLong = 1234;
    static char aChar = 'q';
    static float aFloat = 1234.56f;
    static double aDouble = 87.123565d;
    static boolean aBoolean = true;

    public static void main(String[] args) {
        System.out.println("метод returnNewInt вернул " + TrainMethodsIf.returnNewInt(aNumber));
        System.out.println("метод returnNewLong вернул " + TrainMethodsIf.returnNewLong(aLong));
        System.out.println("метод returnNewChar вернул " + TrainMethodsIf.returnNewChar(aChar));
        System.out.println("метод returnNewFloat вернул " + TrainMethodsIf.returnNewFloat(aFloat));
        System.out.println("метод returnNewDouble вернул " + TrainMethodsIf.returnNewDouble(aDouble));
        TrainMethodsIf.returnNewBoolean(aBoolean);
    }

}
