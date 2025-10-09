package playground.essence.craft;

public interface Rideable {
    default void drive(String direction){
        System.out.printf("I am %s, my name is %s and I am driving to %s", getClass().getSimpleName(), getClass().getName(), direction);
        System.out.println();
    }
}
