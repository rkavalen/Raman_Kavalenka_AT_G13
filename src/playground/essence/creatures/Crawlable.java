package playground.essence.creatures;

public interface Crawlable {
    default void crawl(String direction, int distance) {
        System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units",
                getClass().getSimpleName(), getClass().getName(), direction, distance);
    }
}