@web
Feature: Login SauceDemo

  Scenario: Login berhasil menggunakan username dan password yang benar
    Given pengguna membuka halaman login SauceDemo
    When pengguna memasukkan username "standard_user"
    And pengguna memasukkan password "secret_sauce"
    And pengguna menekan tombol login
    Then pengguna berhasil masuk ke halaman produk

  Scenario: Login gagal menggunakan username dan password yang salah
    Given pengguna membuka halaman login SauceDemo
    When pengguna memasukkan username "username_salah"
    And pengguna memasukkan password "password_salah"
    And pengguna menekan tombol login
    Then pengguna melihat pesan error login

  Scenario Outline: Login gagal menggunakan data batas
    Given pengguna membuka halaman login SauceDemo
    When pengguna memasukkan username "<username>"
    And pengguna memasukkan password "<password>"
    And pengguna menekan tombol login
    Then pengguna tetap berada di halaman login dan melihat pesan error

    Examples:
      | username                                                                                                                                              | password     |
      |                                                                                                                                                       | secret_sauce |
      | standard_user                                                                                                                                         |              |
      | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | secret_sauce |

      