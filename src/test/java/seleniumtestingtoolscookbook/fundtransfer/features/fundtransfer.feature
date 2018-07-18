Feature: Customer Transfer's Fund
  As a customer,
  I want to transfer funds
  so that I can send money to my friends and family

  Scenario: Valid Payee
    Given the user is on Fund Transfer Page
    When he enters "Jim" as payee name
    And he enters "100" as amount
    And he submits request for Fund Transfer
    Then ensure the fund transfer is complete with "$100 transferred successfully to Jim!!" message

  Scenario Outline: Invalid conditions
    Given the user is on Fund Transfer Page
    When he enters "<payee>" as payee name
    And he enters "<amount>" as amount
    And he submits request for Fund Transfer
    Then ensure a transaction failure "<message>" is displayed

    Examples:
      | payee | amount | message                                                              |
      | John  | 100    | Transfer failed!! 'John' is not approved. Please contact your branch |
      | Tim   | 100000 | Transfer failed!! account cannot be overdrawn                        |

