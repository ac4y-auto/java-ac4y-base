package ac4y.base.http;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import com.sun.net.httpserver.HttpExchange;

import ac4y.utility.StringHandler;

public class Ac4yHttpService {

	  public void writeResponse(HttpExchange httpExchange, String response) throws IOException {
		    httpExchange.sendResponseHeaders(200, response.length());
		    OutputStream os = httpExchange.getResponseBody();
		    os.write(response.getBytes());
		    os.close();
	  } // writeResponse

	  public Map<String, String> queryToMap(String query){
		    Map<String, String> result = new HashMap<String, String>();
		    for (String param : query.split("&")) {
		        String pair[] = param.split("=");
		        if (pair.length>1) {
		            result.put(pair[0], pair[1]);
		        }else{
		            result.put(pair[0], "");
		        }
		    }
		    return result;

	  } // queryToMap

	  public String queryToJson(String query){
		  
		    Map<String, String> result = new HashMap<String, String>();
		    
		    String json=null;
		    
		    for (String param : query.split("&")) {
		        String pair[] = param.split("=");
		        if (pair.length>1) {
		        	json=new StringHandler().concatSmart(json, "\""+pair[0]+"\":\""+pair[1]+"\"", ",");
		        }else{
		        	json=new StringHandler().concatSmart(json, "\""+pair[0]+"\":", ",");
		        }
		    }
		    
		    return "{"+json+"}";

	  } // queryToMap	 
	  
	  public String getParameterValue(HttpExchange aHttpExchange, String aParameterName) throws IOException {
		  
		  Map <String,String>parameters = queryToMap(aHttpExchange.getRequestURI().getQuery());
		  
		  return parameters.get(aParameterName); 
		  
	  } // getParameterValue
	  
	  
}
