package project;

public class Bubble {
    private final double VOLUME = 0.3;  // обьем пузырька постоянный и равен 0.3 мм2
    private double gasComposition;  //газовый состав

    public Bubble(double gasComposition) {
        this.gasComposition = gasComposition;
    }

    public Bubble() {}

    public double getVOLUME() {
        return VOLUME;
    }

    public double getGasComposition() {
        return gasComposition;
    }

    public void setGasComposition(double gasComposition) {
        this.gasComposition = gasComposition;
    }

    public void makeCramp() {
        System.out.println("Cramp!");
    }
}
