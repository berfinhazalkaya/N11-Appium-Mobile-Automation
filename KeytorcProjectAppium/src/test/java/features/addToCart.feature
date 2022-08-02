@AddAndDeleteProductToFav
Feature: AddAndDeleteProductToFav

  @Fav
  Scenario: Add To Fav
    Given Berfin is opened app

#    When click my account button
#    When click login button
#    Then check login page
#    When write "berfinhazalkaya@gmail.com" in email part
#    When write "123456berfin." in password part
#    When click show button
#    When click login button in login page

    When click home search box
    When write "samsung" in search box
    When click samsung title
    Then check product page
#    When click fav button
    When click third product
    When click close button
    Then check product detail page
    When click add to cart button
    Then check cart page
    When click delete button
    Then check empty cart







