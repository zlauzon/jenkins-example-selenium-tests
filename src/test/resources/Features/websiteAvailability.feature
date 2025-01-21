Feature: Access Website

    Scenario: User Accesses The Website
        When user navigates to the Website "https://demoqa.com/"
        Then Website title matches "DEMOQA"