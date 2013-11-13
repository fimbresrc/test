/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pearson.lt.sets.admin.tests.maven;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

/**
 *
 * @author ufimbre
 */
public class myTestCase {
	private Selenium selenium;
        private int DEFAULT_TIMEOUT = 50000;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "https://www.google.com/");
		selenium.start();
	}

	@Test
	public void testExportTestCase() throws Exception {
		selenium.open("/");
                selenium.waitForPageToLoad("20000");
		selenium.type("id=gbqfq", "selenium");
		selenium.captureEntirePageScreenshot("~/screenshot.png", "");

	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
