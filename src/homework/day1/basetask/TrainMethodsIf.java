package homework.day1.basetask;

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
        if (aBoolean) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }

}
