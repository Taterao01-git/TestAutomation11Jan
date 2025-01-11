Feature: Test facebook application

Scenario Outline: validate register page functionality

			Given user is on register page
			When user enter "<firstname>" and "<lastname>"
			And user select "<date>" and "<month>" and "<year>"
			And user enters "<username>" and "<password>"
			
	Examples:
						|firstname|lastname|date|month|year|username|password|
						|Rajkumar |Gaikwad |10  |Nov  |1990|rajkumar123@gmail.om|pass@123|
						|Amit |Patil |11  |Nov  |1995|amit@gmail.om|pass@123|
						
						