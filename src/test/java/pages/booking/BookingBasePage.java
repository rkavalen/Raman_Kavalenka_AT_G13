package pages.booking;

import driver.Driver;
import org.openqa.selenium.NoSuchElementException;

public class BookingBasePage {
    private final String REJECT_ALL_COOKIES_BUTTON_ID = "onetrust-reject-all-handler";
    private final String CLOSE_LOG_IN_WINDOW_BUTTON_XPATH = "//button[@aria-label='Скрыть меню входа в аккаунт.']";

    public void pressDoNotLogInButton() {
        try {
            Driver.findByXpath(CLOSE_LOG_IN_WINDOW_BUTTON_XPATH).click();
        } catch (NoSuchElementException e) {
        }
    }

    public void rejectCookies() {
        try {
            Driver.findByID(REJECT_ALL_COOKIES_BUTTON_ID).click();
        } catch (NoSuchElementException e) {
        }
    }
}
