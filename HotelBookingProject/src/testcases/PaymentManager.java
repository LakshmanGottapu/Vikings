package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PaymentManager {
  @Test
  public void applyDiscount() {
	  System.out.println("discount applied");
  }
  
  @Test
  @Parameters("action")
  public void makePayment(String action,ITestContext context) {
	  //System.out.println("payment is made");
	  if(action.equals("cash")) System.out.println("payment is made through cash");
	  else if(action.equals("digital")) System.out.println("payment is made through digital platform");
	  String Bookingid = "RRR25032022";
	  context.setAttribute("Bid",Bookingid);
  }
}
