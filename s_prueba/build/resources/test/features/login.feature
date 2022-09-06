Feature: as a user of the swaglabs application
  I would like to log in to purchase products.

  Scenario Outline: login successful
    Given that the user has an account
    When the user enters the credentials
      | username | <username> |
      | password | <password> |
    Then the user must see the products
      | lbl_products         | <lbl_products>         |
      | lbl_product_backpack | <lbl_product_backpack> |

    Examples:
      | username      | password     | lbl_products | lbl_product_backpack |
      | standard_user | secret_sauce | products     | sauce labs backpack  |