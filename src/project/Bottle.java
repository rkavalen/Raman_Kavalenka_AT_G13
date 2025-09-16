package project;

public class Bottle {
    private double volume;
    private SparklingWater water;

    public Bottle(double volume) {
        this.volume = volume;
        this.water = new SparklingWater(volume);
        water.pump(water.getSparkingBubbles());
    }

    public void open() {
        water.degas();
    }
}
