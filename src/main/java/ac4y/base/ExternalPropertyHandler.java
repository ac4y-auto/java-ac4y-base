package ac4y.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ExternalPropertyHandler extends Properties {

	public void throwNoProperties(String aPropertiesName) throws Ac4yException {
		//System.out.println("Nincs meg a(z) "+aPropertiesName + " allomany!");
		throw new Ac4yException("Nincs meg a(z) >"+aPropertiesName + "< allomany1!");
	} // throwNoProperties
	
	public Properties getPropertiesFromClassPath(String aPropertiesName) throws IOException, Ac4yException {

	  	Properties properties = new Properties();
		
	  		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(aPropertiesName);

	  		if 	(inputStream!=null)
	  			properties.load(inputStream);
	  		else 
	  			throwNoProperties(aPropertiesName);

	  	return properties;
							
	} // getPropertiesFromClassPath

	public Properties getPropertiesFromPath(String aFileName) throws IOException, Ac4yException{
		System.out.println("getPropertiesFromPath");
		
		Properties properties = new Properties();
		InputStream inputStream = null;

			inputStream = new FileInputStream(aFileName);
			
			properties.load(inputStream);

			//System.out.println(prop.getProperty("connectionString"));

			if (inputStream != null)
				inputStream.close();
			else
				throwNoProperties(aFileName);
			
	  	return properties;
							
	} // getPropertiesFromPath
	
} // ExternalPropertyHandler
