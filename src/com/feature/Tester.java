package com.feature;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tester {

	@Given("^I am a \"([a-zA-Z]{1,})\" Tester$")
	public void I_am_a_Manual_Tester(String TesterType)
	{
		System.out.println("------------------------------------------");
		System.out.println("@Given -- I am a "+TesterType+" Tester");
	}
	
	
	@When("^I apply for a job$")
	public void I_apply_for_a_job()
	{
		System.out.println("@When -- I apply for a job");
	}
	
	@Then("^I got a \"([a-zA-Z]{1,})\" paid job$")
	public void I_got_a_less_paid_job(String jobPaid)
	{
		
		System.out.println("@Then -- I got a "+jobPaid+" paid job");
	}
	
	@And("^I am \"([a-zA-Z]{1,})\" satisfied with my salary$")
	public void I_am_not_satisfied_with_my_salary(String satisfiedType)
	{
		System.out.println("@And -- I am "+satisfiedType+" satisfied with my salary");
	}
	
	@But("^My parents are \"([a-zA-Z]{1,})\" satisfied$")
	public void My_parents_are_still_satisfied(String parentSatisfiedType)
	{
		System.out.println("@But -- My parents are "+parentSatisfiedType+" satisfied");
	}
	
	
	
}
