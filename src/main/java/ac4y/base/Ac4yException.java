package ac4y.base;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

public class Ac4yException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Ac4yException(){
	    super();
	}
	
	public Ac4yException(String message){
	    super(message);
	}

	public String getStackTraceAsString(Throwable aThrowable) {
	    final Writer result = new StringWriter();
	    final PrintWriter printWriter = new PrintWriter(result);
	    aThrowable.printStackTrace(printWriter);
	    return result.toString();
	  }	
	
}
