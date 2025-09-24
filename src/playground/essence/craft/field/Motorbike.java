package playground.essence.craft.field;

public class Motorbike extends Vehicle {
    public Motorbike(int mass, String name) {
        super(mass, name);
    }

    @Override
    public int move(int pointA, int pointB) {
        String moveTo = String.format("I am %s, my name is %s and I am moving from point %d to point %d", getClass().getSimpleName(), this.name, pointA, pointB);
        System.out.println(moveTo);
        return pointB - pointA;
    }
}
