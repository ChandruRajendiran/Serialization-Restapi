package org.vip2.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Properties;

import org.json.simple.JSONObject;

import com.sun.xml.fastinfoset.Encoder;

public  class Base {

		public static String user;
		public static String getData(String key) throws IOException{
		Properties prop= new Properties();
	
		prop.load(new FileInputStream("C:\\Users\\New\\eclipse-workspace\\Serialization\\org.source\\config.properties"));
		user=prop.getProperty(key);
		System.out.println(user);
		
		String s=encoder(user);
		return user;
		}
public static String encoder(String dta){
	

	String sd=Base64.getEncoder().encodeToString(dta.getBytes());
		System.out.println(sd);
	Decoder decode=	Base64.getDecoder();
byte[] b=	decode.decode(sd);
System.out.println(b);
return sd;
		
	}

}
