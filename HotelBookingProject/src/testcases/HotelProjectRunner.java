package testcases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class HotelProjectRunner {

	public static void main(String[] args) {
		TestNG testng = new TestNG();
		
		XmlSuite mysuite = new XmlSuite();
		mysuite.setName("defaultsuite");
		
		List<XmlSuite>allsuites = new ArrayList<XmlSuite>();
		allsuites.add(mysuite);
		
		testng.setXmlSuites(allsuites);
		
		XmlTest test = new XmlTest(mysuite);
		test.setName("bookingtest@hotelpayment");
		
		//creating and adding parameters to the test
		Map<String, String> parameters = new HashMap<String, String>();
	    parameters.put("action", "cash");
		test.setParameters(parameters);
		
		//creating class1 - BookingManager and inlcuding methods while setting priorities
		XmlClass class1 = new XmlClass("testcases.BookingManager");
		//adding and giving priority to methods of the class1 
	    List<XmlInclude>methods = new ArrayList<XmlInclude>();
		methods.add(new XmlInclude("searchHotel", 0));
		methods.add(new XmlInclude("selectHotel", 1));
		methods.add(new XmlInclude("enterGuestInfo", 2));
		class1.setIncludedMethods(methods);
		
		//creating class2 - PaymentManager and inlcuding methods while setting priorities
		XmlClass class2 = new XmlClass("testcases.PaymentManager");
		//adding and giving priority to methods of the class2
		methods = new ArrayList<XmlInclude>();
		methods.add(new XmlInclude("applyDiscount", 0));
		methods.add(new XmlInclude("makePayment", 1));
		class2.setIncludedMethods(methods);
		
		//creating class3 - CustomerCommunication and inlcuding methods while setting priorities
		XmlClass class3 = new XmlClass("testcases.CustomerCommunication");
		//adding and giving priority to methods of the class3
		methods = new ArrayList<XmlInclude>();
		methods.add(new XmlInclude("checkEmailVerification", 0));
		//methods.add(new XmlInclude("checkMobileVerification", 1));
		class3.setIncludedMethods(methods);
		
		List<XmlClass>classes = new ArrayList<XmlClass>();
		classes.add(0, class1);
		classes.add(1, class2);
		classes.add(2, class3);
		
		test.setClasses(classes);
		
		testng.run();
		
	}

}
