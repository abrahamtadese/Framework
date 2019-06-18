
package frameworkDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FrameworkDemo {

	@BeforeClass// first
	public static void setUpBeforeClass() throws Exception {
		System.out.println("This is before class");
	}

	@AfterClass //eight
	public static void tearDownAfterClass() throws Exception {
		System.out.println("This is after class");
	}

	@Before //second and fifth
	public void setUp() throws Exception {
		System.out.println("This is before method");
	}

	@After//fourth and seventh
	public void tearDown() throws Exception {
		System.out.println("This is after method");
	}

	@Test //third
	public void test() {
		System.out.println("This is your test1");
	}

	@Test //six
	public void test2() {
		System.out.println("This is your execution of test2");
	}

}
