$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/resources/ShouldBeAbleToSearchProduct.feature");
formatter.feature({
  "name": "Search a Product",
  "description": "    As a end user\n    I will search for a product\n    I should be able view all the relevant products",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User should be able to search a Product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "name": "I search for a product \"\u003cproduct\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I should view all the relevant products",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product"
      ]
    },
    {
      "cells": [
        "shirt"
      ]
    },
    {
      "cells": [
        "jeans"
      ]
    },
    {
      "cells": [
        "shoe"
      ]
    },
    {
      "cells": [
        "bags"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User should be able to search a Product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "error_message": "io.github.bonigarcia.wdm.WebDriverManagerException: java.net.UnknownHostException: npm.taobao.org\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.handleException(WebDriverManager.java:749)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.manage(WebDriverManager.java:558)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.handleException(WebDriverManager.java:746)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.manage(WebDriverManager.java:558)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.setup(WebDriverManager.java:260)\r\n\tat configurations.BaseUIPageObject.setUpBrowser(BaseUIPageObject.java:29)\r\n\tat configurations.Hooks.setUpHomePage(Hooks.java:32)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:65)\r\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:42)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:144)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:174)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:365)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:273)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:238)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:159)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)\r\nCaused by: java.net.UnknownHostException: npm.taobao.org\r\n\tat java.net.InetAddress.getAllByName0(InetAddress.java:1281)\r\n\tat java.net.InetAddress.getAllByName(InetAddress.java:1193)\r\n\tat java.net.InetAddress.getAllByName(InetAddress.java:1127)\r\n\tat org.apache.http.impl.conn.SystemDefaultDnsResolver.resolve(SystemDefaultDnsResolver.java:45)\r\n\tat org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:112)\r\n\tat org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:373)\r\n\tat org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:394)\r\n\tat org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:237)\r\n\tat org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:185)\r\n\tat org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:89)\r\n\tat org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:110)\r\n\tat org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:185)\r\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:83)\r\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:108)\r\n\tat io.github.bonigarcia.wdm.HttpClient.execute(HttpClient.java:169)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.getDriversFromMirror(WebDriverManager.java:1014)\r\n\tat io.github.bonigarcia.wdm.ChromeDriverManager.getDrivers(ChromeDriverManager.java:82)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.filterCandidateUrls(WebDriverManager.java:765)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.manage(WebDriverManager.java:544)\r\n\t... 44 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProduct.i_am_on_the_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I search for a product \"shirt\"",
  "keyword": "When "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProduct.i_search_for_a_product(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should view all the relevant products",
  "keyword": "Then "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProduct.i_should_view_all_the_relevant_products()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "java.lang.NullPointerException\r\n\tat utils.FailedTestCases.getScreenShot(FailedTestCases.java:16)\r\n\tat configurations.Hooks.tearDown(Hooks.java:42)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:65)\r\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:50)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:144)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:174)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:365)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:273)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:238)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:159)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "User should be able to search a Product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "error_message": "io.github.bonigarcia.wdm.WebDriverManagerException: java.net.UnknownHostException: npm.taobao.org\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.handleException(WebDriverManager.java:749)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.manage(WebDriverManager.java:558)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.handleException(WebDriverManager.java:746)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.manage(WebDriverManager.java:558)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.setup(WebDriverManager.java:260)\r\n\tat configurations.BaseUIPageObject.setUpBrowser(BaseUIPageObject.java:29)\r\n\tat configurations.Hooks.setUpHomePage(Hooks.java:32)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:65)\r\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:42)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:144)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:174)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:365)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:273)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:238)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:159)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)\r\nCaused by: java.net.UnknownHostException: npm.taobao.org\r\n\tat java.net.InetAddress.getAllByName0(InetAddress.java:1281)\r\n\tat java.net.InetAddress.getAllByName(InetAddress.java:1193)\r\n\tat java.net.InetAddress.getAllByName(InetAddress.java:1127)\r\n\tat org.apache.http.impl.conn.SystemDefaultDnsResolver.resolve(SystemDefaultDnsResolver.java:45)\r\n\tat org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:112)\r\n\tat org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:373)\r\n\tat org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:394)\r\n\tat org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:237)\r\n\tat org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:185)\r\n\tat org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:89)\r\n\tat org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:110)\r\n\tat org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:185)\r\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:83)\r\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:108)\r\n\tat io.github.bonigarcia.wdm.HttpClient.execute(HttpClient.java:169)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.getDriversFromMirror(WebDriverManager.java:1014)\r\n\tat io.github.bonigarcia.wdm.ChromeDriverManager.getDrivers(ChromeDriverManager.java:82)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.filterCandidateUrls(WebDriverManager.java:765)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.manage(WebDriverManager.java:544)\r\n\t... 44 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProduct.i_am_on_the_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I search for a product \"jeans\"",
  "keyword": "When "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProduct.i_search_for_a_product(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should view all the relevant products",
  "keyword": "Then "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProduct.i_should_view_all_the_relevant_products()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "java.lang.NullPointerException\r\n\tat utils.FailedTestCases.getScreenShot(FailedTestCases.java:16)\r\n\tat configurations.Hooks.tearDown(Hooks.java:42)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:65)\r\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:50)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:144)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:174)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:365)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:273)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:238)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:159)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "User should be able to search a Product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "error_message": "io.github.bonigarcia.wdm.WebDriverManagerException: java.net.UnknownHostException: npm.taobao.org\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.handleException(WebDriverManager.java:749)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.manage(WebDriverManager.java:558)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.handleException(WebDriverManager.java:746)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.manage(WebDriverManager.java:558)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.setup(WebDriverManager.java:260)\r\n\tat configurations.BaseUIPageObject.setUpBrowser(BaseUIPageObject.java:29)\r\n\tat configurations.Hooks.setUpHomePage(Hooks.java:32)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:65)\r\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:42)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:144)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:174)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:365)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:273)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:238)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:159)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)\r\nCaused by: java.net.UnknownHostException: npm.taobao.org\r\n\tat java.net.InetAddress.getAllByName0(InetAddress.java:1281)\r\n\tat java.net.InetAddress.getAllByName(InetAddress.java:1193)\r\n\tat java.net.InetAddress.getAllByName(InetAddress.java:1127)\r\n\tat org.apache.http.impl.conn.SystemDefaultDnsResolver.resolve(SystemDefaultDnsResolver.java:45)\r\n\tat org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:112)\r\n\tat org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:373)\r\n\tat org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:394)\r\n\tat org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:237)\r\n\tat org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:185)\r\n\tat org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:89)\r\n\tat org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:110)\r\n\tat org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:185)\r\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:83)\r\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:108)\r\n\tat io.github.bonigarcia.wdm.HttpClient.execute(HttpClient.java:169)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.getDriversFromMirror(WebDriverManager.java:1014)\r\n\tat io.github.bonigarcia.wdm.ChromeDriverManager.getDrivers(ChromeDriverManager.java:82)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.filterCandidateUrls(WebDriverManager.java:765)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.manage(WebDriverManager.java:544)\r\n\t... 44 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProduct.i_am_on_the_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I search for a product \"shoe\"",
  "keyword": "When "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProduct.i_search_for_a_product(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should view all the relevant products",
  "keyword": "Then "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProduct.i_should_view_all_the_relevant_products()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "java.lang.NullPointerException\r\n\tat utils.FailedTestCases.getScreenShot(FailedTestCases.java:16)\r\n\tat configurations.Hooks.tearDown(Hooks.java:42)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:65)\r\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:50)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:144)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:174)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:365)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:273)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:238)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:159)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "User should be able to search a Product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "error_message": "io.github.bonigarcia.wdm.WebDriverManagerException: java.net.UnknownHostException: npm.taobao.org\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.handleException(WebDriverManager.java:749)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.manage(WebDriverManager.java:558)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.handleException(WebDriverManager.java:746)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.manage(WebDriverManager.java:558)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.setup(WebDriverManager.java:260)\r\n\tat configurations.BaseUIPageObject.setUpBrowser(BaseUIPageObject.java:29)\r\n\tat configurations.Hooks.setUpHomePage(Hooks.java:32)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:65)\r\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:42)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:144)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:174)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:365)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:273)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:238)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:159)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)\r\nCaused by: java.net.UnknownHostException: npm.taobao.org\r\n\tat java.net.InetAddress.getAllByName0(InetAddress.java:1281)\r\n\tat java.net.InetAddress.getAllByName(InetAddress.java:1193)\r\n\tat java.net.InetAddress.getAllByName(InetAddress.java:1127)\r\n\tat org.apache.http.impl.conn.SystemDefaultDnsResolver.resolve(SystemDefaultDnsResolver.java:45)\r\n\tat org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:112)\r\n\tat org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:373)\r\n\tat org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:394)\r\n\tat org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:237)\r\n\tat org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:185)\r\n\tat org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:89)\r\n\tat org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:110)\r\n\tat org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:185)\r\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:83)\r\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:108)\r\n\tat io.github.bonigarcia.wdm.HttpClient.execute(HttpClient.java:169)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.getDriversFromMirror(WebDriverManager.java:1014)\r\n\tat io.github.bonigarcia.wdm.ChromeDriverManager.getDrivers(ChromeDriverManager.java:82)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.filterCandidateUrls(WebDriverManager.java:765)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.manage(WebDriverManager.java:544)\r\n\t... 44 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProduct.i_am_on_the_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I search for a product \"bags\"",
  "keyword": "When "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProduct.i_search_for_a_product(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should view all the relevant products",
  "keyword": "Then "
});
formatter.match({
  "location": "ShouldBeAbleToSearchProduct.i_should_view_all_the_relevant_products()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "java.lang.NullPointerException\r\n\tat utils.FailedTestCases.getScreenShot(FailedTestCases.java:16)\r\n\tat configurations.Hooks.tearDown(Hooks.java:42)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:65)\r\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:50)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:144)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:174)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:365)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:273)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:238)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:159)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)\r\n",
  "status": "failed"
});
});