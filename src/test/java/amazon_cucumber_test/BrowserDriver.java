package amazon_cucumber_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * BrowserDriver provides methods to open and close web browser
 * @author Kira Komshilova
 *
 */
public class BrowserDriver {
	private static WebDriver mDriver;
	private static final Logger LOGGER = Logger.getLogger( BrowserDriver.class.getName() );

	/**
	 * Constructor
	 * @param name the name of the browser to be open (Firefox, IE or Chrome)
	 */
	public BrowserDriver(String name)
	{
		if (name.toLowerCase().equals("firefox"))
		{
			mDriver = new FirefoxDriver();	
		}
		else if (name.toLowerCase().equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");		
			mDriver = new ChromeDriver();
		}
		else if (name.toLowerCase().equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "drivers//IEDriverServer.exe");
			DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
			ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			ieCapabilities.setCapability(InternetExplorerDriver.ENABLE_ELEMENT_CACHE_CLEANUP, true);
			ieCapabilities.setCapability("ensureCleanSession", true);
			mDriver = new InternetExplorerDriver(ieCapabilities);
		}
	}
	
	/**
	 * Get current instance of WebDriver
	 * @return current instance of WebDriver
	 */
	public WebDriver getCurrentDriver() {		
		return mDriver;
	}

	/**
	 * Close browser
	 */
	public void close() {
		try {
				getCurrentDriver().quit();
				mDriver = null;
				LOGGER.info("Closing the browser");
			}
		catch (UnreachableBrowserException e) {
			LOGGER.info("Cannot close browser: unreachable browser");
		}
		catch (NullPointerException e) {
			LOGGER.info("Cannot close browser: no browser to be closed");
		}
	}
	
	/**
	 * Delete all the cookies for the current domain
	 */
	public  void deleteAllCookies() {
		getCurrentDriver().manage().deleteAllCookies();
		LOGGER.info("Delete all cookies.");
		return;
	 }
	
	 /**
	  * Pause test execution for given timeout 
	  * 
	  * @param timeOut the timeout interval (seconds)
	  */
	public void pause(int timeOut)
	{
		getCurrentDriver().manage().timeouts().implicitlyWait( timeOut, TimeUnit.SECONDS);
		LOGGER.info("Pause test execution for "+timeOut+"s");
		return;
	}
	
	/**
	 *  Get the option interface for the current WebDriver
	 * @return the option interface for the current WebDriver
	 */
	public WebDriver.Options getManage()
	{
		return getCurrentDriver().manage();
	}	
}