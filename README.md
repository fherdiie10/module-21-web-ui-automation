# Web UI & API Automation Testing

Project ini merupakan project Automation Testing menggunakan Java dengan implementasi Web UI Automation dan API Automation.

Project ini dibuat menggunakan pendekatan **Behavior Driven Development (BDD)** dengan Cucumber serta menggunakan Gradle sebagai build automation tool.

---

# Tech Stack

Tools dan teknologi yang digunakan:

- Java 21
- Gradle
- Selenium WebDriver
- Rest Assured
- Cucumber
- JUnit 5
- Google Chrome
- Visual Studio Code
- GitHub Actions

---

# Testing Scope

## Web UI Automation Testing

Website yang diuji:

https://www.saucedemo.com/

Automation testing dilakukan untuk menguji fitur login dengan beberapa skenario:

- Login menggunakan username dan password yang valid.
- Login menggunakan username dan password yang tidak valid.
- Validasi username kosong.
- Validasi password kosong.
- Validasi boundary input.

Web automation menggunakan:

- Selenium WebDriver
- Cucumber
- Page Object Model (POM)


---

## API Automation Testing

API testing dilakukan menggunakan Dummy API dengan Rest Assured.

Scenario yang diuji:

- Get All Users
- Get All Tags

API automation menggunakan:

- Rest Assured
- Cucumber
- JUnit


---

# Project Structure

Project menggunakan pemisahan package untuk Web UI Automation dan API Automation.


---

# Running Test Locally

Pastikan terminal berada pada folder project.

## Menjalankan Web UI Automation Test

```bash
.\gradlew :app:webTest