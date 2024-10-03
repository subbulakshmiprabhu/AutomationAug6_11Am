package testng;

import org.testng.annotations.Test;

public class Class2 {
	@Test(groups = "regression")
	
	public void method3() {
		System.out.println("Method 3 Thread id is "+ Thread.currentThread().getId());
	}
	@Test(groups = "smoke")
	public void method4() {
		System.out.println("Method 4 Thread id is "+ Thread.currentThread().getId());
	}

}
