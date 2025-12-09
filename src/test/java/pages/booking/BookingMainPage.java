package pages.booking;

import driver.Driver;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;

public class BookingMainPage extends BookingBasePage {

    private final String SEARCH_FIELD_NAME = "ss";
    private final String OCCUPANCY_DROPDOWN_XPATH = "//button[@data-testid='occupancy-config']";
    private final String ADULT_ADDER_XPATH = "//input[@id='group_adults']/..//button[2]";
    private final String ROOM_ADDER_XPATH = "//input[@id='no_rooms']/..//button[2]";
    private final String SUBMIT_BUTTON_XPATH = "//button[@type='submit']";

    public void openMainPage() {
        Driver.goTo("https://booking.com");
    }

    public void populateSearchField(String city) {
        WebElement searchField = Driver.findByName(SEARCH_FIELD_NAME);
        searchField.clear();
        searchField.sendKeys(city);
        Driver.findByXpath(String.format("//div[text()='%s']", city)).click();
    }

    public void pickDate(LocalDate day) {
        Driver.findByXpath(String.format("//*[@data-date='%s']", day)).click();
    }

    public void clickOnOccupancyDropdown() {
        Driver.findByXpath(OCCUPANCY_DROPDOWN_XPATH).click();
    }

    public void addAdult() {
        Driver.findByXpath(ADULT_ADDER_XPATH).click();
    }

    public void addRoom() {
        Driver.findByXpath(ROOM_ADDER_XPATH).click();
    }

    public void hitSubmitButton() {
        Driver.findByXpath(SUBMIT_BUTTON_XPATH).click();
    }
}
