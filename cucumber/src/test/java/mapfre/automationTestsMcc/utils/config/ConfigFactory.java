package mapfre.automationTestsMcc.utils.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class ConfigFactory {

    public static WebDriver getWebDriver(final BrowserOptions browser) throws IOException{
        DesiredCapabilities capabilities = null;
        WebDriver driver = null;

        final Properties properties = getProperties();

        switch(browser){
            case FIREFOX:{
                final File pathBinary = new File(properties.getProperty("firefox.webdriver.path"));
                final FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
                final FirefoxProfile firefoxProfile = new FirefoxProfile();

                driver = new FirefoxDriver(firefoxBinary, firefoxProfile);
                break;
            }
            case CHROME:{
                loadDriver(browser, "chromedriver.exe");

                driver = new ChromeDriver();
                break;
            }
            case IE: {
                loadDriver(browser, "IEDriverServer.exe");

                capabilities = DesiredCapabilities.internetExplorer();
                capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
                capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
                capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

                // Este capability é necessário para acessos com protocolo SSL no IE11+Win10
                // Caso contrario é disparada a exceção NoSuchWindowException.
                // capabilities.setCapability("initialBrowserUrl", "http://www.google.com");

                driver = new InternetExplorerDriver(capabilities);
                break;
            }
            case SAFARI: {
                driver = new SafariDriver();
                break;
            }
            case EDGE: {
                loadDriver(browser, "MicrosoftWebDriver.exe");

                capabilities = new DesiredCapabilities();
                capabilities.setCapability(CapabilityType.BROWSER_NAME, "MicrosoftEdge");
                capabilities.setCapability(CapabilityType.VERSION, "13");
                capabilities.setCapability(CapabilityType.PLATFORM, "Windows 10");

                driver = new EdgeDriver(capabilities);
                break;
            }
        };

        return driver;
    }

    private static void loadDriver(final BrowserOptions browser, final String webDriver) {
        if(!webDriver.isEmpty()){
            final File file = new File("recipes" + File.separator + "drivers"+ File.separator + webDriver);
            System.setProperty(browser.getDriver(), file.getAbsolutePath());
        }
    }

    private static Properties getProperties() throws IOException {
        final Properties props = new Properties();
        final FileInputStream file = new FileInputStream("."+ File.separator +"src" + File.separator + "test"+ File.separator +"java"+ File.separator +"browserConfig.properties");
        props.load(file);
        return props;
    }
}
