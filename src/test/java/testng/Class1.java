package testng;

import org.testng.annotations.Test;

public class Class1 {
	@Test(groups = { "regression", "smoke"})
	public void method1() {
		System.out.println("Method 1 Thread id is "+ Thread.currentThread().getId());
	}

	@Test(groups = "sanity")
	public void method2() {
		System.out.println("Method 2 Thread id is "+ Thread.currentThread().getId());
	}
}
