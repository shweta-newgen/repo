package Test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import io.percy.selenium.Percy;
public class Test {

private static WebDriver driver;
private static Percy percy;
private static WebElement url;



public static void main(String[] args) {


System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\chromedriver.exe");

driver = new ChromeDriver();
ChromeOptions options = new ChromeOptions();
options.setHeadless(true);
driver = new ChromeDriver(options);
percy = new Percy(driver);



driver.get("https://www.google.com/");

System.out.println("The tile of the page:"+ driver.getTitle());

driver.manage().window().maximize();



percy.snapshot("omniapp login page screenshot");
}



}