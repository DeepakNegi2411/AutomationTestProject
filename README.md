# AutomationTestProject
This Project contains a Automation Framework and a simple Positive flow of Ordering a product from a Site.
For this Framework I have used Selenium with Java and Cucumber Framework, To Run I have used JUnit TestRunner 
In thi Framework I have created different Packages, and below is the explaination of each package : 
CucumberOptions Package - It contains TestRunner Class of Junit to run my Scenarios - This TestRunner class connects our feature file with step definition 
Features Package - It contains Feature File and that feature file contains the Scenario which I have automated
PagePbjects Package - It contains different pages classes and the each page contains its By Objects and different Action Methods which can be Performed
stepDefinition Package - It contains different step definition files page vise, and it contains main selenium working code. 
utils Package - This package contains common code, which can be utilized in our step definitions files, also it contains TestBase class, which is initializing our driver
and TestContextSetup class which is Initializing our other classes
And in out src/test/resources folder - I have created 2 files, 1 is global.properties file - In which I have defined all global parameters
and chromedriver.exe also I have kept here, so that this code can be pulled anywhere and can be run easily
Target - In target Folder , I have created a execution File as well in .html 

Execution Instrutions:
Pull code into your local Machine
Right click on TestRunner.java class -> Run AS -> JUnit Test 
