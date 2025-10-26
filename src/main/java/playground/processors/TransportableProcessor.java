package playground.processors;

import playground.essence.craft.Transportable;
import playground.utils.CoordinatesGenerator;

public class TransportableProcessor {

    public void runTransportable(Transportable transportable, int pointA, int pointB) {
        System.out.printf("Transportable %s was moved to %d points%n", transportable.getClass().getSimpleName(), transportable.move(pointA, pointB));
    }

    public void runTransportable(Transportable transportable) {
        int pointA = CoordinatesGenerator.generateCoordinate();
        int pointB = CoordinatesGenerator.generateCoordinate();
        System.out.printf("Transportable %s was moved to %d points%n", transportable.getClass().getSimpleName(), transportable.move(pointA, pointB));
    }
}
