package runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.ws.AllUserSearch;
import tests.ws.FullUsernameSearch;
import tests.ws.PartialUsernameSearch;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AllUserSearch.class,
        FullUsernameSearch.class,
        PartialUsernameSearch.class
})

public class Junit4WsRunner {
}
