import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NavigateFitPeoHomePage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Dell23012024\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions actions =new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https://www.fitpeo.com");
		//navigate to the sub url the revenue -calculator
		//driver.navigate().to("https://fitpeo.com/revenue-calculator");
		//by using action class we can navigate to the revenue calculator
		Thread.sleep(5000);
		WebElement revenue_calculator = driver.findElement(By.xpath("//a/div[text()='Revenue Calculator']"));
		
		
		actions.moveToElement(revenue_calculator).click().build().perform();
        Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,500)");
		//WebElement calculatorSlider = driver.findElement(By.xpath("//span[contains(@class,'MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary')]"));
		//actions.scrollToElement(calculatorSlider);
		WebElement Slider = driver.findElement(By.xpath("//span[contains(@class,'MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary')]"));
		//js.executeScript("arguments[0].scrollIntoView(true);", Slider);
		
		int sliderWidth = Slider.getSize().getWidth();
		actions.clickAndHold(Slider).moveByOffset((int) (sliderWidth * 4.699), 0).release().perform();
		//WebElement SliderTextField = driver.findElement(By.xpath("//div[contains(@class,'MuiInputBase-root')]"));
		//SliderTextField.sendKeys("560");
		/*WebElement TextField = driver.findElement(By.xpath("//input[@type='number']"));
		TextField.clear();
        TextField.sendKeys("560");*/
		Thread.sleep(2000);
       
		
	
	
		driver.manage().window().minimize();
		driver.close();

	}

	private static Object ActionChains(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object JavascriptExecutor(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

}
