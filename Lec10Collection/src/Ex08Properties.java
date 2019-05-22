import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Ex08Properties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties prop = new Properties();
		/*
		prop.setProperty("user_id", "san");
		prop.setProperty("user_name", "이산");
		
		System.out.println("user_id = " + prop.getProperty("user_id"));
		System.out.println("user_name = " + prop.getProperty("user_name"));
		*/
		
		prop.load(new FileReader("src/application.properties"));
		
		//prop.list(System.out);
		String driver = prop.getProperty("driver");
		
		//Class.forName("driver");
		String url = prop.getProperty("url");
		String user = prop.getProperty("user");
		String password = prop.getProperty("password");
		
		System.out.println("dirver : " + driver);
		System.out.println("url : " + url);
		System.out.println("user : " + user);
		System.out.println("password : " + password);
		
		prop.storeToXML(new FileOutputStream("application.xml"), "Property Configuration");
	}
}
