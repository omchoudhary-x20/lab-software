package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions Junit=new jUnitFunctions();
		String result=Junit.AddStrings("Nishant","Agarwal");
		assertEquals ("NishantAgarwal",result);
	}

}