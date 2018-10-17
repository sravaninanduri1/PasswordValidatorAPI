package com.password.valid;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCheckPass.class, TestHasSpecialChars.class,
		TestIsSpace.class, TestValPassword.class })
public class AllTests {

}
