package api.utility;

import java.io.File;

import org.json.JSONTokener;

import com.google.gson.JsonObject;

import java.io.*;



public class FileReadUtility 
{

	static java.io.File file;
	static java.io.FileReader fileReader;
	static org.json.JSONObject jsonObject;
	private static String fileData;;
	
	public static String readFile(String path)
	{
		
		
		try
		{
			file = new java.io.File(path);
			fileReader = new java.io.FileReader(file);
			JSONTokener jsonToken = new JSONTokener(fileReader);
			jsonObject = new org.json.JSONObject(jsonToken);
			fileData = jsonObject.toString();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		return fileData;
	}
	
	
//	public static void main(String args[])
//	{
//		String s = readFile(".\\\\src\\\\test\\\\resources\\\\mockDataGeneration\\\\createMockBlogPost.json");
//		System.out.println(s);
//	}
}

