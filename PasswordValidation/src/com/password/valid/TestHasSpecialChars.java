package com.password.valid;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHasSpecialChars {

	@Test
	public void SpecialCharsTest() {
		Validator val=new Validator();
		boolean result=val.hasSpecialCharacter("Sravani@12");
		assertEquals(true,result);
	}
}
