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
* Menu Interaktif CRUD

Menu interaktif berbasis CRUD memungkinkan panitia berinteraksi langsung dengan sistem untuk mengelola data peserta event running.

<img width="642" height="274" alt="Screenshot 2026-03-23 034208" src="https://github.com/user-attachments/assets/84202e74-7899-4f42-a1ec-9459510c3466" />

* Tambah Peserta

Berfungsi untuk memasukkan data peserta baru ke dalam sistem.

<img width="626" height="233" alt="Screenshot 2026-03-23 034304" src="https://github.com/user-attachments/assets/823d2eff-5457-417f-9685-d3b0bfc8426a" />

* Tampilkan Peserta

Menampilkan daftar seluruh peserta yang sudah terdaftar dalam event running.
  
<img width="640" height="190" alt="Screenshot 2026-03-23 034817" src="https://github.com/user-attachments/assets/378502ee-55b4-4265-80b8-752b408246b7" />

* Hapus Peserta

Digunakan untuk menghapus peserta tertentu dari daftar peserta event running.

<img width="628" height="157" alt="Screenshot 2026-03-23 034359" src="https://github.com/user-attachments/assets/7e977ee8-7e7f-4972-9ecd-8b12210a7d71" />

* Analisis Sepatu

Berfungsi sebagai fitur rekapitulasi untuk melihat tren penggunaan merk sepatu peserta event running yang berhasil finish.

<img width="640" height="218" alt="Screenshot 2026-03-23 034830" src="https://github.com/user-attachments/assets/e8e30173-2c95-45ac-ad36-32a9de9fe730" />

* Tampilkan Reward

Menentukan perolehan penghargaan berdasarkan performa atau kategori peserta event running.

<img width="620" height="246" alt="Screenshot 2026-03-23 034854" src="https://github.com/user-attachments/assets/c91dea51-94cc-4f62-a2d6-bcfd4eb9d242" />

* Keluar/Exit

Berfungsi untuk menghentikan jalannya program secara normal.

<img width="645" height="118" alt="Screenshot 2026-03-23 034918" src="https://github.com/user-attachments/assets/ad8416d1-693b-47ca-8968-17d8f13d56d2" />



## Penjelasan Prinsip OOP yang diterapkan

* Class

Class adalah blueprint/kerangka objek. Di sini Peserta merepresentasikan data peserta lomba.

```java
class Peserta {
    protected
    String nama;
    String merkSepatu;
    double waktuFinish;
    String status;
    Kategori kategori;
}
```

* Method

Method adalah fungsi yang dimiliki objek. Method ini digunakan untuk menentukan status peserta berdasarkan waktu finish.

```java
public void cekStatus() {
   if (waktuFinish <= kategori.batasWaktu) {
   status = "Finish";
   } else {
   status = "Tidak Finish";
   }
}
```

* Getter & Setter

Getter digunakan untuk mengambil nilai dari atribut private dan setter digunakan untuk mengubah nilai atribut dengan kontrol tertentu.

```java
    public String getNama() {
        return nama;
    }

    public String getStatus() {
        return status;
    }

    public void setWaktuFinish(double waktuFinish) {
        if (waktuFinish >= 0) {
            this.waktuFinish = waktuFinish;
        }
    }
```
* Inheritance

Inheritance memungkinkan class turunan mewarisi atribut & method dari parent class. Kategori5K hingga HalfMarathon mewarisi dari Kategori.

```java
class Kategori5K extends Kategori {
    public Kategori5K() {
        super("5K", 5, "Merah", "Perunggu", 60);
    }
}
```

* Constructor

Constructor digunakan untuk menginisialisasi objek saat dibuat.

```java
public Kategori(String namaKategori, double jarak, String warnaJersey, String jenisMedali, double batasWaktu) {
        this.namaKategori = namaKategori;
        this.jarak = jarak;
        this.warnaJersey = warnaJersey;
        this.jenisMedali = jenisMedali;
        this.batasWaktu = batasWaktu;
    }
```
* Abstraksi

Abstraction menyembunyikan detail dan hanya menampilkan hal penting. Kategori dibuat abstract karena tidak digunakan langsung, tapi sebagai konsep umum.

```java
abstract class Kategori {
    String namaKategori;
    double jarak;
    String warnaJersey;
    String jenisMedali;
    double batasWaktu;
}
```

* Polymorphism

Polymorphism = satu tipe, banyak bentuk. Variabel kategori bertipe Kategori tapi bisa menyimpan objek berbeda.

```java
Kategori kategori;
if (k == 1) kategori = new Kategori5K();
else if (k == 2) kategori = new Kategori10K();
else kategori = new HalfMarathon();
```
* Interface

Interface adalah kontrak method tanpa implementasi. Class yang mengimplementasikan wajib mengisi method tersebut.

```java
interface Reward {
    void tampilkanReward(Peserta p);
}
```

* Overriding

Overriding adalah mendefinisikan ulang method dari parent/interface.

```java
 @Override
    public void tampilkanReward(Peserta p) {
        if (p.status.equals("Finish")) {
            System.out.println(p.nama + " mendapatkan medali " + p.kategori.jenisMedali);

            if (p.kategori instanceof HalfMarathon) {
                System.out.println("+ Jaket Finisher");
            }
        }
    }
```

NB: Implementasi Prinsip OOP secara lebih detail pada src
## Penjelasan Keunikan Masalah
* Penggunaan CRUD
  
  Penggunaan operasi CRUD (Create, Read, Update, Delete) memungkinkan panitia mempunyai menu yang mempermudah dalam menambahkan data peserta baru, melihat daftar peserta, memperbarui informasi seperti kategori lomba atau waktu tempuh, menghapus data yang tidak diperlukan dan mencatat data dari setiap peserta dari kategori 5K, 10K hingga Half Marathon untuk dilakukan analisis secara lebih lanjut. Dengan adanya fitur ini, proses administrasi menjadi lebih efisien dan meminimalisir kesalahan dalam pengolahan data.
* Analisis Merk Sepatu
  
  Analisis yang dilakukan berupa identifikasi merk sepatu yang paling banyak digunakan oleh peserta yang berhasil menyelesaikan lomba. Informasi ini dapat memberikan insight terkait preferensi peserta serta potensi hubungan antara perlengkapan yang digunakan dengan performa mereka. Dengan adanya fitur ini, sistem tidak hanya berfungsi sebagai alat pencatatan, tetapi juga sebagai sumber informasi yang bermanfaat untuk evaluasi event di masa mendatang.

* Reward Tambahan

  Untuk menjadikan event running ini lebih eksklusif, panitia memberikan reward kepada masing-masing kategori. Untuk kategori 5K mendapatkan medali pperunggu, untuk kategori 10K mendapatkan medali perak dan untuk kategori Half Marathon mendapatkan medali emas. Karena kategori Half Marathon adalah yang paling panjang sejauh 21K, panitia memberikan hak khusus finisher Half Marathon berupa tambahan reward jaket finisher untuk menghargai perjuangan peserta Half Marathon.


