
# ( LoginFeature ) user for all scenario run

Feature:Login Feature

  Background:
    Given User Is On Login Page

  # ( LoginSuccess ) user for this scenario run only
    @LoginSuccess
    Scenario: User Should Able to Login With Registered Mobile Number.

      When User Enter The MobileNumber.
      And User Click on Login Button.
      And User Enter The OTP ( Received on Mobile By Sms ).
      And User Click On Verify Button.
      Then User Login SuccessFully.
      And User Is on Dashboard Page.

  # ( LoginUnSuccessMobileNumber ) user for this scenario run only
      @LoginUnSuccessMobileNumber
      Scenario Outline: User Should Not Able to Login With Invalid Mobile Number.
        When User Enter Invalid "<MobileNumber>".
        And User Click on Login Button.
        Then User should see error message "<ErrorMessage>".

        Examples:
          | MobileNumber | ErrorMessage            |
          | 982514852    | Mobile Must be 10 digit |
          | 98251485210  | Mobile Must be 10 digit |
          | 98251abcd    | Mobile Must be 10 digit |
          | 98251abcdef  | Mobile Must be 10 digit |
          | Abcd98251    | Mobile Must be 10 digit |
          | Abcdef98251  | Mobile Must be 10 digit |
          | 98251.;['"{  | Mobile Must be 10 digit |
          | 98251@#!&*^  | Mobile Must be 10 digit |
          | @#!&*^98251  | Mobile Must be 10 digit |

          | abcdefghi    | Mobile Must be 10 digit |
          | abcdefghijk  | Mobile Must be 10 digit |

          | ,./;'[]{:    | Mobile Must be 10 digit |
          | ,./;'[]{:"?  | Mobile Must be 10 digit |

          | !@#$%^&*(    | Mobile Must be 10 digit |
          | !@#$%^&*()_  | Mobile Must be 10 digit |

          #| 98251abcde   | Mobile Must be 10 digit |
          #| Abcde98251   | Mobile Must be 10 digit |
          #| 98251.;['"   | Mobile Must be 10 digit |
          #| .;['"{98251  | Mobile Must be 10 digit |
          #| 98251@#!&*   | Mobile Must be 10 digit |
          #| @#!&*98251   | Mobile Must be 10 digit |
          #| abcdefghij   | Mobile Must be 10 digit |
          #| ,./;'[]{:"   | Mobile Must be 10 digit |
          #| !@#$%^&*()   | Mobile Must be 10 digit |


  # ( LoginUnSuccess (OTP) ) user for this scenario run only
  @otp
  Scenario Outline: User Should Not Able to Login With Valid Mobile Number And Invalid OTP.
    When User Enter The MobileNumber.
    And User Click on Login Button.
    And User Enter The "<OTP>". ( Received on Mobile By Sms ).
    And User Click On Verify Button.
    Then User should see OTP error message "<ErrorMessage>" And "<ErrorMessage1>".
    Examples:
      | OTP   | ErrorMessage        | ErrorMessage1                |
      | 123   | OTP Must be 4 digit | Otp Record Not Found         |
      | 12345 | OTP Must be 4 digit | Otp Record Not Found         |
      | ab1   | OTP Must be 4 digit | please add Unique Id and Otp |
      | ,./   | OTP Must be 4 digit | please add Unique Id and Otp |
      | !@#   | OTP Must be 4 digit | please add Unique Id and Otp |
      | {123} | OTP Must be 4 digit | please add Unique Id and Otp |
      |       | OTP Must be 4 digit | please add Unique Id and Otp |

#      | 1234  |                     | Otp Record Not Found         |
#      | ab12  |                     | please add Unique Id and Otp |
#      | abcd  |                     | please add Unique Id and Otp |
#      | ,./;  |                     | please add Unique Id and Otp |