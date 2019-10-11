package selenium.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyMultiSelect {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement dropdown = driver.findElement(By.name("cars"));
		Select select = new Select(dropdown);
		select.selectByIndex(0);

		select.selectByValue("saab");
		
		select.selectByVisibleText("Opel");

		List<WebElement> selCars = select.getAllSelectedOptions();
		
		for(WebElement ele: selCars){
			
			System.out.println(ele.getText());
		}
		
		select.deselectByIndex(0);
		select.deselectByValue("saab");;
		select.deselectByVisibleText("Opel");
		
		List<WebElement> allCars = select.getOptions();
		
		for(WebElement ele: allCars){
			
			System.out.println(ele.getText());
			
			if(ele.getText().contains("Audi")){
				
				ele.click();
				break;
			}
		}
		
		select.deselectAll();
	}

}
