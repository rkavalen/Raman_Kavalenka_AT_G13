package objects.booking;

import driver.Driver;

public class SearchResultsPage extends BookingBasePage{
    private static final String PROPERTY_CARD_XPATH = "//div[@data-testid='property-card']";
    private static final String FIVE_STAR_CHECKBOX_XPATH = "//div[@id='bodyconstraint-inner']//div[@data-filters-item='class:class=5']/input";
    private static final String SORTERS_DROPDOWN_XPATH = "//div//button[@data-testid='sorters-dropdown-trigger']";
    private static final String ASC_CLASS_SORTER_XPATH = "//div//button[@data-id='class_asc']";

    public static void waitUntilSearchResultsAreVisible() {
        Driver.waitUntillVisible(PROPERTY_CARD_XPATH);
    }

    public static void filterFiveStarObjects(){
        Driver.findByXpath(FIVE_STAR_CHECKBOX_XPATH).click();
    }

    public static void clickOnSortersDropdown(){
        Driver.findByXpath(SORTERS_DROPDOWN_XPATH).click();
    }

    public static void sortByClassAsc(){
        Driver.findByXpath(ASC_CLASS_SORTER_XPATH).click();
    }



}
