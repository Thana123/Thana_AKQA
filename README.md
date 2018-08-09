# Thana_AKQA

About the Framework

	This framework has been created for AKQA interview purpose. 

	 Scenario : 
    1. Visit Search Result page with the search term “Paint”: https://www.bunnings.com.au/search/products?q=paint&redirectFrom=Any
    
    2. Randomly visit one product from the Search Result page. This should redirect you to a Product Detail page.
    
    3. In the Product Detail page, click on the “Add to Wish List” button. In this framework I have created 5 modules to maintain the solution 
 
How the framework is built:
  	This framework built with five modules such as:
	1) TestCasePack
	2) Interfaces
	3) Pages
	4) Resources
	5) Exception

		1) TestCasePack
			 In this module there are couple of methods 
			   1. AKQA Driver - driver script to control the test execution
			   2. Test01_addtoWishList - test scripts where the test conditions are verified

		2) Interfaces
			In this module I have groped the methods that integrate with external interfaces such as properties file and browser starter
			  1. Properties file - used to pass the parameters,here the environment URLs are passed along with path of Selenium driver

		3) Pages
			In this module the Page "Object model" is implemented. Here the methods are created according to the pages for easy maintenance and enhancement.
			  1. Landing Page
			  2. Product detail pages
			  3. Wish list page

		4) Resources
			This framework used Log4J for logging.
			  1.Log4j property file contains all the configuration details

		5) Exception
			This module is used to handle the exception scenario
			1) User location option can be allowed or blocked

How to run?

	Check the prerequisite:
	 1) OS - Windows 8.1 Enterprise
	 2) RAM - 4 GB
	 3) Intel Core i5-3320M@2.6GB
	 4) Java- JRE7
	 
	External Libraries:
	 1) Selenium - selenium-server-standalone-2.53.0.jar
	 2) Log4j - log4j-1.2.17.jar
	 
	 Steps to run the automated script:
	 
	 1) Run the AKQADriver main method from TestCasePack module
	 2) ensure the path of chrome driver and Log file are correctly updated in General_conf.properties file and log.properties file respectively
	 2) Check the Log file for the expected result and pass or fail
