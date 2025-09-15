//класс ConditionalExample, объявите целочисленную переменную и используйте условный оператор if, чтобы проверить, больше ли она 10, выведите результат проверки на экран;


package Day1.pretask;

public class ConditionalExample {

    static int a = 6;

    public static void main(String[] args){
        if (a < 10){
            System.out.println(a + " меньше десяти");
        } else if (a == 10) {
            System.out.println(a + " равно десяти");
        } else {
            System.out.println(a + " больше десяти");
        }
    }
}
