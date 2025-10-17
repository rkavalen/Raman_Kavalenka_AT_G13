package homework.day10;

import homework.day8.prep.Bubble;
import homework.day8.prep.Chair;

import java.util.Random;
import java.util.stream.Stream;

public class FurnitureRunner {
    public static void main(String[] args) {
        /**
         15.
         Создать поток данных furniture класса Chair (через new Stream.of) furniture из 3 стульев
         высотой (120, 90, 100, 110) и шириной (40, 30, 50, 45) соответственно

         Отфильтровать только те стулья, который выше или равны 100 и уже или равны 50

         Отсортировать по высоте, а если высота равна, то по ширине в нисходящем порядке

         На основании существующего потока данных создать новый,
         в котором каждый новый Chair имеет высоту, деленную на 2, и ширину,
         умноженную на случайное число от 3 до 8 включительно

         На основании получившегося потока данных создать новый,
         представляющий собой уникальный набо высот стульев умноженных на их ширину

         Найти наибольшее значение в получившемся потоке

         Создать новый обьект Bubble с обьемом равным найденному наибольшему значению
         и именем равным найденному наибольшему значению,
         представленным в виде словесного выражения каждой цифры числа этого значения,
         указанного чере пробел

         Напечатать строковое значение полученного обьекта в текстовый файл
         */

        Stream<Chair> furniture = Stream.of(
                new Chair(120, 40),
                new Chair(90, 30),
                new Chair(100, 50),
                new Chair(110, 45)
        );


        furniture.filter(s -> s.getHeight() >= 100 && s.getWidth() <= 50)
                .sorted((x, y) -> {
                    if (x.getHeight() != y.getHeight()) {
                        return x.getHeight() - y.getHeight();
                    } else {
                        return y.getWidth() - x.getWidth();
                    }
                })
                .map(s -> new Chair(s.getHeight() / 2,
                        s.getWidth() * (new Random().nextInt(6) + 3)))
                .mapToInt(s -> s.getWidth() * s.getHeight())
                .distinct()
                .max()
//                .stream()
//                .map(s -> {
//                    return new Bubble(s,)
//                })
        ;
    }
}
