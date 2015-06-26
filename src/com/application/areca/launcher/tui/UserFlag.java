package com.application.areca.launcher.tui;

import java.util.Iterator;

public class UserFlag extends UserOption<Boolean> {
	public UserFlag(String name) {
		super(name);
	}
	
	@Override
	public ParseResult parse(Iterator<String> iArgs) {
		return new ParseResult(null, true);
	}
}
