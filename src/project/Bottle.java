package project;

public class Bottle {
    private double volume;
    SparklingWater water = new SparklingWater(volume);

    public Bottle(double volume) {
        this.volume = volume;

    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void open() {
        water.degas();
    }
}
