import java.io.*;
import java.net.*;

public class test2 {

	  public static void main(String[] args) throws Exception {	  
		  
		  String url = "http://paleobiodb.org/";
		  String service = "data1.2/";
		  String operation = "taxa/list";
		  String format = ".json";
		  String join = "?";
		  //String param1 = "datainfo&";
		  //String param2 = "rowcount&";
		  String param3 = "base_";
		  String param4 = "name=Turritellidae";
		 
		  //https://paleobiodb.org/data1.2/taxa/list.json?datainfo&rowcount&base_name=Dascillidae
		  
		  URL urlTest = new URL("https://paleobiodb.org/data1.2/occs/diversity.json?datainfo&rowcount&base_name=Turritellidae&count=genera");
		  
		  //formating the query
		  String query = service + operation + format + join + param3 + param4;
			
		  //create the url
		  URL urlFull = new URL(url + query);
		  
		  // open the url stream, wrap it an a few "readers"
		  HttpURLConnection con = (HttpURLConnection) urlTest.openConnection();
		  con.setRequestMethod("GET");	  
		  BufferedReader reader = new BufferedReader(new InputStreamReader(urlTest.openStream()));
		  
		  // write the output to stdout
		  String line;
		  while ((line = reader.readLine()) != null) {
			  System.out.println(line);
	    }

	    // close everything
		con.disconnect();
	    reader.close();
	  }

	
}
