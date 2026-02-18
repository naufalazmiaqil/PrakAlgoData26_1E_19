# LAPORAN PRAKTIKUM DASAR PEMROGRAMAN

Nama  : Naufal Azmi Aqil
Jurusan : Informatika  
Mata Kuliah : Dasar Pemrograman

# PEMILIHAN
Program ini digunakan untuk menghitung nilai akhir mahasiswa berdasarkan komponen:
* 20% Tugas
* 20% Kuis
* 30% UTS
* 40% UAS
Setiap nilai harus berada pada rentang 0–100. Jika di luar rentang tersebut, program akan menampilkan pesan "nilai tidak valid".
Setelah nilai akhir dihitung, program akan mengonversinya ke nilai huruf (A–E) sesuai tabel ketentuan, serta menentukan status:
* A, B+, B, C+, C → LULUS
* D, E → TIDAK LULUS
Output yang dihasilkan berupa nilai akhir, nilai huruf, dan keterangan LULUS atau TIDAK LULUS.

    - Screenshoot
![Screenshot Program]([- Screenshoot](https://github.com/naufalazmiaqil/PrakAlgoData26_1E_19/blob/796e0220442e5c7e313582a92a1644775ec1fdcb/Jobsheet1/Tangkapan%20Layar%202026-02-18%20pukul%2007.54.11.png)



# PERULANGAN
Program ini menampilkan deret angka dari 1 sampai n, di mana n adalah 2 digit terakhir NIM. Jika n < 10, maka ditambahkan 10.
Aturan cetak
* Kelipatan 3 → #
* Genap (bukan kelipatan 3) → angka asli
* Ganjil → *
* Angka 10 dan 15 → tidak dicetak

    - Screenshoot

# ARRAY
Praktikum ini bertujuan membuat program untuk menghitung IP Semester menggunakan konsep array.
Program menerima input berupa:
* Nama mata kuliah
* Bobot SKS
* Nilai huruf / nilai angka
Nilai tersebut dikonversi ke nilai setara (bobot) berdasarkan tabel konversi, lalu dihitung menggunakan rumus:
IP = Σ (Nilai Setara × SKS) / Σ SKS
Output program menampilkan daftar mata kuliah beserta nilai huruf, bobot nilai, dan hasil akhir IP Semester.

# FUNGSI

Praktikum ini membahas penggunaan fungsi untuk menghitung pendapatan setiap cabang toko bunga RoyalGarden.
Data disajikan dalam bentuk tabel (array 2 dimensi), di mana:
* Baris = Cabang toko
* Kolom = Jumlah stok bunga (Aglonema, Keladi, Alocasia, Mawar)
Setiap jenis bunga memiliki harga berbeda, lalu pendapatan dihitung dengan rumus:
Pendapatan = jumlah bunga × harga masing-masing
Program diminta untuk:
1. Membuat fungsi untuk menghitung total pendapatan tiap cabang jika semua bunga terjual.
2. Menentukan status cabang:
    * Pendapatan > Rp1.500.000 → Sangat Baik
    * Pendapatan ≤ Rp1.500.000 → Perlu Evaluasi
