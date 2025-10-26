package project;

public class SparklingWater extends Water {

    private double volume;
    private Bubble[] sparkingBubbles;

    public Bubble[] getSparkingBubbles() {
        return sparkingBubbles;
    }

    public SparklingWater(double volume) {
        this.volume = volume;
        int bubbleAmount = (int) (10000 * volume);
        sparkingBubbles = new Bubble[bubbleAmount];
    }

    public void pump(Bubble[] bubbles) {
        sparkingBubbles = bubbles;
        for (int i = 0; i < sparkingBubbles.length; i++) {
            sparkingBubbles[i] = new Bubble("Углекислый газ");
        }
    }

    public void degas() {
        for (int i = sparkingBubbles.length - 1; i >= 0; i--) {
            sparkingBubbles[i].makeCramp();
            sparkingBubbles[i] = null;
        }
    }
}


