package first;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {

	@Test
	public void test_one() {
		int method = 1 / 0;
	}

	@BeforeTest
	public void test_two() {
		System.out.println("I am Running First Test 2");
	}

	@AfterTest
	public void test_three() {
		System.out.println("I am Running First Test 3");
	}

}
