Feature: Validate search functionality
#  given a name

  Background: user launches webpage
    Given amazon webpage is launched


#@SanityFlow @RegressionFlow #sanity test case#tags
  @SanityFlow
  Scenario Outline: Search for a product and validate results
    #Given amazon webpage is launched
    When user enters a "<product name>" in the search box
    And clicks on search button
    Then search results should be displayed

    Examples:
      |product name|
      |TV|
      #|Phones  |

  @RegressionFlow #regression test case#tags
  Scenario Outline: Search for a product and validate results
     #Given amazon webpage is launched
   # When user enters a product name
   # |row0col0|row0col1|row0col2|
   # |row1col0|row1col1|row1col2|
    #data table
    When user enters a "<product name>" in the search box
    And clicks on search button
    Then search results should be displayed

    Examples:
      |product name|
      |macbook|
     # |grooming  |
#if no example scenario

  #-edit cofiguration-main class-io.cucumber.core.cli.Main
  #-remove program arguments

  #@SmokeTest #smoke test case#tags
 @RegressionFlow
  Scenario Outline: Search for a product and validate results
   # Given amazon webpage is launched
    When user enters a "<product name>" in the search box
    And clicks on search button
    Then search results should be displayed
#error will be shown on reports
   Examples:
     |product name|
     |TV|