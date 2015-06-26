package com.application.areca.launcher.tui;

import java.util.Iterator;

public class SimpleUserOption extends UserOption<String> {
	public SimpleUserOption(String name) {
		super(name);
	}
	
	public ParseResult parse(Iterator<String> iArgs) throws InvalidCommandException {
		if(!iArgs.hasNext()) {
			throw new InvalidCommandException("Option "+getName()+" requires an argument.");
		}
		return new ParseResult(null, iArgs.next());
	}
}