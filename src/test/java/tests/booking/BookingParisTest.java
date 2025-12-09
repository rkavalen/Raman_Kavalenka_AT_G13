package tests.booking;

import org.junit.Assert;
import org.junit.Test;
import pages.booking.BookingMainPage;
import pages.booking.SearchResultsPage;

import java.time.LocalDate;

public class BookingParisTest extends BaseTest {
    @Test
    public void sortingAndFilteringTest() {
        BookingMainPage bookingMainPage = new BookingMainPage();
        SearchResultsPage searchResultsPage = new SearchResultsPage();

        bookingMainPage.openMainPage();
        bookingMainPage.pressDoNotLogInButton();
        bookingMainPage.rejectCookies();
        bookingMainPage.populateSearchField("Париж");

        LocalDate fromDay = LocalDate.now().plusDays(3);
        LocalDate toDay = fromDay.plusDays(7);
        bookingMainPage.pickDate(fromDay);
        bookingMainPage.pickDate(toDay);

        bookingMainPage.clickOnOccupancyDropdown();
        bookingMainPage.addAdult();
        bookingMainPage.addAdult();
        bookingMainPage.addRoom();

        bookingMainPage.hitSubmitButton();

        searchResultsPage.pressDoNotLogInButton();
        searchResultsPage.rejectCookies();
        searchResultsPage.waitUntilSearchResultsAreVisible();
        searchResultsPage.filterFiveStarObjects();
        searchResultsPage.waitUntilSearchResultsAreVisible();
        searchResultsPage.clickOnSortersDropdown();
        searchResultsPage.sortByClassAsc();
        searchResultsPage.waitUntilSearchResultsAreVisible();

        Assert.assertEquals("Рейтинг первого отеля не 5", "5 из 5", searchResultsPage.getFirstSearchRating());
    }
}
