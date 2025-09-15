//создать класс TrainMethodsReturn и в нем,
//-- создать метод returnNewInt, который принимает на вход целое число (int) и возвращает это число умноженное на 3
//        -- создать метод returnNewLong, который принимает на вход целое число (long) и возвращает это число минус 4
//        -- создать метод returnNewChar, который принимает на вход символ (char) и возвращает строку из двух таких символов
//-- создать метод returnNewFloat, который принимает на вход дробное число (float) и возвращает это число деленное на 2
//        -- создать метод returnNewDouble, который принимает на вход дробное число (double) и возвращает это число плюс 8
//        -- создать метод returnNewShort, который принимает на вход целое число (short) и возвращает это число минус 1
//        -- создать метод returnNewByte, который принимает на вход целое число (byte) и возвращает это число умноженное на 2
//        -- создать метод returnNewBoolean, который принимает на вход булево значение (boolean) и возвращает обратное булево
//-- создать класс TrainMethodsReturnRunner с методом main, в котором создать обьект класса TrainMethodsReturn, и отпечатать в консоль значение, возвращаемое каждым из его методов в виде "метод <название метода> вернул " и возвращаемое значение


package Day1.basetask;

public class TrainMethodsReturn {

    private int aNumber;
    private long aLong;
    private char aChar;
    private float aFloat;
    private double aDouble;
    private short aShort;
    private byte aByte;
    private boolean aBoolean;

    public int returnNewInt(int aNumber) {
        this.aNumber = aNumber;
        int i = aNumber * 3;
        System.out.println("метод returnNewInt вернул " + i);
        return i;
    }

    public long returnNewLong(long aLong) {
        this.aLong = aLong;
        long i = aLong - 4;
        System.out.println("метод returnNewLong вернул " + i);
        return i;
    }

    public char returnNewChar(char aChar) {
        this.aChar = aChar;                                                     // https://stackoverflow.com/questions/8172420/how-to-convert-a-char-to-a-string
        System.out.println("метод returnNewChar вернул " + aChar + aChar);
        return (char) (aChar * 2);
    }

    public float returnNewFloat(float aFloat) {
        this.aFloat = aFloat;
        float i = aFloat / 2;
        System.out.println("метод returnNewFloat вернул " + i);
        return i;
    }

    public double returnNewDouble(double aDouble) {
        this.aDouble = aDouble;
        double i = aDouble + 8;
        System.out.println("метод returnNewDouble вернул " + i);
        return i;
    }

    public short returnNewShort(short aShort) {
        this.aShort = aShort;
        short i = (short) (aShort - 1);
        System.out.println("метод returnNewDouble вернул " + i);
        return i;
    }

    public byte returnNewByte(byte aByte) {
        this.aByte = aByte;
        byte i = (byte) (aByte * 2);
        System.out.println("метод returnNewByte вернул " + i);
        return i;
    }

    public boolean returnNewBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
        boolean i = (aBoolean == false);
        System.out.println("метод returnNewBoolean вернул " + i);
        return i;
    }
}
