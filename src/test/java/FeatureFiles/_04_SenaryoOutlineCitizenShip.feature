#Senaryo
#CitizenShip sayfasına gidiniz.x
#Create işlemini parameter yöntemi ile doğrulayınız.
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız. (negatif test)

Feature: Citizenship Functionality

  Background:  # before senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to CitizenShip page

  Scenario Outline: CitizenShip create
    When User a CitizenShip name as "<name>" short name as "<short>"
    Then Success message should be displayed

    When User a CitizenShip name as "<name>" short name as "<short>"
    Then Already exist message should be displayed

    When User delete the "<name>"
    Then Success message should be displayed

    Examples:
      | name   | short |
      | isUl74 | is74  |
      | isUl94 | is94  |
      | isUl33 | is33  |
      | isUl44 | is44  |

#testNG dataProvide burada Scenario gibi calisiyor

