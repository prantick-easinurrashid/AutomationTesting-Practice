package locator;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.DriverSetup;

public class Locator_learning_Advance extends DriverSetup{
	
	@Test
	public void LocateRadioButton1ByCssSelector() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radio_Btton_one = driver.findElement(By.cssSelector("input[value='radio1']"));
		radio_Btton_one.click();
		Thread.sleep(4000);
	}
	@Test
	public void radiocheck() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement rad2 = driver.findElement(By.cssSelector("input.radioButton[value=radio2]"));
		rad2.click();
		boolean isSel = rad2.isSelected();
		assertEquals(isSel, true);
		Thread.sleep(5000);
		driver.quit();
	}
	@Test
	public void radioTest() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement radio_Btton_one = driver.findElement(By.cssSelector("input[value='radio1']"));
		radio_Btton_one.click();
		Thread.sleep(3000);
		
		WebElement rad2 = driver.findElement(By.cssSelector("input.radioButton[value=radio2]"));
		rad2.click();
		boolean isSel1 = radio_Btton_one.isSelected();
		assertEquals(isSel1, true); //fail, once one selected another should be false
		Thread.sleep(3000);	
	}
	
	@Test
	public void LocateRadioButton2ByXpath() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println("prantickkkkkkkkkkkkkk");
		WebElement radio_Btton_two = driver.findElement(By.xpath("//input[@value='radio2']"));
		radio_Btton_two.click();
		Thread.sleep(4000);
	}
	
	@Test
	public void radX() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement rad = driver.findElement(By.xpath("//input[@value='radio2']"));
		rad.click();
	}
	
	@Test
	public void LocateHeadingByCssSelectorTagname() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement h1 = driver.findElement(By.cssSelector("h1"));
		System.out.println(h1.getText());
		Thread.sleep(4000);
	}
	
	@Test
	public void LocateHeadingByXpathTagname() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement h1 = driver.findElement(By.xpath("//h1"));
		System.out.println(h1.getText());
		Thread.sleep(4000);
	}
	
	@Test
	public void LocateRadioButtonExampleByCssSelectorDirectChild() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radioButtonExample = driver.findElement(By.cssSelector("fieldset > legend"));
		System.out.println(radioButtonExample.getText());
		Thread.sleep(4000);
	}
	
	
	@Test
	public void LocateRadioButtonExampleByXpathDirectChild() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radioButtonExample = driver.findElement(By.xpath("//fieldset /legend"));
		System.out.println(radioButtonExample.getText());
		Thread.sleep(4000);
	}
	
	
	@Test
	public void LocateCheckBoxByCssSelectorMultipleAttributes() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement checkbox1 = driver.findElement(By.cssSelector("input[type='checkbox'][name='checkBoxOption1']"));
		checkbox1.click();
		Thread.sleep(4000);
	}
	
	@Test
	public void LocateCheckBoxByXpathMultipleAttributes() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox' and @name='checkBoxOption1']"));
		checkbox1.click();
		Thread.sleep(4000);
	}
	
	@Test
	public void LocateSelectOptionByCssSelectorSubString() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement selectoption = driver.findElement(By.cssSelector("select[id *='dropdown-class']"));
		selectoption.click();
		Thread.sleep(4000);
	}
	
	@Test
	public void LocateSelectOptionByXpathSubString() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement selectoption = driver.findElement(By.xpath("//select[contains(@id, 'dropdown-class')]"));
		selectoption.click();
		Thread.sleep(4000);
	}
	
	@Test
	public void LocateSelectOptionByCssSelectorStartWith() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement selectoption = driver.findElement(By.cssSelector("select[id ^='dropdown-class']"));
		selectoption.click();
		Thread.sleep(4000);
	}
	

	@Test
	public void LocateSelectOptionByXpathStartWith() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement selectoption = driver.findElement(By.xpath("//select[starts-with(@id, 'dropdown-class')]"));
		selectoption.click();
		Thread.sleep(4000);
	}

	@Test
	public void LocateSelectOptionByCssSelectorEndWith() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement selectoption = driver.findElement(By.cssSelector("select[id $='pdown-class-example']"));
		selectoption.click();
		Thread.sleep(4000);
	}
	




}
