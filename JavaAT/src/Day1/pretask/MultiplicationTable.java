//класс MultiplicationTable, используя цикл for, выведите на экран таблицу умножения для числа 5 (1 * 5, 2 * 5, и так далее);

package Day1.pretask;

public class MultiplicationTable {

    static int a = 5;

    public static void main(String[] args){
        for (int i = 1; i < 10; i++){
            System.out.println(i + " * " + a + " = " + i * a);
        }
    }

}
