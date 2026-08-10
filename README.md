# Module 21 - Web UI Automation Testing

Project ini dibuat untuk memenuhi tugas **Module 21** tentang Web UI Automation Testing.

Pada project ini saya membuat automation testing untuk menguji fitur login pada website SauceDemo. Pengujian dibuat menggunakan Java, Selenium WebDriver, Cucumber, JUnit, dan Gradle.

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

## Struktur Project

Project ini menggunakan konsep **Page Object Model (POM)** agar kode pengujian lebih mudah dibaca dan dikelola.

Beberapa file utama yang digunakan:

- `LoginPage.java` untuk proses pada halaman login.
- `ProductsPage.java` untuk pengecekan halaman produk setelah login berhasil.
- `LoginSteps.java` untuk menghubungkan langkah Cucumber dengan kode Java.
- `Hooks.java` untuk membuka dan menutup browser saat test dijalankan.
- `RunCucumberTest.java` sebagai runner untuk menjalankan pengujian.
- `login.feature` untuk menyimpan skenario pengujian dalam format Gherkin.

## Test Case

Pengujian yang dibuat meliputi:

### Positive Test
Login menggunakan username dan password yang benar.

### Negative Test
Login menggunakan username dan password yang salah.

### Boundary Test
Pengujian menggunakan username kosong, password kosong, dan username dengan karakter yang sangat panjang.

## Menjalankan Test

Untuk menjalankan test secara lokal, buka terminal pada folder project kemudian jalankan:

```powershell
.\gradlew clean test
```

---

# Module 22 - GitHub Actions

Pada **Module 22**, project sebelumnya dilanjutkan dengan menambahkan GitHub Actions agar automation test dapat berjalan secara otomatis dari repository GitHub.

## Workflow

File konfigurasi GitHub Actions berada di:

`.github/workflows/main.yml`

Workflow akan berjalan ketika:

- Ada perubahan yang di-push ke repository.
- Pull Request berhasil di-merge.

## Environment

Environment yang digunakan pada GitHub Actions:

- Ubuntu Latest
- Java 21
- Gradle
- Google Chrome
- Selenium WebDriver
- Cucumber
- JUnit

## Menjalankan Automation Test

Pada GitHub Actions, test dijalankan menggunakan perintah:

```bash
./gradlew :app:test --no-daemon
```

Setelah proses pengujian selesai, hasil test disimpan sebagai artifact dengan nama:

`automation-test-report`

## Hasil Pengujian

Hasil terakhir dari GitHub Actions:

- Total Test: 5
- Passed: 5
- Failed: 0
- Success Rate: 100%

GitHub Actions berhasil menjalankan seluruh test dan hasil pengujiannya dapat dilihat melalui artifact pada halaman Actions di repository.