package fileHandlingExample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritinfIntoFileExample {

	public static void main(String[] args) throws IOException  {
		
		Properties obj = new Properties();
		
		FileOutputStream fos = new FileOutputStream("Config.Poperties");
				
		obj.setProperty("Name", "Jai");
		obj.setProperty("Department", "IT");
		
		obj.store(fos, "Information updated");

	}

}
