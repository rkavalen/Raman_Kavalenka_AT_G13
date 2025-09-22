//у него есть публичный статический метод generateDirection() - который генерирует случайное число от 1 (включая) до 40 (исключая),
// и возвращает строку одного из 4-х значений направления, следуя логике, если случайное от 1 до 9 - NORTH, от 10 до 19 - SOUTH, от 20 до 29 - WEST, от 30 до 39 - EAST
//-- package playground.processors
//-- class FlyableProcessor
//у него есть перегруженный публичный невозвратный метод:
//runFlyable(Flyable flyable) - принимает обьект летающего и вызывает у него метод fly, которому передает случайное направления, которое генерируется вызовом метода generateDirection() из утилиты DirectionGenerator
//runFlyable(Flyable flyable, String direction) - принимает обьект летающего и строку направления, и вызывает у первого метод fly, которому передает строку направления, переданную в качестве аргумента

package playground.processors;

import playground.essence.Flyable;
import playground.utils.DirectionGenerator;

public class FlyableProcessor {

    public void runFlyable(Flyable flyable) {
        String direction = DirectionGenerator.generateDirection();
        flyable.fly(direction);
    }

    public void runFlyable(Flyable flyable, String direction) {
        flyable.fly(direction);
    }
}
