package ForgotPassword;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class forgotpassword {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "/Users/ashishmekala/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///Users/ashishkmekala/se_project/helloworld/platforms/ios/www/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='signinform']/p")).click();
		WebElement ele=driver.findElement(By.id("fp_user_name")); //find the text field
		if(ele.isDisplayed()) {
			System.out.println("Username Field is avaiable");
		}
		else {
			System.out.println("Username Field is not avaiable");
		}
		ele.sendKeys("Am15am");
		WebElement ele4=driver.findElement(By.id("fp_user_email")); //find the text field
		if(ele4.isDisplayed()) {
			System.out.println("Email Field is avaiable");
		}
		else {
			System.out.println("Email Field is not avaiable");
		}
		ele4.sendKeys("am15am@my.fsu.edu");
		WebElement ele5=driver.findElement(By.id("fp_user_pwd")); //find the text field
		if(ele5.isDisplayed()) {
			System.out.println("Password Field is avaiable");
		}
		else {
			System.out.println("Password Field is not avaiable");
		}
		ele5.sendKeys("Helloguys");
		driver.findElement(By.xpath("//*[@id=\'forgotPasswordForm\']/div/div[4]/div/input")).click();
	}
}
