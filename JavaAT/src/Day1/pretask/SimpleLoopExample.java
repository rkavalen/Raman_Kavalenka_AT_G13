//класс SimpleLoopExample, объявите целочисленную переменную и используйте цикл for, чтобы вывести числа от 1 до этой переменной;

package Day1.pretask;

public class SimpleLoopExample {

    static int a = 17;

    public static void main(String[] args){
        for (int i = 1; i < a + 1; i++){
            System.out.println(i);
        }
    }
}
