Feature: Shout Feature
@inrange
Scenario: Persons are within the range
Given Sean is 10 meters away from Lucia
When Sean Shouts "Free Coffee"
Then Lucia hears the message "Free Coffee"

@notinrange
Scenario: Persons are not in the range
    Given Sean is 100 meters away from Lucia
    When Sean Shouts "Free Coffee"
    Then Lucia hears no message