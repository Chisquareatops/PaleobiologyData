import java.io.*;
import java.net.*;

public class getData {

	String url = "http://paleobiodb.org/";
	String service = "data1.2/";  // Or in Java 7 and later, use the constant: java.nio.charset.StandardCharsets.UTF_8.name()
	String operation = "taxa/single";
	String format = "json";
	String params = "name=Dascillidae";

	//formating the query
	String query = String.format("operation=%s&format2=%sparams=%s");
	
	//performing the GET request	
	InputStream createInput(String urlString) throws IOException {
		URLConnection connection;
		InputStream response;
		try {
			connection = new URL(url + "?" + query).openConnection();
			response = connection.getInputStream();
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
		return response;
	}


	
}
