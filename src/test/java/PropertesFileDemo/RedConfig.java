package PropertesFileDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class RedConfig {
	
	Properties properties;
	String path="C:\\Users\\Shree\\Desktop\\TestNG\\TestNG\\src\\test\\java\\PropertesFileDemo\\Config.properties";
	
	public RedConfig()
	{
		properties=new Properties();
		
		try {
			FileInputStream file = new FileInputStream(path);
			try {
				properties.load(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public String getURL()
	{
		String url=properties.getProperty("url");
		if(url!=null)
		{
			return url;
		}
		else
			throw new RuntimeException("url not spec. in config file");
	}
	public String getUname()
	{
		String uname=properties.getProperty("uname");
		if(uname!=null)
		{
			return uname;
		}
		else
			throw new RuntimeException("uname not spec. in config file");
	}
	public String getPwrd()
	{
		String pwrd=properties.getProperty("pwrd");
		if(pwrd!=null)
		{
			return pwrd;
		}
		else
			throw new RuntimeException("pwrd not spec. in config file");
	}

}
