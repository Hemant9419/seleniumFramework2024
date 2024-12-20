package practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		FileInputStream file= new FileInputStream("D:\\Automation project\\SeleniumFramework\\testData\\config.properties");
		
		Properties pro= new Properties();
		
		try {
			pro.load(file);
			
			System.out.println(pro.getProperty("Browser"));
			
			
			System.out.println(pro.getProperty("URL"));
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
