package amazon_cucumber_test;

/**
 * TestStepsDefinition class provides list of steps using 
 *
 * @throws FTPConnectionException If an I/O error occurs.
 * @throws FTPLoginException If the login operation did not succeed.
 */


import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.*;

/**
 * 
 * TestStepsDefinition class provides list of steps used for "Cucumber" testing
 * @author Kira Komshilova
 *
 */
public class TestStepsDefinition {
	 	public BrowserDriver driver;	 	
	 	long timeOut = 30 ; // default time out
	 
	 	/**
	 	 * Open an instance of the browser
	 	 * @param browser_name  the name of the browser (e.g. Firefox, IE or Chrome)	 	
	 	 */
	   @Given("^User opens a browser \"(.*?)\"$")
	   	public void openBrowser (String browser_name){
		   if (driver == null )		   
		   		driver = new BrowserDriver(browser_name);		   
	   	}
	   
	   /**
	    * Load a new web page in the current browser window.
	    * @param url the URL to load
	    */
	   @Given("^User opens the webpage \"(.*?)\"$")	   
	   public void openWebPage(String url){		   
	        driver.getManage().window().maximize();
	        driver.getManage().deleteAllCookies();
	        driver.getCurrentDriver().get( url);	        	        
			return;
	    };
	    
	    
	    /**
	     * Submit a search request using specified string 
	     * @param str the string to be used for search request 
	     */	   
	   @When("^User inputs string to search \"(.*?)\"$")
	    public void defineSearchString(String str){		
           	WebElement elementSearchEdit = (new WebDriverWait( driver.getCurrentDriver(), timeOut)).until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
           	elementSearchEdit.clear();
    	    elementSearchEdit.sendKeys(str);
    	    (new WebDriverWait(driver.getCurrentDriver(), timeOut)).until(ExpectedConditions.elementToBeClickable(By.className("nav-input"))).click();
            return;
		}
	   
	   /**
	    * Sort search results by price from highest to lowest. 
	    */	    
	   @When("^User sorts results by price from High to Low")
	    public void sortsResultsByPriceHL(){
		    Select sort = new Select ((new WebDriverWait(driver.getCurrentDriver(), timeOut)).until( ExpectedConditions.visibilityOf( driver.getCurrentDriver().findElement(By.id("sort"))) )); 
			sort.selectByValue("price-desc-rank");	   	
			return;
		}
	 
	   /**
	    * Find an element from the list of search results by index and open detail description for this element.
	    * @param idx the index of the element from the list greater or equal 0
	    */
	    @When("^User selects item (\\d+)$")
	    public void openItemByIndex(int idx){	    	
	    	(new WebDriverWait(driver.getCurrentDriver(), timeOut)).until(ExpectedConditions.visibilityOfElementLocated(By.id("s-result-count")));
	    	String str_page_count = driver.getCurrentDriver().findElement(By.id("s-result-count")).getText().split(" ")[0].split("-")[1];    		    			 
	    	
		    int page_count  = Integer.parseInt(str_page_count);		    	
		    int page_number = idx/page_count;
		    int new_idx = idx %  page_count; 
		    for (int i=0; i < page_number; i++)
		    {
		    	(new WebDriverWait(driver.getCurrentDriver(), timeOut)).until(ExpectedConditions.elementToBeClickable(By.id("pagnNextString")));
		    	WebElement next = driver.getCurrentDriver().findElement(By.id("pagnNextString"));
		    	next.click();	    		  
		    }		  
		    		    
		    driver.pause(10);		    
		    List<WebElement> list = (new WebDriverWait(driver.getCurrentDriver(), timeOut)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//*[@id='atfResults']/ul[@id='s-results-list-atf']/li")));
		    			    			    	
		    WebElement element =list.get( new_idx-1 );		    	
		    WebElement element_description =  (new WebDriverWait(driver.getCurrentDriver(), timeOut)).until(ExpectedConditions.elementToBeClickable(element.findElement(By.className("s-access-detail-page"))));		    		
		    element_description.sendKeys(Keys.ENTER); 
		    /*The method sendKeys(Keys.ENTER) is used here instead of element_description.click() since while debugging it was found out that method click() doesn't work stable*/	    
		    
	   	    return;
	    }
	    
	    
	    /**
	     * Check that product topic contains specified text
	     * @param str the text to be used for comparison 
	     */	    
	    @Then("^Check that product topic contains text \"(.*?)\"$")
	    public void checkProductTopic(String str){	    	
	    	WebElement title = (new WebDriverWait(driver.getCurrentDriver(), timeOut)).until( ExpectedConditions.visibilityOfElementLocated( By.id("productTitle")) );	    		
	    	Assert.assertTrue(title.getText().contains(str));
			return;
		}
	    
	     /**
	      * If test has been failed then capture screenshot and close the browser after each test execution
	      * @param scenario under test
	      */
	    @After	    	    
	    public void closeBrowser(Scenario scenario) {
	    	if (scenario.isFailed()) {
	    		try {
	    			File scrFile = ((TakesScreenshot)driver.getCurrentDriver()).getScreenshotAs(OutputType.FILE);
	    			DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HHmmss");
	    			Date date = new Date();
	    			File destFile = new File("results/"+scenario.getName()+dateFormat.format(date)+".jpg");
	    			FileUtils.copyFile(scrFile, destFile);	    				    			
	    		} catch (Exception e) {
	    			e.printStackTrace();
	    		}
	    	}	    
	    	try{ 
    			driver.close();
	    	}
	    	catch(NullPointerException  e)
	    	{
	    		e.printStackTrace();
	    	}
	    }	    
	      
}