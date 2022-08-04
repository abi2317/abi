package com.Runner;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Cucu.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "\\src\\test\\java\\com\\Feature",
		glue = "com.Stepdefination"

		
		)
public class Runner {

	
public static WebDriver driver;	
	
	@BeforeClass
	public  static  void setUp() throws Exception {
	driver = BaseClass.GetBrowser("chrome");
	}
	@AfterClass 
	public  static void teardown() {
driver = BaseClass.close();
	
}}
