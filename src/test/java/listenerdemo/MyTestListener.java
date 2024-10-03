package listenerdemo;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener extends FbLogin  implements ITestListener{
	
	
	public void onTestStart(ITestResult result) {
	    // not implemented
		System.out.println("on test start");
	  }
	
	public void onTestSuccess(ITestResult result) {
	    // not implemented
		
		System.out.println("on test success");
	  }
	
	public void onTestFailure(ITestResult result) {
	    // not implemented
		System.out.println("on test failure");
		
		try {
			captureCompleteScreenShot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	
	public void onStart(ITestContext context) {
	    // not implemented
		
		System.out.println("on start");
	  }

	
	public void onFinish(ITestContext context) {
	    // not implemented
		System.out.println("on finish");
	  }

}
