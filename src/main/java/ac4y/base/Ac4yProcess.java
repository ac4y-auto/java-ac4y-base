package ac4y.base;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ac4yProcess  {
	
	public Ac4yProcess() {
	}
	
	public Object process(Object aObject) throws ClassNotFoundException, Ac4yException, SQLException, IOException, ParseException {
		return null;
	}
		
}