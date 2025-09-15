//-- создать класс Bottle
//-- у него есть обьем
//-- есть вода
//-- есть метод open(), который вызывает метод degas() в газировке

package Day1.bubbles;

public class Bottle {
    private double volume;
    SparklingWater water = new SparklingWater(volume);

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void open() {
        water.pump(water.getSparkingBubbles());
        water.degas();
    }

    public Bottle(double volume) {
        this.volume = volume;
    }

    public Bottle() {}
}
