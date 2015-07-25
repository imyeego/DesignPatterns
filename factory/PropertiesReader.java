package com.liu.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * class of Reading Properties file 
 * @author liuzhao
 *
 */

public class PropertiesReader {
	public Map<String,String> getProperties(){
		Map<String,String> map = new HashMap<String,String>();
		Properties prop = new Properties();
		
		InputStream in = getClass().getResourceAsStream("type.properties");
		try {
			prop.load(in);
			Enumeration<?> en = prop.propertyNames();
			while(en.hasMoreElements()){
				String key = (String) en.nextElement();
				String property = prop.getProperty(key);
				map.put(key, property);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}
}
