package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddnumbers {

	@Test
	public void test() {
		jUnitFunctions junit= new jUnitFunctions();
		int result =junit.addnumbers(100,200);
		assertEquals (300, result);
	
	}

}
