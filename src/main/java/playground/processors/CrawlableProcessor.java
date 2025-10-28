package playground.processors;

import playground.essence.creatures.Crawlable;
import playground.utils.DirectionGenerator;
import playground.utils.DistanceGenerator;

public class CrawlableProcessor {
    public void runCrawlable(Crawlable crawlable) {
        crawlable.crawl(DirectionGenerator.generateDirection(), DistanceGenerator.generateDistance());
    }

    public void runCrawlable(Crawlable crawlable, String direction) {
        crawlable.crawl(direction, DistanceGenerator.generateDistance());
    }

    public void runCrawlable(Crawlable crawlable, String direction, int distance) {
        crawlable.crawl(direction, distance);
    }
}
