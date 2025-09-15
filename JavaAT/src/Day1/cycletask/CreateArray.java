//-- создать пустой массив типа int и размера n = 7 и заполнить его случайными элементами используя Random.nextInt(n)
//-- пройти по массиву и вывести в консоль все элементы
//-- вывести в консоль все элементы массива в обратном порядке
//-- каждый элемент массива умножить на 5 и вывести результат в консоль
//-- каждый элемент массива возвести в квадрат и вывести результат в консоль
//-- найти минимальный элемент массива и вывести результат в консоль
//-- поменять местами первый и последний элементы и вывести результат в консоль
//-- отсортировать элементы массива в порядке убывания (любым способом) и вывести результат в консоль (изменено)

package Day1.cycletask;

import java.util.Random;

public class CreateArray {
    int arraySize;

    public CreateArray(int arraySize) {
        this.arraySize = arraySize;
    }

    public int[] createArray() {
        int[] array = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }
}
