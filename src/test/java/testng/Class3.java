package testng;

import org.testng.annotations.Test;

public class Class3 {
	@Test(groups = "sanity")
	public void method5() {
		System.out.println("Method 5 Thread id is "+ Thread.currentThread().getId());
	}
	@Test(groups = "smoke")
	public void method6() {
		System.out.println("Method 6 Thread id is "+ Thread.currentThread().getId());
	}

}
