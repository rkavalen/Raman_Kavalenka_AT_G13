package playground.essence.creatures;

import java.io.Serializable;

public class Raven extends Vertebrata implements Serializable {
    public Raven(int mass, String name) {
        super(mass, name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getMass() {
        return super.getMass();
    }

    @Override
    public String toString() {
        return "Raven{" +
                "name='" + this.getName() + '\'' +
                ", mass=" + this.getMass() +
                '}';
    }
}
