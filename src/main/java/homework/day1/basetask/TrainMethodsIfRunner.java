package homework.day1.basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {
        TrainMethodsIf trainMethodsIf = new TrainMethodsIf();
        System.out.println("метод returnNewInt вернул " + trainMethodsIf.returnNewInt(256));
        System.out.println("метод returnNewLong вернул " + trainMethodsIf.returnNewLong(1234));
        System.out.println("метод returnNewChar вернул " + trainMethodsIf.returnNewChar('q'));
        System.out.println("метод returnNewFloat вернул " + trainMethodsIf.returnNewFloat(1234.56f));
        System.out.println("метод returnNewDouble вернул " + trainMethodsIf.returnNewDouble(87.123565d));
        trainMethodsIf.returnNewBoolean(true);
    }
}
