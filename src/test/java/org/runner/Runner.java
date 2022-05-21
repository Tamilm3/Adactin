package org.runner;

import org.baseclass.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\", glue = "org.Step",dryRun = false,plugin = {"pretty","html:target", "junit:target\\report\\create.xml","json:target\\report\\login.json"},
monochrome = false)
public class Runner {
	@AfterClass
	public static void generateJVMReport() {
	JVMReport.JVMReportGeneration(System.getProperty("user.dir")+"\\target\\report\\login.json");
	}
}
