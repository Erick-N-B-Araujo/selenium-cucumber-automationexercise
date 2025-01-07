# Selenium Cucumber Automation Framework

This project is a comprehensive automation framework designed to test the functionalities of the Automation Exercise website. The framework leverages Selenium WebDriver, Cucumber, and TestNG, organized using the Page Object Model (POM) for better maintainability and scalability.
Features
Functionalities Covered:

    Authentication:
        User registration and login.
        Validation of invalid login attempts.
        Logout functionality.

    Product Search:
        Successful search results for valid product names.
        Error handling for invalid product names.

    Error Handling:
        Checkout process without items in the cart.
        Proper validation messages for user actions.

    Cart and Checkout:
        Adding, updating, and removing items from the cart.
        Smooth checkout process with valid payment details.

    UI/UX:
        Navigation and responsiveness of web pages.

Project Highlights:

    Page Object Model (POM): Organized structure to separate test logic from UI interactions.
    Cucumber BDD: Easy-to-understand Gherkin syntax for defining test scenarios.
    Cross-Browser Support: Capable of testing on multiple browsers by configuring WebDriver.

Prerequisites

    Java Development Kit (JDK) 8 or higher.
    Maven for dependency management.
    ChromeDriver (or any WebDriver for your preferred browser).
    IntelliJ IDEA or any IDE supporting Java.

Installation and Setup

    Clone the repository:

git clone https://github.com/your-username/selenium-cucumber-automation.git

Navigate to the project directory:

cd selenium-cucumber-automation

Install dependencies:

    mvn clean install

    Update the path/to/chromedriver in BaseTest.java with the location of your WebDriver executable.

How to Run Tests

    Run all tests:

mvn test

Execute specific feature files using tags:

    mvn test -Dcucumber.filter.tags="@Search"

Project Structure

    src/main/java:
        configurations: Contains base setup and teardown methods.
        pageobjects: Houses the Page Object Model classes for interacting with UI elements.

    src/test/java:
        steps: Step definitions linking feature file scenarios to Java methods.
        runners: Test runner configurations.

    src/test/resources:
        features: Gherkin-based feature files.

Future Enhancements

    Include support for additional browsers like Firefox and Edge.
    Expand test coverage to include additional user flows.
    Integrate with CI/CD pipelines using Jenkins or GitHub Actions.

License

This project is open-source under the MIT License. Contributions and improvements are welcome!
