package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class CustomerCommunication {
  @Test
  public void checkEmailVerification(ITestContext context) {
	  System.out.println("email verified");
	  System.out.println("booking id is "+context.getAttribute("Bid"));
  }
 
  @Test
  public void checkMobileVerification(ITestContext context) {
	  System.out.println("mobile verified");
	  System.out.println("booking id is "+context.getAttribute("Bid"));
  }
  
}
