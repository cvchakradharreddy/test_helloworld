package logOut;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LogOutTests {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "/Users/ashishmekala/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://127.0.0.1:52640/www/ar_world/view/main.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='submit2']")).click();
		driver.navigate().to("http://127.0.0.1:52640/www/index.html");
		driver.findElement(By.id("in_user_name") ).sendKeys("Am15am");
		driver.findElement(By.id("in_user_pwd")).sendKeys("am15am");
		driver.findElement(By.xpath("//*[@name='remember']")).click();
	}
}
