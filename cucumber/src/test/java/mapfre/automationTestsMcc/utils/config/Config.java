package mapfre.automationTestsMcc.utils.config;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Config {
    public static WebDriver driver;

    @Before
    /**
     * Deleta todos os cookies e maximiza janela '
     */
    public void openBrowser() throws IOException {

        driver = ConfigFactory.getWebDriver(BrowserOptions.IE);

    }

    @After
    /**
     * Tira screenshot caso o teste tenha falhado
     */
    public void embedScreenshot(final Scenario scenario) {

        if (scenario.isFailed()) {
            try {
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (final WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }
        }
        //		driver.quit();
    }

    @After
    public void finaliza() {
        //		driver.quit();
    }
}