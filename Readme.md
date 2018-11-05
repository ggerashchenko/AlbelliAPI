[![Build Status](https://travis-ci.org/ggerashchenko/AlbelliAPI.svg?branch=master)](https://travis-ci.org/ggerashchenko/AlbelliAPI)

##  Document purpose
I will try briefly to explain how I wanted to approach testing, which difficulties I faced and what I actually was able to produce.

## Initial technical task:
The idea behind this test is to asses knowledge of APIs and testing them.
The task is:
1. Create a cartItem using CartItems_Post request and payload.json
2. Response will contain CartID
3. Use this CartID and call Carts_Get
4. Check if you get back a 200 and validate what you can in the response

## Original plan was:
1. Write tests in Java.
2. Use Restassured library for tests
3. Use JUnit as test runner.
4. Write API test for Get cart by id.
5. Use [Allure](http://allure.qatools.ru/) for reporting.
 
## What was achieved:
1. Maven project that has a series of API tests.
2. API test
3. After tests are finished, allure report is generated.

In order to run test you can use IDE or you need to call `mvn cleat test` task inside the project folder.
In order to get report you need to call `allure serve allure-results/` task inside the project folder. But to be able to do so
you need to install `allure` with `brew install allure`. In case you do not have `brew` you can look at the example
of the report in `allure-report-example/index.html`.

## What could be improved : 
- Data provider with various test data sets can be created. Data model can cover all request/response fields. Can be added logger to requests and responses.
