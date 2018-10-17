package com.password.valid;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestValPassword {

	@Test
	public void ValPassTest() {
		Validator val=new Validator();
		boolean result=val.valPassword("Sravani12");
		assertEquals(true,result);
	}

}
