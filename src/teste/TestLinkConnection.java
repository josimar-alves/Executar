package teste;

import testlink.api.java.client.TestLinkAPIClient;
import testlink.api.java.client.TestLinkAPIException;
//import org.apache.xmlrpc.XmlRpcException;
//import org.apache.xmlrpc.client.XmlRpcClient;
//import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class TestLinkConnection {
	
	public static final String TESTLINK_KEY = "b42df8665892662b898634d38396c4fb";
	public static final String TESTLINK_URL = "http://localhost/testlink/lib/api/xmlrpc/v1/xmlrpc.php";
	public static final String TEST_PROJECT_NAME = "Selenium";
	public static final String TEST_PLAN_NAME = "test";
	public static final String BUILD_NAME = "v0.0.1";
	
	public static void updateResults (String tc, String exception, String results) throws TestLinkAPIException {
		TestLinkAPIClient testlink = new TestLinkAPIClient(TESTLINK_KEY, TESTLINK_URL);
		testlink.reportTestCaseResult(TEST_PROJECT_NAME, TEST_PLAN_NAME, tc, BUILD_NAME, exception, results);
	}
}
