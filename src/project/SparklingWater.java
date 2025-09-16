package project;

public class SparklingWater extends Water {

    private double volume;
    private int bubbleAmount = 10000 * (int)volume;
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
        for (int i = sparkingBubbles.length - 1; i > 0; i--) {
            sparkingBubbles[i].makeCramp();
            sparkingBubbles[i] = null;
        }
    }

    public SparklingWater(double volume) {
        this.volume = volume;
    }
}


