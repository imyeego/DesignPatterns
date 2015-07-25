package com.liu.factory;

import java.util.Map;

/**
 * HairFactory
 * @author liuzhao
 *
 */

public class HairFactory {
	
	
	public HairInter getHair(String key){
		if("left".equals(key))
			return new LeftHair();
		else if("right".equals(key))
			return new RightHair();
		
		return null;
	}
	
	public HairInter getHairByClassKey(String key){
		try {
			
			Map<String,String> map = new PropertiesReader().getProperties();
			HairInter hair = (HairInter) Class.forName(map.get(key)).newInstance();  //反射机制
			
			return hair;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}
}
