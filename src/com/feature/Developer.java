package com.feature;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Developer {

	@Given("^I am a \"([a-zA-Z]{1,})\" Developer$")
	public void I_am_a_CoreJava_Developer(String developerType)
	{
		System.out.println("--------------------------------------------");
		System.out.println("@Given -- I am a "+developerType+" Developer");
	}
	
	@When("^I started Development$")
	public void I_started_Development()
	{
		System.out.println("@When -- I started Development");
	}
	
	@Then("^I created a \"([a-zA-Z]{1,})\" java program$")
	public void I_created_a_simple_java_program(String programType)
	{
		System.out.println("@Then -- I created a "+programType+" java program");
	}
	
	@And("^I am \"([a-zA-Z]{1,})\" experienced$")
	public void I_am_very_experienced(String experiencedType)
	{
		System.out.println("@And -- I am "+experiencedType+" experienced");
	}
	
	@But("^My Boss is \"([a-zA-Z]{1,})\" satisfied$")
	public void My_Boss_is_still_satisfied(String bosssatisfiedType)
	{
		System.out.println("@But -- My Boss is "+bosssatisfiedType+" satisfied");
	}
}
