package webdriver_builder;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverBuilder {

    public WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--user-agent=browser-tests");
        options.addArguments("--window-size=1400,800");

        //options.setPageLoadStrategy(PageLoadStrategy.NONE);
        return new ChromeDriver(options);
    }
}
