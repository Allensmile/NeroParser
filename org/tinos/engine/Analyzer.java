package org.tinos.engine;
import java.io.IOException;
import java.util.List;
public interface Analyzer {
	public void init() throws IOException;
	public List<String> parserString(String input);
	public void parserStringWithType(String[] types, String string);
}

 