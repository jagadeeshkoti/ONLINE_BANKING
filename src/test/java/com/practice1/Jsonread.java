package com.practice1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.mysql.cj.xdevapi.JsonParser;

public class Jsonread {
public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
	JSONParser p = new JSONParser();
	Object obj = p.parse(new FileReader(".\\src\\test\\resources\\b.json"));
	
	      JSONObject map = (JSONObject) obj;
	      System.out.println(map.get("username"));
	      System.out.println(map.get("password"));
	      System.out.println(map.get("url"));
	      System.out.println(map.get("browser"));
}
}
