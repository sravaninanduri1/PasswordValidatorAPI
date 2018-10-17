package com.password.valid;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCheckPass {

	@Test
	public void CheckPassTest() {
		Validator val=new Validator();
		boolean result=val.checkPass("Sravani12");
		assertEquals(true,result);
		//Assert.assertFalse(val.checkPass("wer23");
	}
    
}
