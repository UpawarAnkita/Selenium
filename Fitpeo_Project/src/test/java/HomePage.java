import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	public static void main(String[] args) throws InterruptedException {
		    WebDriver driver = new EdgeDriver();
			driver.get("https://fitpeo.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://fitpeo.com/revenue-calculator");
			Actions action = new Actions(driver);
			action.scrollByAmount(0, 550).perform();
			WebElement src=driver.findElement(By.xpath("//span[@class='MuiSlider-root MuiSlider-colorPrimary MuiSlider-sizeMedium css-duk49p']"));
			Actions a=new Actions(driver);
			a.scrollToElement(src).build().perform();
			driver.findElement(By.id(":R57alklff9da:")).click();
			a.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			a.sendKeys(Keys.DELETE);
			driver.findElement(By.id(":R57alklff9da:")).sendKeys("820");
			action.scrollByAmount(0, 560).perform();
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/label[1]/span[1]/input[1]")).click();
			driver.findElement(By.xpath("//div[@class='MuiBox-root css-1p19z09']//div[2]//label[1]//span[1]//input[1]")).click();
			driver.findElement(By.xpath("//div[3]//label[1]//span[1]//input[1]")).click();
			driver.findElement(By.xpath("//div[8]//label[1]//span[1]//input[1]")).click();
			action.scrollByAmount(0, 2000).perform();
			driver.quit();	
			}
	}