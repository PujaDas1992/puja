package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutomationDemo {
public static void main(String[] args)
WebElement wb= new WebElement();
//System.setProperty("webDriver");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.google.co.in/");
		    driver.findElement(By.id("")).sendKeys("Wipro Jobs" ,keys.ENTER);
		    List<WebElement> list= driver.findElement(By.id("//a"));
		    System.out.println(list.size());
		    for(WebElement wb: list)
		    System.out.println(wb.getText());
		    
		  }
		}