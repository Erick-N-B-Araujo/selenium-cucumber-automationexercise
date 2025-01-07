# Selenium Cucumber Automation Framework

This project is a comprehensive automation framework designed to test the functionalities of the [Automation Exercise](https://www.automationexercise.com) website. The framework leverages **Selenium WebDriver**, **Cucumber**, and **TestNG**, organized using the **Page Object Model (POM)** for better maintainability and scalability.
## Features

### Functionalities Covered:

1. **Authentication**:
   - User registration and login.
   - Validation of invalid login attempts.
   - Logout functionality.
2. **Product Search**:
   - Successful search results for valid product names.
   - Error handling for invalid product names.
3. **Error Handling**:
   - Checkout process without items in the cart.
   - Proper validation messages for user actions.
4. **Cart and Checkout**:
   - Adding, updating, and removing items from the cart.
   - Smooth checkout process with valid payment details.
5. **UI/UX**:
   - Navigation and responsiveness of web pages.

### Project Highlights:

- **Page Object Model (POM)**: Organized structure to separate test logic from UI interactions.
- **Cucumber BDD**: Easy-to-understand Gherkin syntax for defining test scenarios.
- **Cross-Browser Support**: Capable of testing on multiple browsers by configuring WebDriver.

## Prerequisites

1. **Java Development Kit (JDK)** 8 or higher.
2. **Maven** for dependency management.
3. **ChromeDriver** (or any WebDriver for your preferred browser).
4. **IntelliJ IDEA** or any IDE supporting Java.

## Installation and Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/Erick-N-B-Araujo/selenium-cucumber-automationexercise.git
   ```

2. Navigate to the project directory:

   ```bash
   cd selenium-cucumber-automation
   ```

3. Install dependencies:

   ```bash
   mvn clean install
   ```

4. Update the `path/to/chromedriver` in `BaseTest.java` with the location of your WebDriver executable.

   ```git
   git clone https://github.com/Erick-N-B-Araujo/selenium-cucumber-automationexercise.git
   ```

## How to Run Tests

1. Run all tests:

   ```bash
   mvn test
   ```

2. Execute specific feature files using tags:

   ```bash
   mvn test -Dcucumber.filter.tags="@Search"
   ```

## Project Structure

- **src/main/java**:
  - `configurations`: Contains base setup and teardown methods.
  - `pageobjects`: Houses the Page Object Model classes for interacting with UI elements.
- **src/test/java**:
  - `steps`: Step definitions linking feature file scenarios to Java methods.
  - `runners`: Test runner configurations.
- **src/test/resources**:
  - `features`: Gherkin-based feature files.

## Future Enhancements

- Include support for additional browsers like Firefox and Edge.
- Expand test coverage to include additional user flows.
- Integrate with CI/CD pipelines using Jenkins or GitHub Actions.

## License

This project is open-source under the Apache License. Contributions and improvements are welcome!
