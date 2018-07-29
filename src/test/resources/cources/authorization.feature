Feature: Authorization
  @myTest
  Scenario: try authoriz
    Given get DeliveryClub main page
    When click authorization
    And fill user's email
    And clik enter
#    Then
