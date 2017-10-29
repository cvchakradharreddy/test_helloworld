package inputfield;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class inputcheck {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "/Users/ashishmekala/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://127.0.0.1:52640/www/index.html");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.id("in_user_name")); //find the text field
		if(ele.isDisplayed()) {
			System.out.println("Username Field is avaiable");
		}
		else {
			System.out.println("Username Field is not avaiable");
		}
		WebElement ele1=driver.findElement(By.id("in_user_pwd")); //find the text field
		if(ele1.isDisplayed()) {
			System.out.println("Password Field is avaiable");
		}
		else {
			System.out.println("Password Field is not avaiable");
		}
		WebElement ele2=driver.findElement(By.name("remember")); //find the text field
		if(ele2.isDisplayed()) {
			System.out.println("Remember me Field is avaiable");
		}
		else {
			System.out.println("Remember me Field is not avaiable");
		}
		driver.findElement(By.id("signup")).click();
		WebElement ele3=driver.findElement(By.id("up_user_name")); //find the text field
		if(ele3.isDisplayed()) {
			System.out.println("Username Field is avaiable");
		}
		else {
			System.out.println("Username Field is not avaiable");
		}
		WebElement ele4=driver.findElement(By.id("up_user_email")); //find the text field
		if(ele4.isDisplayed()) {
			System.out.println("Email Field is avaiable");
		}
		else {
			System.out.println("Email Field is not avaiable");
		}
		WebElement ele5=driver.findElement(By.id("up_user_pwd")); //find the text field
		if(ele5.isDisplayed()) {
			System.out.println("Password Field is avaiable");
		}
		else {
			System.out.println("Password Field is not avaiable");
		}
	}
}
