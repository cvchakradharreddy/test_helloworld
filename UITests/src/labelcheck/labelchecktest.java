package labelCheck;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LabelCheckTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "/Users/ashishmekala/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://127.0.0.1:52640/www/ar_world/view/main.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"poiInfoButton\"]/span/span[2]")).click();
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"title\"]") );
		if(ele.isDisplayed()) {
			System.out.println("Label Field is avaiable");
		}
		else {
			System.out.println("Label Field is not avaiable");
		}
		WebElement ele1=driver.findElement(By.xpath("//*[@id=\"desc\"]"));
		if(ele1.isDisplayed()) {
			System.out.println("Comments Field is avaiable");
		}
		else {
			System.out.println("Comments Field is not avaiable");
		}
		WebElement ele2=driver.findElement(By.xpath("//*[@id='submit2']"));
		if(ele2.isDisplayed()) {
			System.out.println("Logout Button is avaiable");
		}
		else {
			System.out.println("Logout Button is not avaiable");
		}
	}
}
