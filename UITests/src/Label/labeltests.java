package Label;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class labeltests {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "/Users/ashishmekala/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://127.0.0.1:52640/www/ar_world/view/main.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"poiInfoButton\"]/span/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"title\"]") ).sendKeys("my fav");
		driver.findElement(By.xpath("//*[@id=\"desc\"]")).sendKeys("Best place ");
	}
}
