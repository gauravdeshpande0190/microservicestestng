package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class testcase1 {
	 @Test  
	    public void testFindMax(){  
	        Assert.assertEquals(1,1);  
	       System.out.println("case1");
	    }  
	    @Test  
	    public void testFindMax2(){  
	    	 System.out.println("case2");
	    	given().when().get("https://www.amazon.in").then().assertThat().statusCode(501);
	    	} 
}
