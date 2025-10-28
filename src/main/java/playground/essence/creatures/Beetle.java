package playground.essence.creatures;

public class Beetle extends Insect implements Crawlable {
    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void nest(Carrot home) {
        String nesting;
        if (this.getMass() < home.getMass()) {
            nesting = String.format("I am %s and I will nest there with %s my family members!", this.name, home.getName());
        } else {
            nesting = "This carrot is too small for nesting :(";
        }
        System.out.println(nesting);
    }

    @Override
    public void crawl(String direction, int distance) {
        System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units",
                getClass().getSimpleName(), this.name, direction, distance);
        System.out.println("\nvz-vz-vzz-zz..");
    }
}
