package playground.essence.creatures;

import java.io.Serializable;

public abstract class Vertebrate extends Animal implements Serializable {


    public Vertebrate(int mass, String name) {
        super(mass, name);
    }

    public void eat(Insect food) {
        String eatFood = String.format("I am %s and I am eating %s", this.getName(), food.getName());
        System.out.println(eatFood);
    }
}
