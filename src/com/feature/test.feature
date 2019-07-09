Feature: About Testers

In order to get a high paid job
As a Tester
I want to learn Automation

Scenario outline: I am a Manual Tester

Given I am a "<TesterType>" Tester
When I apply for a job
Then I got a "<jobPaid>" paid job
And I am "<satisfiedType>" satisfied with my salary
But My parents are "<parentSatisfiedType>" satisfied


Examples: 
	| TesterType | jobPaid | satisfiedType | parentSatisfiedType |
	| Manual	 |	less   | good          | highly              |
	| Database   |  high   | very good     | very high           |
	
	
	
