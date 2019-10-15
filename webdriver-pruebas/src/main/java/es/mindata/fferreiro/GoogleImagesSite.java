package es.mindata.fferreiro;

import es.mindata.fferreiro.page.MainPage;
import com.github.webdriverextensions.WebSite;
import static com.github.webdriverextensions.Bot.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoogleImagesSite extends WebSite {

    // Logger
    private static final Logger log = LoggerFactory.getLogger(GoogleImagesSite.class);

    // Url
    public static String url = "https://www.google.com";

    // Pages
    public MainPage mainPage;
    // ...add your Site's WebPages here

    public void open(Object... arguments) {
        open(url);
    }

    @Override
    public void assertIsOpen(Object... arguments) throws Error {
        assertCurrentUrlStartsWith(url);
    }

}
