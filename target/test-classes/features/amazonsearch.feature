Feature: Validate search functionality
#  given a name

@SanityFlow #sanity test case#tags
  Scenario Outline: Search for a product and validate results
    Given amazon webpage is launched
    When user enters a "<product name>" in the search box
    And clicks on search button
    Then search results should be displayed

    Examples:
      |product name|
      |TV|
      |Phones  |

  @RegressionFlow #regression test case#tags
  Scenario Outline: Search for a product and validate results
    Given amazon webpage is launched
    When user enters a "<product name>" in the search box
    And clicks on search button
    Then search results should be displayed

    Examples:
      |product name|
      |macbook|
      |grooming  |


  #-edit cofiguration-main class-io.cucumber.core.cli.Main
  #-remove program arguments

