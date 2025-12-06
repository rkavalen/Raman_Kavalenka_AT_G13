package objects.booking;

import driver.Driver;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;

public class BookingMainPage extends BookingBasePage {

    private static final String SEARCH_FIELD_NAME = "ss";
    private static final String OCCUPANCY_DROPDOWN_XPATH = "//button[@data-testid='occupancy-config']";
    private static final String ADULT_ADDER_XPATH = "//input[@id='group_adults']/..//button[2]";
    private static final String ROOM_ADDER_XPATH = "//input[@id='no_rooms']/..//button[2]";
    private static final String SUBMIT_BUTTON_XPATH = "//button[@type='submit']";

    public static void openMainPage() {
        Driver.get("https://booking.com");
    }

    public static void populateSearchField(String city) {
        WebElement searchField = Driver.findByName(SEARCH_FIELD_NAME);
        searchField.clear();
        searchField.sendKeys(city);
        Driver.findByXpath(String.format("//div[text()='%s']", city)).click();
    }

    public static void pickDate(LocalDate day) {
        Driver.findByXpath(String.format("//*[@data-date='%s']", day)).click();
    }

    public static void clickOnOccupancyDropdown() {
        Driver.findByXpath(OCCUPANCY_DROPDOWN_XPATH).click();
    }

    public static void addAdult() {
        Driver.findByXpath(ADULT_ADDER_XPATH).click();
    }

    public static void addRoom() {
        Driver.findByXpath(ROOM_ADDER_XPATH).click();
    }

    public static void hitSubmitButton() {
        Driver.findByXpath(SUBMIT_BUTTON_XPATH).click();
    }
}
