package de.HFB.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import de.HFB.pageObjects.LoginPage;

public class Functional_TC_loginTest_001 extends BaseClass {

	@Test
	public void loginTest() {

		LoginPage lp = new LoginPage(driver);
		log.info("base URL open");

		lp.setUserName(username);
		log.info("username entered");

		lp.setpassword(password);
		log.info("password entered");

		lp.clickSubmit();

		if (driver.getTitle().equals("Sonnen batteries")) {
			Assert.assertTrue(false);
		} else {
			Assert.assertTrue(true);
		}
	}

}
