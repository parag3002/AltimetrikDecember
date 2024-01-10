package api.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import api.endpoint.MockDataGeneration;
import api.utility.FileReadUtility;
import api.utility.PropertyReader;
import io.restassured.response.Response;

public class TestMockDataGeneration 
{

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("----beforeMethod-----");
		
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("----beforeTest-----");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("----beforeClass-----");
	}
	
	
	
	@Test(groups = "Regression" , description = " ==========Regression =======")
	public void testCreateMockUser()
	{
		
		Response response = MockDataGeneration.mockDataCollection("pathCreateMockUserFile","createMockUser");
		
		response .then().log().all();
	}
	
	
	
	@Test(priority=2, groups = "smoke" , enabled = false)
	public void testCreateMockPurchase()
	{
		
		Response response = MockDataGeneration.mockDataCollection("pathCreateMockPurchase","createMockPurchase");
		
		response .then().log().all();
	}
	
	
	
	@Test(priority=3, groups = "Regression")
	public void testCreateMockBlogPost()
	{
		Response response = MockDataGeneration.mockDataCollection("pathCreateMockBlogPost","createMockPurchase");
		
		response.then().log().all();
		
	}
	
}
