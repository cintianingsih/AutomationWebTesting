# Web Automation Testing Menggunakan Cucumber dan Selenium Kelompok A8
## Description

Melakukan Web Automation Testing menggunakan Cucumber dan Selenium. Dengan fokus pengujian pada fungsionalitas web, pengujian otomatis ini dirancang dengan keterampilan praktis yang diperlukan untuk menguji aplikasi web secara otomatis. Software under test yang digunakan adalah web Swag labs (https://www.saucedemo.com/). Pengujian difokuskan pada fungsi login dan logout menggunakan environment pengujian web otomatis yang sudah disiapkan sebelumnya. Kemudian, membuat script test untuk pengujian fungsionalitas secara otomatis.

## Member

- 211524004 | Berliana Elfada [@berlianalfd](https://github.com/berlianalfd)
- 211524005 | Cintia Ningsih [@cintianingsih](https://github.com/cintianingsih)
- 211524029 | Yane Pradita [@yanepradita](https://github.com/yanepradita)

## Testing Tools

- IDE : visual studio code
- Alat build otomatis : Apache Maven
- Tools buat runing : Terminal
- Sistem operasi : Window
- Framework testing : JUnit, Cucumber 
- Library automation testing : Selenium
- Bahasa pemrograman : Java

## Struktur File Program
Berikut merupakan struktur file dari projek script testing yang Kami buat

<img width="375" alt="foldersite" src="https://github.com/cintianingsih/AutomationWebTesting/assets/95121218/7078e599-a236-492d-8632-20df9348173b">

1. **main/java/**

   Folder ini berisi kode sumber Java inti untuk aplikasi project java.

     
2. **test/java/pages**

   Pages merupakan package yang berisikan class - class untuk setiap halaman atau bagian antarmuka pengguna.
   - **HomePage** untuk halaman dashboard yang berisikan daftar katalog produk. Kelas ini merupakan bagian dari paket pages dan digunakan dalam pengujian otomatis berbasis 
      Selenium untuk berinteraksi dengan halaman utama dari web Swag labs. Kelas ini merepresentasikan halaman utama dan menyediakan metode untuk memverifikasi     
      keberadaan dan visibilitas elemen-elemen tertentu pada halaman tersebut.
      
   - **LoginPage** untuk halaman login yang berisikan form untuk menginputkan username dan password. Kelas ini merupakan bagian dari paket pages dan digunakan dalam     
      pengujian otomatis berbasis Selenium untuk berinteraksi dengan halaman login dari web Swag labs. Kelas ini merepresentasikan halaman login dan menyediakan metode 
      untuk melakukan tindakan login serta memverifikasi elemen-elemen yang relevan pada halaman tersebut.
      
   - **LogoutPage** untuk halaman logout yang berisikan button logout yang terdapat di dalam menu. Kelas ini merupakan bagian dari paket pages dan digunakan dalam pengujian 
      otomatis berbasis Selenium untuk berinteraksi dengan halaman logout atau elemen terkait logout dari web Swag labs. Kelas ini merepresentasikan halaman atau fitur 
      logout dan menyediakan metode untuk melakukan tindakan logout serta memverifikasi elemen-elemen yang relevan.

3. **test/java/stepDefinitions**

   stepDefinitions merupakan package yang berisikan file class untuk mengimplementasikan langkah - langkah scenario pengujian yang didefinisikan dalam file feature dengan 
   memanggil metode-metode dari Page Classes yang sesuai dengan tindakan yang diperlukan.
   - **LoginTest** berisikan implementasi langkah - langkah scenario pengujian yang didefinisikan dalam file feature Login.
   - **LogoutTest** berisikan implementasi langkah - langkah scenario pengujian yang didefinisikan dalam file feature Logout. 

4. **test/java/TestRunner**

   Kelas TestRunner bertanggung jawab untuk menjalankan tes otomatis yang ditulis menggunakan framework Cucumber. Ini mengatur konfigurasi untuk menjalankan tes, termasuk 
   lokasi fitur, definisi langkah-langkah, dan plugin pelaporan.

5. **test/java/resources/features**

   Package features yang berisikan file .feature untuk mendefinisikan skenario pengujian menggunakan sintaks Gherkin.
   - **Login.features**
     Fitur ini mendefinisikan serangkaian skenario untuk menguji berbagai kasus login pada aplikasi web. Setiap skenario mencakup kondisi yang berbeda untuk memastikan 
     bahwa sistem menangani login dengan benar, baik itu login yang berhasil maupun login yang gagal dengan berbagai kombinasi nama pengguna dan kata sandi.
     Skenario pada login ini, kami membuat sebanyak 9 test case, antara lain:
       - TC0.0.1 Successful login with password and the username is registered in the database
    
         <img width="475" alt="foldersite" src="https://github.com/cintianingsih/AutomationWebTesting/assets/95121218/4b2d04c7-d2e2-418f-8a5e-aeab8bbbf341">
         
       - TC0.0.2 Unsuccessful login with Username and Password unregistered in the database
    
         <img width="475" alt="foldersite" src="https://github.com/cintianingsih/AutomationWebTesting/assets/95121218/ae35d829-71a6-4f1e-a7dc-ecd66bcb54c7">
         
       - TC0.0.3 Unsuccessful login with password and username is empty
    
         <img width="475" alt="foldersite" src="https://github.com/cintianingsih/AutomationWebTesting/assets/95121218/48890711-e020-478a-987d-496ad31cbbcf">
         
       - TC0.0.4 Unsuccessful login with username is registered in the database but the password not registered in the database
    
         <img width="475" alt="foldersite" src="https://github.com/cintianingsih/AutomationWebTesting/assets/95121218/ae4cb102-9764-4ae6-900b-fb50d077e03d">
         
       - TC0.0.5 Unsuccesfull login with username is registered in the database but the password is empty
    
         <img width="475" alt="foldersite" src="https://github.com/cintianingsih/AutomationWebTesting/assets/95121218/45d7e29b-2ce1-4b9b-88ab-3125dd371755">
         
       - TC0.0.6 Unsuccesfull login with password is registered in the database but the username not registered in the database
    
         <img width="475" alt="foldersite" src="https://github.com/cintianingsih/AutomationWebTesting/assets/95121218/2a442813-20f2-4236-8c93-52c26a48bd0e">
         
       - TC0.0.7 Unsuccessful login with password is registered in the database but the username is empty
    
         <img width="475" alt="foldersite" src="https://github.com/cintianingsih/AutomationWebTesting/assets/95121218/647c6114-a229-45ca-8827-e4fd7477022f">
         
       - TC0.0.8 Unsuccesfull login with username is not registered in the database but the password is empty
    
         <img width="475" alt="foldersite" src="https://github.com/cintianingsih/AutomationWebTesting/assets/95121218/cce5727e-0012-494c-9a2d-ada72ae2dc24">
         
       - TC0.0.9 Unsuccessful login with password not registered in the database and the username is empty
    
         <img width="475" alt="foldersite" src="https://github.com/cintianingsih/AutomationWebTesting/assets/95121218/0fc9526d-35cb-48d2-a8d3-8960b8e9421e">
         
     
   - **Logout.feature**
     Fitur ini mendefinisikan skenario untuk menguji proses logout pada aplikasi web. Skenario ini memastikan bahwa pengguna dapat keluar dari aplikasi dengan sukses dan 
     diarahkan kembali ke halaman login. Skenario pada login ini, kami membuat sebanyak 1 test case, yaitu:
       - TC0.1.1 Successful logout
    
         <img width="475" alt="foldersite" src="https://github.com/cintianingsih/AutomationWebTesting/assets/95121218/48dd3497-46bc-4f46-a149-c346d95060b2">
         
6. **target**

   Folder ini digunakan oleh sistem build Java untuk menyimpan file class yang dikompilasi dan artefak lain yang dihasilkan atau dibuat secara otomatis selama proses build. 

7. **pom.xml**

   File ini adalah project object model (POM) untuk project Java Kami. Ini menentukan dependensi project pada library dan framework lain, serta pengaturan                      konfigurasi untuk proses build.


## Test the program

Berikut merupakan perintah yang dapat di gunakan untuk melakukan test program menggunakan maven pada terminal.
1. Perintah dibawah digunakan untuk menguji semua class sekaligus
   
   ```sh
   mvn test
   ``` 
   
2. Perintah dibawah digunakan untuk menguji satu skenario test yang terdapat pada satu class test.

    - Perintah untuk pengujian satu test yaitu **TC0.0.1** dengan filter name. 
 
     ```sh
     mvn test -Dcucumber.filter.name="Successful login with password and the username is registered in the database"
     ```

     - Perintah untuk pengujian satu test yaitu **TC0.0.2** dengan filter name. 
 
     ```sh
     mvn test -Dcucumber.filter.name="Unsuccessful login with Username and Password unregistered in the database"
     ```

     - Perintah untuk pengujian satu test yaitu **TC0.0.3** dengan filter name. 
 
     ```sh
     mvn test -Dcucumber.filter.name="Unsuccessful login with password and username is empty"
     ```

     - Perintah untuk pengujian satu test yaitu **TC0.0.4** dengan filter name. 
 
     ```sh
     mvn test -Dcucumber.filter.name="Unsuccessful login with username is registered in the database but the password not registered in the database"
     ```

     - Perintah untuk pengujian satu test yaitu **TC0.0.5** dengan filter name. 
 
     ```sh
     mvn test -Dcucumber.filter.name="Unsuccesfull login with username is registered in the database but the password is empty"
     ```

     - Perintah untuk pengujian satu test yaitu **TC0.0.6** dengan filter name. 
 
     ```sh
     mvn test -Dcucumber.filter.name="Unsuccesfull login with password is registered in the database but the username not registered in the database"
     ```

     - Perintah untuk pengujian satu test yaitu **TC0.0.7** dengan filter name. 
 
     ```sh
     mvn test -Dcucumber.filter.name="Unsuccessful login with password is registered in the database but the username is empty"
     ```

     - Perintah untuk pengujian satu test yaitu **TC0.0.8** dengan filter name. 
 
     ```sh
     mvn test -Dcucumber.filter.name="Unsuccesfull login with username is not registered in the database but the password is empty"
     ```

     - Perintah untuk pengujian satu test yaitu **TC0.0.8** dengan filter name. 
 
     ```sh
     mvn test -Dcucumber.filter.name="Unsuccessful login with password not registered in the database and the username is empty"
     ```
     
   - Perintah untuk pengujian satu test yaitu **TC0.1.1** dengan filter name. 
 
     ```sh
     mvn test -Dcucumber.filter.name="Successful logout"
     ```
     
## Generate report by tools

1. Berikut merupakan perintah untuk generate report 

   ```sh
   mvn verify -DskipTests
   ```

2. Sehingga hasil dari generate report tersebut akan membuat folder site didalam folder target

   <img width="975" alt="foldersite" src="https://github.com/cintianingsih/AutomationWebTesting/assets/95121218/2ba8d044-b371-4c87-bae4-248967d4c528">
