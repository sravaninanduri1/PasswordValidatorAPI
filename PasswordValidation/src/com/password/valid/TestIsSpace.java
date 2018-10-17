package com.password.valid;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestIsSpace {

	@Test
	public void IsSpaceTest() {
		Validator val=new Validator();
		boolean result=val.isSpace("Sra vani");
		assertEquals(true,result);
	}

}
