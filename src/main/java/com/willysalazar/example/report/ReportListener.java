package com.willysalazar.example.report;

import com.aventstack.extentreports.service.ExtentTestManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.willysalazar.example.utils.BaseTest;

public class ReportListener implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        reportPrint();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        reportPrint();
    }

    private void reportPrint() {
        ExtentTestManager.getTest().addScreenCaptureFromBase64String(takeScreenshot());
    }

    private String takeScreenshot() {
        return ((TakesScreenshot) BaseTest.getDriver()).getScreenshotAs(OutputType.BASE64);
    }
}
