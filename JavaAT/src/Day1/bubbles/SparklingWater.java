//-- создать класс SparklingWater, являющийся дочерним Water
//-- у газировки есть пузырьки
//-- вода заполняется пузырьками при упаковке на заводе,
// для этого у нее есть метод pump(Bubble[] bubbles)

//-- 1 литр воды содержит 10 тыс пузырьков               bubble density
//-- у газировки есть метод degas(), который удаляет пузырьки по одному
// и вызывает их лопанье

package Day1.bubbles;

public class SparklingWater extends Water {

//    private Bubble[] sparkingBubbles;

    private double volume;
    private int bubbleAmount = (int) (10000 * volume);
    //    Bubble bubble = new Bubble(bubbleAmount);
    Bubble[] sparkingBubbles = new Bubble[bubbleAmount];

    public Bubble[] getSparkingBubbles() {
        return sparkingBubbles;
    }

    public void pump(Bubble[] bubbles) {
        sparkingBubbles = bubbles;
        for (int i = 0; i < sparkingBubbles.length; i++) {
            sparkingBubbles[i] = new Bubble();
        }
    }

    public void degas() {
        for (int i = sparkingBubbles.length; i > 0; i--) {
            sparkingBubbles[i].makeCramp();
            sparkingBubbles[i] = null;
        }
    }

    public SparklingWater(double volume) {
        this.volume = volume;
    }
}


