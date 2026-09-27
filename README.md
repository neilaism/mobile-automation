# Mobile Automation Testing - My Demo App

This project is a mobile automation test using **Java, Appium, TestNG, and Gradle**.

The automation covers 2 tests which are LoginTest and AddToCartTest:

* Successful login
* Adding Sauce Labs Backpack to cart
* Assertion to verify the login result
* Assertion to verify the product is displayed in the cart

## Tech Stack

* Java
* Appium
* Appium UiAutomator2
* TestNG
* Gradle
* Android Emulator
* Appium Inspector

## Test Flow

### Login Test

1. Open the application
2. Open the menu
3. Select **Log In**
4. Enter valid username and password
5. Click Login
6. Verify that the home/catalog page is displayed

### Add to Cart Test

1. Open the application
2. Login with valid credentials
3. Select Sauce Labs Backpack
4. Click **Add to Cart**
5. Open the cart
6. Verify that Sauce Labs Backpack is displayed in the cart

## Project Structure

```text
src/test/java
├── base
│   └── BaseTest.java
├── pages
│   ├── LoginPage.java
│   ├── HomePage.java
│   └── ProductPage.java
└── tests
    ├── LoginTest.java
    └── AddToCartTest.java
```

## How to Run

Make sure the Android Emulator and Appium Server are running.

Run the tests using:

```bash
./gradlew test
```

## Test Result

All automated test cases passed successfully.
