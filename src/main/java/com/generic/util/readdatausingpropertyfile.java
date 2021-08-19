package com.generic.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readdatausingpropertyfile implements Autoconstants{

	public String getdata(String Key) throws FileNotFoundException, IOException
	{
		Properties property=new Properties();
		property.load(new FileInputStream(propertyfilepath));
		return property.getProperty(Key);





	}
}

