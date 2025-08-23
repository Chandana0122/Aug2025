package com.orangehrm.tests;


import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangehrm.base.BaseTest;
import com.orangehrm.pages.Login_PageFactory;
import com.orangehrm.utilities.ExcelUtiles;
import com.orangehrm.utilities.Screenshot;

public class LoginOrangeHRM extends BaseTest {

    static String projectpath = System.getProperty("user.dir");

    @Test(dataProvider = "logindata")
    public void verifylogin(String username, String password) throws IOException {
        test = extent.createTest("Login with user: " + username);

        // Initialize Page Object
        Login_PageFactory loginPage = new Login_PageFactory(driver);

        // Perform actions
        loginPage.enterusername(username);
        loginPage.enterpassword(password);
        loginPage.clickonlogin();

        // Validate title
        String actualtitle = driver.getTitle();
        if (actualtitle.equalsIgnoreCase("OrangeHRM")) {
            test.pass("Login Successful. Title matched: " + actualtitle);
        } else {
            String screenpath = Screenshot.Capture(driver, "Login_Failed_" + username);
            test.fail("Login Failed. Title mismatch: " + actualtitle)
                .addScreenCaptureFromPath(screenpath);
        }
    }

    @DataProvider
    public Object[][] logindata() throws IOException {
        String excelpath = projectpath + "\\src\\test\\resources\\Testdata\\data.xlsx";
        return ExcelUtiles.getdata(excelpath, "Sheet1");
    }
}
