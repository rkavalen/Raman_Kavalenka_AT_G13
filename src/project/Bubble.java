package project;

public class Bubble {
    private final double VOLUME = 0.3;
    private String gasComposition;

    public Bubble(String gasComposition) {
        this.gasComposition = gasComposition;
    }

    public void makeCramp() {
        System.out.println("Cramp!");
    }
}
