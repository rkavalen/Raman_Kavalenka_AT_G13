package tests.booking;

import driver.Driver;
import objects.booking.BookingMainPage;
import objects.booking.SearchResultsPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;

public class BookingParisTest {
    private WebDriver driver;

    @Before
    public void setDriver() {
        driver = Driver.getDriver();
        Driver.setTimeout(5);
    }

    @Test
    public void sortingAndFilteringTest() {
        BookingMainPage.openMainPage();
        BookingMainPage.pressDoNotLogInButton();
        BookingMainPage.rejectCookies();

        BookingMainPage.populateSearchField("Париж");

        LocalDate fromDay = LocalDate.now().plusDays(3);
        LocalDate toDay = fromDay.plusDays(7);
        BookingMainPage.pickDate(fromDay);
        BookingMainPage.pickDate(toDay);

        BookingMainPage.clickOnOccupancyDropdown();
        BookingMainPage.addAdult();
        BookingMainPage.addAdult();
        BookingMainPage.addRoom();

        BookingMainPage.hitSubmitButton();

        SearchResultsPage.pressDoNotLogInButton();
        SearchResultsPage.rejectCookies();
        SearchResultsPage.waitUntilSearchResultsAreVisible();
        SearchResultsPage.filterFiveStarObjects();
        SearchResultsPage.waitUntilSearchResultsAreVisible();
        SearchResultsPage.clickOnSortersDropdown();
        SearchResultsPage.sortByClassAsc();
        SearchResultsPage.waitUntilSearchResultsAreVisible();

        WebElement firstSearchResult = Driver.findByXpath("//div[@role='button'][1]");
        Assert.assertEquals("Рейтинг первого отеля не 5", "5 из 5", firstSearchResult.getAttribute("aria-label"));
    }
}
