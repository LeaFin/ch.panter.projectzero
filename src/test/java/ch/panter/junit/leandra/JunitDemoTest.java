package ch.panter.junit.leandra;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

import ch.panter.junit.leandra.JunitDemo;

public class JunitDemoTest {
	
	private JunitDemo myinstance;
	
	// Create a new JunitDemo instance before
	// each Test.
	@Before
	public void init(){
		this.myinstance = new JunitDemo();
	}

	// Clean the instance variable after
	// each Test.
	@After
	public void clear(){
		this.myinstance  = null;
	}
	
	@Test
	public void isEmptyTest(){
		assertTrue(myinstance.isEmpty(""));
		assertTrue(myinstance.isEmpty(null));
		assertFalse(myinstance.isEmpty("Hallo"));
	}
	
	@Test
	public void capitalizeTest(){
		assertEquals(myinstance.capitalize("hallo"), "Hallo");
		assertEquals(myinstance.capitalize("aSDF"), "Asdf");
		assertEquals(myinstance.capitalize("UPPERCASE"), "Uppercase");
	}
	
	@Test
	public void reverseTest(){
		assertEquals(myinstance.reverse("chanGe Direction"), "noitceriD eGnahc");
	}
	
	@Test(expected=NullPointerException.class)
	public void insertNullTest(){
		myinstance.reverse(null);
	}
	
	@Test
	public void joinTest(){
		assertEquals(myinstance.join(" ", " "), "   ");
	}
}
