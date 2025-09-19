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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
