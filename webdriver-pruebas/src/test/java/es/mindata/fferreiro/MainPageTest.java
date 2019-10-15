package es.mindata.fferreiro;

import org.junit.Test;
import static com.github.webdriverextensions.Bot.*;

import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class MainPageTest extends GoogleImagesSiteTest {

    // Logger
    private static final Logger log = LoggerFactory.getLogger(MainPageTest.class);

    @Test
    public void searchForHelloWorldTest() {
        open(site);
        assertIsOpen(mainPage);
        assertCurrentUrlContains("google");

        clear(mainPage.queryInput);
        type("Hello world", mainPage.queryInput);
        mainPage.avoidAutoComplete(mainPage.queryInput);
        click(mainPage.searchButton);

        waitFor(1, TimeUnit.SECONDS);
        assertTextContainsIgnoreCase("hello world", mainPage.searchResult);
    }

    @Test
    public void searchForImagesTest() {
        open(site);
        assertIsOpen(mainPage);
        assertCurrentUrlContains("google");

        click(mainPage.imagesLink);
        waitFor(1, TimeUnit.SECONDS);

        type("Hello world", mainPage.imagesQueryInput);
        mainPage.avoidAutoComplete(mainPage.imagesQueryInput);
        click(mainPage.imagesSearchButton);

        waitFor(1, TimeUnit.SECONDS);
        assertTextContainsIgnoreCase("hello world", mainPage.searchResult);
        assertAttributeContains("innerHTML", "<img", mainPage.searchResult);
    }

}

