//класс MathOperatorsExample, объявите две целочисленные переменные и выполните операции сложения, вычитания, умножения и деления, выведите результаты на экран;

package Day1.pretask;

public class MathOperatorsExample {

    static int a = 12;
    static int b = 55;

    public static void main(String[] args){
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + ((float)a / (float)b));   //      (float)(a / b) = 0.0
    }
}
