# Module 21 - Web UI Automation Testing

Project ini dibuat untuk memenuhi tugas pada **Module 21** mengenai Web UI Automation Testing.

Pada project ini saya membuat automation testing sederhana untuk menguji fitur login pada website SauceDemo menggunakan Java, Selenium WebDriver, Cucumber, JUnit, dan Gradle.

## Tools yang Digunakan

- Java 21
- Gradle
- Selenium WebDriver
- Cucumber
- JUnit
- Visual Studio Code
- Google Chrome

## Website yang Diuji

https://www.saucedemo.com/

## Struktur Pengujian

Project ini menggunakan konsep **Page Object Model (POM)** supaya kode lebih rapi dan setiap halaman memiliki file masing-masing.

File utama yang digunakan antara lain:

- `LoginPage.java` untuk proses pada halaman login.
- `ProductsPage.java` untuk pengecekan halaman produk setelah login berhasil.
- `LoginSteps.java` untuk menghubungkan langkah pada file Cucumber dengan kode Java.
- `Hooks.java` untuk membuka dan menutup browser selama pengujian.
- `RunCucumberTest.java` untuk menjalankan test.
- `login.feature` untuk menulis skenario pengujian menggunakan format Gherkin.

## Test Case

Test yang dibuat pada project ini terdiri dari:

- **Positive Test**  
  Login menggunakan username dan password yang benar.

- **Negative Test**  
  Login menggunakan username dan password yang salah.

- **Boundary Test**  
  Pengujian dengan username kosong, password kosong, dan username yang sangat panjang.

## Cara Menjalankan Test

Buka terminal pada folder project, kemudian jalankan:

```powershell
.\gradlew clean test