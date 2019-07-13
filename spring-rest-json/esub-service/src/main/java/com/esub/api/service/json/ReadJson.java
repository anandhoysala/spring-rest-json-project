package com.esub.api.service.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJson {
		
	public static void main(String[] args)
    {
		display();
    }
 
	private static void display() {
		 //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("myquestion.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray json = (JSONArray) obj;
            Map<String, String> questionMap  =  new LinkedHashMap<String, String>();
            for(Object o : json) {
            	JSONObject qno = (JSONObject) o;
            	questionMap.put(""+qno.get("qno"), ""+qno.get("question"));
            }
            System.out.println(questionMap);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
	}	  
}
