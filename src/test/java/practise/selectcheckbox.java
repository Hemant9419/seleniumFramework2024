package practise;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class selectcheckbox {
	WebDriver driver;
	
	public void setup() {
		
driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/" );
	}
	
	public void fillform() {
		
		setup();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Hemant");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("hs89910@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("8287812735");
		driver.findElement(By.xpath("//*[@id=\"textarea\"]")).sendKeys("This text area");
		
		driver.findElement(By.xpath("//*[@id=\"male\"]")).click();
		
		//driver.quit();
		
		
	}
	
	public void dropdown() {
		fillform();
		
		List<WebElement>checkbox= driver.findElements(By.xpath("//*[@type=\"checkbox\" and @class=\"form-check-input\" ]"));
		
		for(WebElement chck:checkbox) {
			chck.click();
			
		}
		
		for(int i=0;i<checkbox.size()-3;i++) {
			
			if(checkbox.get(i).isSelected()) {
				
				checkbox.get(i).click();
			}
			
		}
		
		WebElement el=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Select sl= new Select(el);
		
		List<WebElement>options=sl.getOptions();
		
		for(WebElement elmop:options) {
			
			
			System.out.println(elmop.getText());
			
			
				sl.selectByVisibleText("Germany");
			
		}
		
	}
	
	public void scrollform() {
		setup();
		
		WebElement scrol= driver.findElement(By.xpath("//*[@id=\"animals\"]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scrol);
		
		Select sl= new Select(scrol);
		
		sl.selectByVisibleText("Cat");
		
	}
	
	public void dragdrop() throws InterruptedException {
		
		setup();
		/*WebElement elm=driver.findElement(By.xpath("//*[text()=\"Drag and Drop\"]"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", elm);*/
		
		Actions act= new Actions(driver);
		
		Thread.sleep(5000);
		
		WebElement source=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement destination=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		act.dragAndDrop(source,destination );
	}
	
	public void findBrokenLinks() throws AWTException {
		
		setup();
		
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		
	}

	public static void main(String[] args) throws InterruptedException {


		selectcheckbox sl= new selectcheckbox();
		sl.dragdrop();

	

	}

}
