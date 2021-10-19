package com.crm.vtiger.GenericUtils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class ListnerImplementation extends BaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		
	}

	public void onTestFailure(ITestResult result) {
		TakesScreenshot takescreenshot = (TakesScreenshot)BaseClass.staticdriver;
		File source = takescreenshot.getScreenshotAs(OutputType.FILE);
		String screenshotpath = System.getProperty("user.dir")+"//screenshot//"
				+result.getMethod().getMethodName()+"_"+JavaUtility.getCurrentDate()+".PNG";
		File dest=new File(screenshotpath);
		try {
			Files.copy(source, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}
	

}
