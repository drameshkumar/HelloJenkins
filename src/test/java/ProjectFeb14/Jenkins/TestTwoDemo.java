package ProjectFeb14.Jenkins;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestTwoDemo {

	@Before
	public void login() {
		System.out.println("login==");
	}

	@Test
	public void addTocart() {
		System.out.println("addTocart==");
	}

	@After
	public void logout() {
		System.out.println("logout==");
	}

}
