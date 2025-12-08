package runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.booking.BookingLondon;
import tests.booking.BookingParis;
import tests.booking.BookingPrague;
import tests.booking.BookingToolTip;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BookingParis.class,
        BookingLondon.class,
        BookingToolTip.class,
        BookingPrague.class
})

public class Junit4BookingRunner {
}

