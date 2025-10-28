package playground.essence;

public interface Flyable {
    default void fly(String direction) {
        String flyTo = String.format("I am %s, my name is %s and I am flying to %s", getClass().getSimpleName(), getClass().getName(), direction);
        System.out.println(flyTo);
    }
}
