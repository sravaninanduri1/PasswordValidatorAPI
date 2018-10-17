package com.password.valid;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	private final static Logger LOGGER = Logger.getLogger(Validator.class.getName());
	public static void main(String[] args) {
		String inputPassword;
		Scanner sc = new Scanner(System.in);
		inputPassword = sc.next();
		valPassword(inputPassword);
	}

	public static Boolean valPassword(String inputPassword) {
		if (inputPassword.length() > 7) {
			if (checkPass(inputPassword)) {
				return true;
			} else {
				return false;
			}
		} else {
			LOGGER.info("Too small");
			return false;
		}
	}

	// To check if password contains uppercase letter,lowercase letter and a
	// number
	public static boolean checkPass(String inputPassword) {
		boolean hasNum = false;
		boolean hasCap = false;
		boolean hasLow = false;
		char c;
		for (int i = 0; i < inputPassword.length(); i++) {
			c = inputPassword.charAt(i);
			if (Character.isDigit(c)) {
				hasNum = true;
			} else if (Character.isUpperCase(c)) {
				hasCap = true;
			} else if (Character.isLowerCase(c)) {
				hasLow = true;
			}
			if (hasNum && hasCap && hasLow) {
				return true;
			}
		}
		LOGGER.info("Password must have atleast one uppercase letter,one lowercase letter and one number");
		return false;
	}

	// to check if password contains white space
	public static boolean isSpace(String inputPassword) {
		for (char currentChar : inputPassword.toCharArray()) {

			if (Character.isWhitespace(currentChar)) {
				LOGGER.info("Password does not contain white space");
				return false;
			}

		}
		return true;
	}

	// to check if password contains special characters
	public static boolean hasSpecialCharacter(String inputPassword) {
		Pattern sPattern = Pattern.compile("[a-zA-Z0-9]*");
		Matcher sMatcher = sPattern.matcher(inputPassword);
		if (!sMatcher.matches()) {
			return true;
		}
		LOGGER.info("Password must contain atleast one special character");
		return false;
	}
}
