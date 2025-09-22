package playground.essence.craft.air;

public class Plane extends Aircraft {
    public Plane(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void fly(String direction) {
        String flyTo = String.format("I am %s, my name is %s and I am flying to %s", getClass().getSimpleName(), this.getName(), direction);
        System.out.println(flyTo);
    }
}
