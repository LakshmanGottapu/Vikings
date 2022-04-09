package testcases;

import org.testng.annotations.Test;

public class BookingManager {
  @Test
  public void searchHotel() {
	  System.out.println("searched hotel"); 
  }
  @Test
  public void selectHotel() {
	  System.out.println("hotel selected");
  }
  @Test
  public void loadBooking() {
	  System.out.println("previous booking loaded");
  }
  @Test
  public void enterGuestInfo() {
	  System.out.println("entered guestinfo");  
  }
}
