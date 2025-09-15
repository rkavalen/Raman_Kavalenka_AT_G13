//-- создать класс TrainMethodsString и в нем,
//-- создать невозвратный метод printMama, который ничего не принимает на вход печатает в консоль «мама мыла раму»
//-- создать невозвратный метод printPapa, который ничего не принимает на вход печатает в консоль «папа мыла раму»
//-- создать невозвратный метод printString, который принимает на вход строку и печатает в консоль эту строку
//-- создать невозвратный метод printMamaString, который принимает на вход строку и печатает в консоль «мама мыла » и эту строку

package Day1.basetask;

public class TrainMethodsString {

    public static void printMama() {
        System.out.println("мама мыла раму");
    }

    public static void printPapa() {
        System.out.println("папа мыла раму");
    }

    public static void printString(String stringToPrint) {
        System.out.println(stringToPrint);
    }

    public static void printMamaString(String mamaStringToPrint) {
        System.out.println("мама мыла " + mamaStringToPrint);
    }

}
