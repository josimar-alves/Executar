package teste;

import static org.testng.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testlink.api.java.client.TestLinkAPIException;
import testlink.api.java.client.TestLinkAPIResults;

public class Testar {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 30);
		driver.get("http://www.google.com/");
	}
	
	@Test
	public void teste01() throws TestLinkAPIException {
		int n = 1;
		try {
			assertEquals(n, 2);
			TestLinkConnection.updateResults("tc-1", "Passou 01", TestLinkAPIResults.TEST_PASSED);
		} catch (AssertionError e) {
			TestLinkConnection.updateResults("tc-1", "Falhou 01", TestLinkAPIResults.TEST_FAILED);
		}
	}
	
	@Test
	public void teste02() throws TestLinkAPIException {
		int n = 1;
		try {
			assertEquals(n, 2);
			TestLinkConnection.updateResults("tc-2", "Passou 02", TestLinkAPIResults.TEST_PASSED);
		} catch (AssertionError e) {
			TestLinkConnection.updateResults("tc-2", "Falhou 02", TestLinkAPIResults.TEST_FAILED);
		}
	}
	
	@Test
	public void teste03() throws TestLinkAPIException {
		int n = 1;
		try {
			assertEquals(n, 2);
			TestLinkConnection.updateResults("tc-3", "Passou 03", TestLinkAPIResults.TEST_PASSED);
		} catch (AssertionError e) {
			TestLinkConnection.updateResults("tc-3", "Falhou 03", TestLinkAPIResults.TEST_FAILED);
		}
	}
		
	
}