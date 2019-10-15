package es.mindata.fferreiro.page;

import es.mindata.fferreiro.GoogleImagesSite;
import es.mindata.fferreiro.component.ExampleWebComponent;
import com.github.webdriverextensions.WebPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static com.github.webdriverextensions.Bot.*;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class MainPage extends WebPage {

    // Logger
    private static final Logger log = LoggerFactory.getLogger(MainPage.class);

    // Url
    public String url = GoogleImagesSite.url;

    // Model
    @FindBy(name = "q")
    public WebElement queryInput;
    @FindBy(css = "div.FPdoLc.VlcLAe input.gNO89b")
    public WebElement searchButton;
    @FindBy(id = "search")
    public WebElement searchResult;
    @FindBy(linkText = "Imágenes")
    public WebElement imagesLink;
    @FindBy(css= "input.gLFyf.gsfi")
    public WebElement imagesQueryInput;
    @FindBy(css= "div.rINcab")
    public WebElement imagesSearchButton;

    @Override
    public void open(Object... arguments) {
        open(url);
        assertIsOpen();
    }

    @Override
    public void assertIsOpen(Object... arguments) throws Error {
        assertCurrentUrlStartsWith(url);
        // ...add your asserts that ensures that the page is loaded
    }

    public void avoidAutoComplete(WebElement webElement) {
        waitFor(1, TimeUnit.SECONDS);
        pressKeys(webElement, Keys.ESCAPE);
    }

}
