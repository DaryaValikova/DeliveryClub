Feature: Search restaurant

  @myTest
  Scenario: search valid address
    Given get DeliveryClub main page
    When enter address Москва, Штурвальная улица, 1 and click search
    Then i see vendors list
      | Кофе Хауз                                |
      | DIM SUM & CO                             |
      | А такого вендора нет, тест должен упасть |

  @myTest
  Scenario: check invalid address message
    Given get DeliveryClub main page
    When enter address xkfjhkfjghfk and click search
    Then i see validation message
    When only enter address Москва, Штурвальная улица, 1
    Then i don't see validation message

