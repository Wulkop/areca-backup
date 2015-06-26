package com.application.areca;

public class TargetNotAnAbstractTargetException extends Exception {

	public TargetNotAnAbstractTargetException(String uid) {
		super("The target "+uid+" is not an abstract target.");
	}
}
