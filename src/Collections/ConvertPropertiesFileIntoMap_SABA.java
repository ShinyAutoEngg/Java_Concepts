package Collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ConvertPropertiesFileIntoMap_SABA
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Shiny Ingrid C\\git\\nayavalaJava\\Java\\CommonData.properties");
		Map<Object,Object> map = new Properties();  //upcast
		((Properties)map).load(fis);  //downcast to access Properties load method
		System.out.println(map);
		
		
		Properties prop = new Properties();
		Map<Object,Object> map1 = new HashMap<>();
		prop.load(fis);
		
		for(String key :prop.stringPropertyNames())
		{
			map1.put(key, prop.getProperty(key));
		}
		System.out.println(map);
	}
}
