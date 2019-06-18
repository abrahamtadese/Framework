package ListernerDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListerner implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
	
		
	}

	@Override
	public void onStart(ITestContext arg0 ){
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("TestCases failed and details are "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("TestCases Skipped and details are "+result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("TestCases started and details are "+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("TestCases Sucess Hurry and details are "+result.getName());
	}

}
