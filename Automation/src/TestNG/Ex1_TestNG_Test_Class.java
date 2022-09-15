package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex1_TestNG_Test_Class {
	@Test
		public void test()
		{
	//	 Reporter.log("quantum academy", false);//msz will be displayed in report but not in console
		 Reporter.log("quantum academy", true);//msz will be displayed in report also in console
		}
	}


