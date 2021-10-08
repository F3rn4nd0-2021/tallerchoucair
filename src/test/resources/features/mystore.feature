

# Autor: Fernando Antonio Galvez Moreno

@stories

Feature: my store

  Fernando wants to register on the page My store


  @scenario1


  Scenario: register on my store page

    Given  Fernando wants to register on the page
    And enter the register module
      |email|
      |fgdsdgshs235@gmail.com|

    When he enters his personal data
         |stfristname  |stlastname  |stemail                     |stpassword  |stday |stmonth |styear   |stfrisnamef  |stlasnamef   |stcompany |staddress |staddress2 |stcity         |ststate |stpostal      |stcountry      |stadditional |strphone    |strmyadrdres|
         |fernando     |galvez      | fgdsdgshs235@gmail.com |12345789f   | 11   | 5      |1998     |fernado      |moreno       | choucair |calle 5   |  #18-12   |villavivencio  | 13     |33166      | 21            |  hola       |3125568489  |soy yo      |

    Then user registration should be successful MY ACCOUNT

