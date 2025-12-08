package objects.booking;

import driver.Driver;
import org.openqa.selenium.NoSuchElementException;

public class BookingBasePage {
    private static final String REJECT_ALL_COOKIES_BUTTON_ID = "onetrust-reject-all-handler";
    private static final String CLOSE_LOG_IN_WINDOW_BUTTON_XPATH = "//button[@aria-label='Скрыть меню входа в аккаунт.']";

    public static void pressDoNotLogInButton() {
        try {
            Driver.findByXpath(CLOSE_LOG_IN_WINDOW_BUTTON_XPATH).click();
        } catch (NoSuchElementException e) {
        }
    }

    public static void rejectCookies() {
        try {
            Driver.findByID(REJECT_ALL_COOKIES_BUTTON_ID).click();
        } catch (NoSuchElementException e) {
        }
    }
}
