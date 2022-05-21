package org.baseclass;
import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;	
	public static Action a;	
	public static Robot r;	
	public static TakesScreenshot ts;	
	public static JavascriptExecutor js;	
	public static Alert al;	
	public static Select s;
	public static void launchBrowser() {		
		WebDriverManager.chromedriver().setup();		
		driver =new ChromeDriver();
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}	
	public static void maxBrowser() {
	driver.manage().window().maximize();
	}
	public void Implicit() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void pageUrl() {
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	}
	public static void pageTittle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void toText(WebElement element,String text) {
		element.sendKeys(text);

	}
	public static void fill(WebElement webElement, String text) {
		(webElement).sendKeys(text);
	}
	public static void btnClick(WebElement element) {
		element.click();
	}
	public static void printGetText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	public static void toGetAttribute(WebElement element) {
	String attribute = element.getAttribute("value");
	System.out.println(attribute);
	
	}
	public static void performMoverToElement(WebElement element) {
	Actions a=new Actions(driver);
	a.moveToElement(element).perform();

	}
	public static void performDragandDrop(WebElement src,WebElement desc) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, desc).perform();
	}
	public static void performDoubleClick(WebElement element) {
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
	}
	public static void rightClick(WebElement element) {
		Actions a=new Actions(driver);
		a.contextClick(element).perform();
	}
	public static void toPerformEnter(WebElement element) throws AWTException{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void toTakesScreenshot(String filename) throws IOException{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File f1 = ts.getScreenshotAs(OutputType.FILE);
		File f2=new File("C:\\Users\\ABARNA TAMILMANI\\Desktop\\screen\\"+filename+".png");
		FileHandler.copy(f1, f2);
	} 
	public static void toScroll(WebElement element1,WebElement element2) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoview(true)", element1);
		js.executeScript("arguments[0].scrollIntoview(false)", element2);
	}
	public static void toAceptAlert() {
		Alert al=driver.switchTo().alert();
		String string1 = al.toString();
		System.out.println(string1);
		al.accept();
	}
	public static void toDismissAlert() {
		Alert al=driver.switchTo().alert();
		String string2 = al.toString();
		System.out.println(string2);
		al.dismiss();
	}
	public static void toGetAllOptionInDropDown(WebElement element) {
		Select s=new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement webElement1 : options) {
			System.out.println(webElement1.getText());
		}
	}
	public static void getAllSelectedOptions(WebElement element) {
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement webElement2 : allSelectedOptions) {
		System.out.println(webElement2.getText());
		}
	
	}
	public static void selectByIndex(int index) {
	s.selectByIndex(index);
	}
	public static void selectByVisibleText(String text3) {
	s.selectByVisibleText(text3);
	}
	public static void selectByvalue(String value) {
	s.selectByValue(value);
	}
	public static void switchWindow() {
	String parWin = driver.getWindowHandle();
	Set<String> allWin = driver.getWindowHandles();
	for (String eachWindow : allWin) {
		if (!(eachWindow).equals(parWin)) {
			driver.switchTo().window(eachWindow);
		}
	}
	
	}
	public static void QuitBrowser() {
		driver.quit();
}

}
