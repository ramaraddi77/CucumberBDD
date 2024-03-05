package Runnerclass;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"C:\\Users\\admin\\eclipse-workspace1\\CucumberBDD\\src\\test\\java\\FeatureFile\\BantuGuru.feature"},
		glue = {"StepDefinition"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:Reportss//test1.html"}
		)
public class runnerClass extends AbstractTestNGCucumberTests
{
	@Test
	public void testscripts()
	{
		
	}
}
