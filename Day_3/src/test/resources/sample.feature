#encoding: utf-8

Feature: Calculator functions

Scenario Outline: Calculator functions
	Given the inputs <expression>
	Then the Result field should be <Result>
	
Examples:
|expression |Result |
|"2 3 +" 	|"5.0"	|