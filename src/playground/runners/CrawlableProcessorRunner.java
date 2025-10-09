package playground.runners;

import playground.essence.creatures.*;
import playground.processors.CrawlableProcessor;

public class CrawlableProcessorRunner {
    public static void main(String[] args) {
        CrawlableProcessor crawlableProcessor = new CrawlableProcessor();

        Crawlable crawlableCrocodile = new Crocodile(1723, "Neel Crawlable");
        Crawlable crawlableBeetle = new Beetle(43, "Christmas Crawlable");
        Vertebrata vertebrataCrocodile = new Crocodile(1723, "Neel Vertebrata");
        Insect insectBeetle = new Beetle(43, "Christmas Insect");
        Crocodile aCrocodile = new Crocodile(1723, "Neel Crocodile");
        Beetle aBeetle = new Beetle(43, "Christmas Beetle");
        Crawlable anonymousCrawlable = new Crawlable() {
            String name = "Anonymous";

            @Override
            public void crawl(String direction, int distance) {
                System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units%n",
                        getClass().getSimpleName(), name, direction, distance);
            }
        };

        crawlableProcessor.runCrawlable(crawlableCrocodile);
        crawlableProcessor.runCrawlable(crawlableBeetle);
//        crawlableProcessor.runCrawlable(vertebrataCrocodile);     does not implement crawlable interface
//        crawlableProcessor.runCrawlable(insectBeetle);
        crawlableProcessor.runCrawlable(aCrocodile);
        crawlableProcessor.runCrawlable(aBeetle);
        crawlableProcessor.runCrawlable(anonymousCrawlable);

        crawlableProcessor.runCrawlable(crawlableCrocodile, "никуда");
        crawlableProcessor.runCrawlable(crawlableBeetle, "налево");

        crawlableProcessor.runCrawlable(aCrocodile, "назад", 37);

        crawlableProcessor.runCrawlable(new Crocodile(111, "Гена") {
            @Override
            public void crawl(String direction, int distance) {
                System.out.printf("Крокодил %s был рождён ползти %s на расстояние %d%n",
                        name, direction, distance);
            }
        }, "вниз", 37);
        crawlableProcessor.runCrawlable(new Crocodile(12, "Чебурашка") {
            @Override
            public void crawl(String direction, int distance) {
                System.out.printf("Букашка-%s прополз %s на расстояние %d%n",
                        name, direction, distance);
            }
        }, "вниз", 37);
    }
}
