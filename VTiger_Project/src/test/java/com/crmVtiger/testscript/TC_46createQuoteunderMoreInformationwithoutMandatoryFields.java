package com.crmVtiger.testscript;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.Vtiger.pomrepositorylib.Contacts;
import com.Vtiger.pomrepositorylib.HomePageInfo;
import com.crm.vtiger.GenericUtils.BaseClass;

public class TC_46createQuoteunderMoreInformationwithoutMandatoryFields extends BaseClass {
	@Test
	public void TC_46createQuoteunderMoreInformationwithoutMandatoryFieldsTest() {
		HomePageInfo homePgLk=new HomePageInfo(driver);
		homePgLk.getContLink().click();
		
		Contacts con=new Contacts(driver);
		con.getBhagya().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		con.moveToMoreInfo();
		
		
	}

}
