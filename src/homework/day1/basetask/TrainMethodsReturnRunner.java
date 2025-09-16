package homework.day1.basetask;

public class TrainMethodsReturnRunner {

    public static void main(String[] args) {
        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();
        trainMethodsReturn.returnNewInt(1);
        trainMethodsReturn.returnNewLong(3);
        trainMethodsReturn.returnNewChar('b');
        trainMethodsReturn.returnNewFloat(178f);
        trainMethodsReturn.returnNewDouble(12355d);
        trainMethodsReturn.returnNewShort((short) 123);   // TBD
        trainMethodsReturn.returnNewByte((byte) 7);
        trainMethodsReturn.returnNewBoolean(false);
    }
}
