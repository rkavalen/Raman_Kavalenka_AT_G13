package playground.essence.creatures;

public abstract class Insect extends Animal {
    public Insect(int mass, String name) {
        super(mass, name);
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
