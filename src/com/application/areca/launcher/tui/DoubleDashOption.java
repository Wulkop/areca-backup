package com.application.areca.launcher.tui;

import java.util.ArrayList;
import java.util.Iterator;

public class DoubleDashOption extends UserOption<Iterator<String>> {
	public DoubleDashOption(String name) {
		super(name);
	}
	
	public ParseResult parse(Iterator<String> iArgs) {
		ArrayList<String> values = new ArrayList<String>();
		while(iArgs.hasNext()) {
			values.add(iArgs.next());
		}
		return new ParseResult(null, values.iterator());
	}
}