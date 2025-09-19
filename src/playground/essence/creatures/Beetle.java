package playground.essence.creatures;

public class Beetle extends Insect implements Crawlable {

    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void nest(Carrot home) {
        String nesting;
        if (this.getMass() < home.getMass()) {
            nesting = String.format("I am %s and I will nest there with %s my family members!", this.getName(), home.getName());
        } else {
            nesting = "This carrot is too small for nesting :(";
        }
        System.out.println(nesting);
    }
}
