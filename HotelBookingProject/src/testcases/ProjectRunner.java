package testcases;

import java.util.List;
import java.util.ArrayList;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class ProjectRunner {

	public static void main(String[] args) {
		
		 TestNG testng = new TestNG();
		 List<XmlSuite> suites = new ArrayList<XmlSuite>();
		 XmlSuite mysuite = new XmlSuite();
		 mysuite.setName("defaultsuite");
		 suites.add(mysuite);
		 
		 XmlTest test = new XmlTest(mysuite);
		 test.setName("login test");
		 
		 List<XmlClass> testclasses = new ArrayList<XmlClass>();
		 testclasses.add(new XmlClass(testcases.LoginTest.class));
		 
		 test.setClasses(testclasses);
		 
		 testng.setXmlSuites(suites);
		
		 testng.run();

	}

}
