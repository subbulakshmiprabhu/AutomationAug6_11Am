package listenerdemo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer{
	
	int count  = 0;
    //int max =3;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count < 3 ) {
			count++;
		return true;
		}
		else {
		return false;
		}
		
		
	}

}
