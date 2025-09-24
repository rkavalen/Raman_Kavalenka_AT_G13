package playground.essence.craft;

public interface Transportable {
    default int move(int pointA, int pointB) {
        String moveTo = String.format("I am %s, my name is %s and I am moving from point %d to point %d", getClass().getSimpleName(), getClass().getName(), pointA, pointB);
        System.out.println(moveTo);
        return pointB - pointA;
    }
}
