package JunitTesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

public class JUnitAnnotation {

	@BeforeClass
	public static void beforeclass() {
		System.out.println("in before class");
	}
	
	@AfterClass
	public static void afterclass() {
		System.out.println("in after class");
	}
	
	@Before
	public void before() {
		System.out.println("in before");
	}
	@After
	public void after() {
		System.out.println("in after");
	}
	
	@Test
	public void test() {
		System.out.println("in test1");
	}
	
	@Test
	public void test1() {
		System.out.println("in test2");
	}
	
	@Ignore
	public void ingnore() {
		System.out.println("in ignore");
	}
	

}
