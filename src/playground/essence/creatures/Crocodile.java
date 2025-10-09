package playground.essence.creatures;

public class Crocodile extends Vertebrata implements Crawlable {
    public Crocodile(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void crawl(String direction, int distance) {
        System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units",
                getClass().getSimpleName(), this.name, direction, distance);
        System.out.println("\nwr-wr-wrr-r..");
    }
}
