package teste;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
	
//	@Test
//	public void teste01() throws TestLinkAPIException {
//		int n = 1;
//		if (n == 1) {
//			TestLinkConnection.updateResults("tc-1", "Passou 01", TestLinkAPIResults.TEST_PASSED);
//		} else {
//			TestLinkConnection.updateResults("tc-1", "Falhou 01", TestLinkAPIResults.TEST_FAILED);
//		}
//		assertEquals(n, 1);
//	}
//	
//	@Test
//	public void teste02() throws TestLinkAPIException {
//		int n = 1;
//		
//		try {
//			TestLinkConnection.updateResults("tc-1", "Passou 01", TestLinkAPIResults.TEST_PASSED);
//		} catch (AssertionError e) {
//			TestLinkConnection.updateResults("tc-1", "Falhou 01", TestLinkAPIResults.TEST_FAILED);
//		}
//		assertEquals(n, 1);
//	}
//	
//	@Test
//	public void teste03() throws TestLinkAPIException {
//		int n = 1;
//		if (n == 1) {
//			TestLinkConnection.updateResults("tc-1", "Passou 01", TestLinkAPIResults.TEST_PASSED);
//		} else {
//			TestLinkConnection.updateResults("tc-1", "Falhou 01", TestLinkAPIResults.TEST_FAILED);
//		}
//		assertEquals(n, 1);
//	}
	
	@Test
	public void teste01() throws TestLinkAPIException {
		int n = 1;
		sendResult(n == 1, "tc-1", "Falhou 01");
	}
	
	@Test
	public void teste02() throws TestLinkAPIException {
		int n = 2;
		sendResult(n == 2, "tc-2", "Falhou 02");
	}
	
	@Test
	public void teste03() throws TestLinkAPIException {
		int n = 2;
		sendResult(n == 2, "tc-3", "Falhou 03");
	}
	
	public void sendResult(boolean result, String tcName, String tcDesciption) throws TestLinkAPIException {
		if (result) {
			TestLinkConnection.updateResults(tcName, tcDesciption, TestLinkAPIResults.TEST_PASSED);
		} else {
			TestLinkConnection.updateResults(tcName, tcDesciption, TestLinkAPIResults.TEST_FAILED);
		}
		assertTrue(result);		
	}
		
	
}