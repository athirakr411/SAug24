#features-file-new-amazonsearch2.feature

Feature: Validate Parallel Run

  Background: user launches webpage
    Given amazon webpage is launched

  @RegressionFlow
  Scenario Outline: Search for a product and validate results
    When user enters a "<product name>" in the search box
    And clicks on search button
    Then search results should be displayed

    Examples:
      |product name|
      |something|
    #cucumber testng & cucumber junit allows to run feature files in parallel or scenarios of the feature
  #in parallel-parallel run

  #2 feature files will be executed 1 by 1
  #mvn clean verify