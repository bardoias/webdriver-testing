package es.mindata.fferreiro;

import es.mindata.fferreiro.page.MainPage;
import com.github.webdriverextensions.junitrunner.WebDriverRunner;
import com.github.webdriverextensions.junitrunner.annotations.Chrome;
import com.github.webdriverextensions.junitrunner.annotations.Firefox;
import com.github.webdriverextensions.junitrunner.annotations.InternetExplorer;
import org.junit.runner.RunWith;

@RunWith(WebDriverRunner.class)
@Firefox
@Chrome
//@InternetExplorer
public class GoogleImagesSiteTest {

    // Site
    public GoogleImagesSite site;

    // Pages
    public MainPage mainPage;
    // ...add your Site's WebPages here

}
