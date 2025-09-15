//-- создать класс TrainMethodsStringRunner с методом main, в этом методе создать обьект класса TrainMethodsString и вызвать всего его методы

package Day1.basetask;

public class TrainMethodsStringRunner {

    static String stringToPrint = "Random String.";
    static String mamaStringToPrint = "мыла. Не домыла.";

    public static void main(String[] args) {
        TrainMethodsString.printMama();
        TrainMethodsString.printPapa();
        TrainMethodsString.printString(stringToPrint);
        TrainMethodsString.printMamaString(mamaStringToPrint);
    }
}
