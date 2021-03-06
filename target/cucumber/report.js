$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CheckProductTitle.feature");
formatter.feature({
  "line": 1,
  "name": "Check Product Title",
  "description": "As a user\r\nI want to open a browser \r\nAnd load the webpage www.amazon.com\r\nAnd search some product\r\nAnd sort results by price from Highest to Lowest\r\nThen check that product title contains specified string",
  "id": "check-product-title",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 9,
  "name": "test1_Nikon(Firefox)",
  "description": "",
  "id": "check-product-title;test1-nikon(firefox)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User opens a browser \"Firefox\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User opens the webpage \"http://www.amazon.com/\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User inputs string to search \"Nikon\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User sorts results by price from High to Low",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User selects item 2",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Check that product topic contains text \"Nikon D3X\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Firefox",
      "offset": 22
    }
  ],
  "location": "TestStepsDefinition.openBrowser(String)"
});
formatter.result({
  "duration": 6006281875,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.amazon.com/",
      "offset": 24
    }
  ],
  "location": "TestStepsDefinition.openWebPage(String)"
});
formatter.result({
  "duration": 1305688188,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nikon",
      "offset": 30
    }
  ],
  "location": "TestStepsDefinition.defineSearchString(String)"
});
formatter.result({
  "duration": 5064348759,
  "status": "passed"
});
formatter.match({
  "location": "TestStepsDefinition.sortsResultsByPriceHL()"
});
formatter.result({
  "duration": 3710166501,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 18
    }
  ],
  "location": "TestStepsDefinition.openItemByIndex(int)"
});
formatter.result({
  "duration": 2068570098,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nikon D3X",
      "offset": 40
    }
  ],
  "location": "TestStepsDefinition.checkProductTopic(String)"
});
formatter.result({
  "duration": 3119316549,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat amazon_cucumber_test.TestStepsDefinition.checkProductTopic(TestStepsDefinition.java:125)\r\n\tat ✽.Then Check that product topic contains text \"Nikon D3X\"(CheckProductTitle.feature:15)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 3936137954,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "test2_Nikon(Chrome)",
  "description": "",
  "id": "check-product-title;test2-nikon(chrome)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "User opens a browser \"Chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "User opens the webpage \"http://www.amazon.com/\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User inputs string to search \"Nikon\"",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User sorts results by price from High to Low",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User selects item 2",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Check that product topic contains text \"Nikon D3X\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 22
    }
  ],
  "location": "TestStepsDefinition.openBrowser(String)"
});
formatter.result({
  "duration": 2773372886,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.amazon.com/",
      "offset": 24
    }
  ],
  "location": "TestStepsDefinition.openWebPage(String)"
});
formatter.result({
  "duration": 5530297791,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nikon",
      "offset": 30
    }
  ],
  "location": "TestStepsDefinition.defineSearchString(String)"
});
formatter.result({
  "duration": 4929019231,
  "status": "passed"
});
formatter.match({
  "location": "TestStepsDefinition.sortsResultsByPriceHL()"
});
formatter.result({
  "duration": 176968958,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 18
    }
  ],
  "location": "TestStepsDefinition.openItemByIndex(int)"
});
formatter.result({
  "duration": 5789934158,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nikon D3X",
      "offset": 40
    }
  ],
  "location": "TestStepsDefinition.checkProductTopic(String)"
});
formatter.result({
  "duration": 78545150,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat amazon_cucumber_test.TestStepsDefinition.checkProductTopic(TestStepsDefinition.java:125)\r\n\tat ✽.Then Check that product topic contains text \"Nikon D3X\"(CheckProductTitle.feature:23)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 2339025074,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "test3_Nikon(InternetExplorer)",
  "description": "",
  "id": "check-product-title;test3-nikon(internetexplorer)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "User opens a browser \"IE\"",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "User opens the webpage \"http://www.amazon.com/\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User inputs string to search \"Nikon\"",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User sorts results by price from High to Low",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User selects item 2",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Check that product topic contains text \"Nikon D3X\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "IE",
      "offset": 22
    }
  ],
  "location": "TestStepsDefinition.openBrowser(String)"
});
formatter.result({
  "duration": 2697363539,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.amazon.com/",
      "offset": 24
    }
  ],
  "location": "TestStepsDefinition.openWebPage(String)"
});
formatter.result({
  "duration": 4571321034,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nikon",
      "offset": 30
    }
  ],
  "location": "TestStepsDefinition.defineSearchString(String)"
});
formatter.result({
  "duration": 29881855430,
  "status": "passed"
});
formatter.match({
  "location": "TestStepsDefinition.sortsResultsByPriceHL()"
});
formatter.result({
  "duration": 2647281828,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 18
    }
  ],
  "location": "TestStepsDefinition.openItemByIndex(int)"
});
formatter.result({
  "duration": 9338765336,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nikon D3X",
      "offset": 40
    }
  ],
  "location": "TestStepsDefinition.checkProductTopic(String)"
});
formatter.result({
  "duration": 326878958,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat amazon_cucumber_test.TestStepsDefinition.checkProductTopic(TestStepsDefinition.java:125)\r\n\tat ✽.Then Check that product topic contains text \"Nikon D3X\"(CheckProductTitle.feature:31)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 2444566419,
  "status": "passed"
});
});