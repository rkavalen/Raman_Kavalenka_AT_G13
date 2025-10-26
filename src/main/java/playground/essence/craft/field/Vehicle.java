package playground.essence.craft.field;

import playground.essence.Flyable;
import playground.essence.Matter;
import playground.essence.craft.Rideable;
import playground.essence.craft.Transportable;

public abstract class Vehicle extends Matter implements Rideable, Transportable {
    protected String name;

    public Vehicle(int mass, String name) {
        super(mass);
        this.name = name;
    }

    @Override
    public void drive(String direction) {
        System.out.printf("I am %s, my name is %s and I amd driving to %s", getClass().getSimpleName(), name, direction);
        System.out.println();
    }
}
