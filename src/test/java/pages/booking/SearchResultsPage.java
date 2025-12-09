package pages.booking;

import driver.Driver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage extends BookingBasePage {
    private final String PROPERTY_CARD_XPATH = "//div[@data-testid='property-card']";
    private final String FIVE_STAR_CHECKBOX_XPATH = "//div[@id='bodyconstraint-inner']//div[@data-filters-item='class:class=5']/input";
    private final String SORTERS_DROPDOWN_XPATH = "//div//button[@data-testid='sorters-dropdown-trigger']";
    private final String ASC_CLASS_SORTER_XPATH = "//div//button[@data-id='class_asc']";

    public void waitUntilSearchResultsAreVisible() {
        Driver.waitUntilVisible(PROPERTY_CARD_XPATH);
    }

    public void filterFiveStarObjects() {
        Driver.findByXpath(FIVE_STAR_CHECKBOX_XPATH).click();
    }

    public void clickOnSortersDropdown() {
        Driver.findByXpath(SORTERS_DROPDOWN_XPATH).click();
    }

    public void sortByClassAsc() {
        Driver.findByXpath(ASC_CLASS_SORTER_XPATH).click();
    }

    public String getFirstSearchRating() {
        WebElement firstSearchResult = Driver.findByXpath("//div[@role='button'][1]");
        return firstSearchResult.getAttribute("aria-label");
    }
}
