# Exercise Activity 04 Struktur Data and OOP

## Deskripsi Masalah yang diangkat
Penyelenggaraan event lari, sering menghadapi berbagai kendala dalam pengelolaan data peserta dan proses identifikasi selama dan setelah perlombaan berlangsung. Salah satu permasalahan utama adalah kesulitan dalam membedakan kategori peserta secara visual, seperti kategori 5K, 10K, dan Half Marathon, terutama ketika jumlah peserta sangat banyak. Selain itu, panitia juga perlu memastikan bahwa peserta yang terdaftar benar-benar menyelesaikan lomba sesuai dengan aturan yang telah ditentukan. Setiap kategori memiliki batas waktu (cut-off time) yang berbeda, sehingga diperlukan sistem yang mampu memvalidasi apakah peserta berhasil finish tepat waktu atau tidak.

Di sisi lain, setiap kategori pastinya memiliki perbedaan jersey dan medali serta reward khusus untuk kategori tertentu seperti Half Marathon yang mendapatkan jaket finisher. Oleh karena itu, diperlukan mekanisme yang dapat memastikan bahwa hanya peserta yang memenuhi syarat yang berhak menerima penghargaan tersebut. Berdasarkan permasalahan tersebut, dibutuhkan sebuah sistem manajemen event running yang mampu mengelola data peserta secara terstruktur seperti validasi status finish berdasarkan waktu tempuh, mengatur distribusi atribut seperti jersey, medali, dan jaket finisher, serta menyediakan fitur analisis sederhana terhadap data peserta. Hal tersebut bertujuan untuk meminimalisir kesalahan dan ketidakkonsistenan supaya event lari berjalan dengan lancar dan mendapat feedback membangun dari peserta untuk evaluasi dan pengembangan event selanjutnya.

---

## Komponen Class Diagram

<img width="7785" height="2120" alt="Event Participant-2026-03-20-014116" src="https://github.com/user-attachments/assets/c496f5b7-3c5f-405b-b24d-c3df0feb349c" />

Untuk merepresentasikan sistem tersebut dalam bentuk Class Diagram, terdapat beberapa kelas utama beserta atribut dan method sebagai berikut:

### 1. Class Peserta

Merepresentasikan data individu peserta lomba.

* Atribut:

  * nama
  * merkSepatu
  * waktuFinish
  * status
* Method:

  * cekStatus()
  * getInfo()

### 2. Class Kategori

Merepresentasikan jenis lomba yang diikuti peserta.

* Atribut:

  * namaKategori (5K, 10K, Half Marathon)
  * jarak
  * warnaJersey
  * jenisMedali
  * batasWaktu
* Method:

  * getKategori()

### 3. Class Event

Merepresentasikan keseluruhan event lomba.

* Atribut:

  * namaEvent
  * tanggal
  * daftarPeserta
* Method:

  * tambahPeserta()
  * hapusPeserta()
  * tampilPeserta()

### 4. Class Sistem

Berfungsi sebagai pengelola utama sistem (controller).

* Method:

  * tambahPeserta()
  * updatePeserta()
  * hapusPeserta()
  * tampilSemuaPeserta()
  * analisisSepatu()
  * tampilkanReward()

---

## Relasi Antar Class

* Peserta memiliki satu Kategori
* Event memiliki banyak Peserta (one-to-many)
* Sistem mengelola Event dan seluruh proses dalam sistem
---

## Screenshoot Output
## Penjelasan Prinsip OOP yang diterapkan
## Penjelasan Keunikan Masalah
* Penggunaan CRUD
  
  Penggunaan operasi CRUD (Create, Read, Update, Delete) memungkinkan panitia mempunyai menu yang mempermudah dalam menambahkan data peserta baru, melihat daftar peserta, memperbarui informasi seperti kategori lomba atau waktu tempuh, menghapus data yang tidak diperlukan dan mencatat data dari setiap peserta dari kategori 5K, 10K hingga Half Marathon untuk dilakukan analisis secara lebih lanjut. Dengan adanya fitur ini, proses administrasi menjadi lebih efisien dan meminimalisir kesalahan dalam pengolahan data.
* Analisis Merk Sepatu
  
  Analisis yang dilakukan berupa identifikasi merk sepatu yang paling banyak digunakan oleh peserta yang berhasil menyelesaikan lomba. Informasi ini dapat memberikan insight terkait preferensi peserta serta potensi hubungan antara perlengkapan yang digunakan dengan performa mereka. Dengan adanya fitur ini, sistem tidak hanya berfungsi sebagai alat pencatatan, tetapi juga sebagai sumber informasi yang bermanfaat untuk evaluasi event di masa mendatang.


