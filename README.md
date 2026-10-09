# Janji
Saya Nezhad Ahmad Maliki dengan NIM 2503880 mengerjakan Tugas Praktikum 4 pada Mata Kuliah Desain dan Pemrograman Berorientasi Objek (DPBO) untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin

# Struktur File

```
├───cpp
│   ├───Dokumentasi
│   │       Input Laptop.png
│   │       Input PC.png
│   │       List laptop.png
│   │       List PC.png
│   │       Opsi Tampilan Data.png
│   │       Tampilan keluar program.png
│   │       Tampilan Utama.png
│   │
│   └───Program
│           CPU.cpp
│           Dekstop.cpp
│           GPU.cpp
│           Komputer.cpp
│           Laptop.cpp
│           Main.cpp
│           RAM.cpp
│           Storage.cpp
│
├───java
│   ├───Dokumantasi
│   │       Input Laptop.png
│   │       Input PC.png
│   │       List laptop.png
│   │       List PC.png
│   │       Opsi Tampilan Data.png
│   │       Tampilan keluar program.png
│   │       Tampilan Utama.png
│   │
│   └───Program
│           CPU.java
│           Dekstop.java
│           GPU.java
│           Komputer.java
│           Laptop.java
│           Main.java
│           RAM.java
│           Storage.java
│
└───python
    ├───Dokumantasi
    │       Input Laptop.png
    │       Input PC.png
    │       List laptop.png
    │       List PC.png
    │       Opsi Tampilan Data.png
    │       Tampilan keluar program.png
    │       Tampilan Utama.png
    │
    └───Program
            CPU.py
            Desktop.py
            GPU.py
            Komputer.py
            Laptop.py
            Main.py
            RAM.py
            Storage.py
```

# Desain & Alur Program

<img src="Design DIagram.png" width="100%">

## Karena program ini bertemakan tentang sebuah toko barang elektronik berupa pc dan laptop maka dibutuhkan class yag berhubungan dengan komponen dari komputer itu sendiri
### 1. Desain Class `CPU`
Semua atribut yang ada di class dibikin private. Jadi kalau mau ngambil atau ngubah nilainya, harus lewat method getter dan setter:
- `merek` (string): 
- `model` (string): 
- `kecepatan` (string): 

### 2. Desain Class `GPU`
Karena emua atribut yang ada di class dibikin private. Jadi kalau mau ngambil atau ngubah nilainya, harus lewat method getter dan setter:
- `merek` (string): 
- `model` (string): 
- `VRAM` (string): 

### 3. Desain Class `RAM`
Semua atribut yang ada di class dibikin private. Jadi kalau mau ngambil atau ngubah nilainya, harus lewat method getter dan setter:
- `kapasitas` (string): 
- `tipe` (string):

### 4. Desain Class `Storage`
Semua atribut yang ada di class dibikin private. Jadi kalau mau ngambil atau ngubah nilainya, harus lewat method getter dan setter:
- `kapasitas` (string): 
- `tipe` (string):

### 5. Desain Class `Laptop`
Semua atribut yang ada di class dibikin private. Jadi kalau mau ngambil atau ngubah nilainya, harus lewat method getter dan setter:
- `layar` (string): 
- `baterai` (string):

### 6. Desain Class `Dekstop`
Semua atribut yang ada di class dibikin private. Jadi kalau mau ngambil atau ngubah nilainya, harus lewat method getter dan setter:
- `casing` (string): 
- `psu` (string):

### 7. Desain Class `Komputer`
Semua atribut yang ada di class dibikin private. Jadi kalau mau ngambil atau ngubah nilainya, harus lewat method getter dan setter:
- `merek` (string): 
- `model` (string):
- `ram` (string): 
- `cpu` (string):
- `gpu` (string): 
- `storage` (string):


### 4. Alur Program (Flow Kode), Alur Design

jadi pada program toko enterkompudoom terdapat dua hubungan relasi antar class. terdapat relasi komposisi dan inherirance.
class yang berelasi komposisi ialah class cpu, gpu, ram, dan storage. mengapa? karena suatu komputer agar komputer itu dapat digunakkan dan berfungsi maka sebuah komputer sangat memerlukan komponen2 tersebut. makannya pada program ini komputer berelasi komposisi dengan komponen-komponennya.

pada atribut komputer, class-class dari komponennya yang berelasi komposisi dilakukkan dengan cara menginstansi saja dengan metode get dan set biasa. namun, apabila tidak ada maka program tidak dapat menginstansi komponen-komponennya dan program jadi tidak berjalan dengan seharusnya.

Alur pada program ini dimulai dengan user yang dapat menginput angka dari 1-4. apabila mengetik selain angka tersebut maka user akan dikeluarkan dari program. untuk opsi 1, user dapat melakukkan input data stok untuk laptop. untuk opsi 2, user dapat melakukkan input data stok pc dekstop. dan untuk input 3, user akan dibawa ke opsi pilihan lagi. user akan disuruh menginput angka 1-3. opsi 1 untuk menampilkan data laptop, opsi 2 untuk menampilkan data pc dekstop, dan opsi 3 untuk kembali ke halaman utama. pada opsi 4, user akan langsung dikeluarkan dari program.

# Dokumentasi

## C++

| Tampilkan Utama | Input Laptop | Input PC |
| :---: | :---: | :---: |
| <img src="cpp/Dokumentasi/Tampilan Utama.png" width="100%"> | <img src="cpp/Dokumentasi/Input Laptop.png" width="100%"> | <img src="cpp/Dokumentasi/Input PC.png" width="100%"> |
| **Opsi Tampilan Data** | **List data laptop Sebelum Input** | **List data PC Sebelum Input** |
| <img src="cpp/Dokumentasi/Opsi Tampilan Data.png" width="100%"> | <img src="cpp/Dokumentasi/List sebelum laptop.png" width="100%"> | <img src="cpp/Dokumentasi/list sebelum PC.png" width="100%"> |
| **List data laptop sesudah Input** | **List data PC sesudah Input** | **Tampilan Keluar Program** |
| <img src="cpp/Dokumentasi/List laptop.png" width="100%"> | <img src="cpp/Dokumentasi/List PC.png" width="100%"> | <img src="cpp/Dokumentasi/Tampilan keluar program.png" width="100%"> |

## Python

| Tampilkan Utama | Input Laptop | Input PC |
| :---: | :---: | :---: |
| <img src="python/Dokumantasi/Tampilan Utama.png" width="100%"> | <img src="python/Dokumantasi/Input Laptop.png" width="100%"> | <img src="python/Dokumantasi/Input PC.png" width="100%"> |
| **Opsi Tampilan Data** | **List data laptop Sebelum Input** | **List data PC Sebelum Input** |
| <img src="python/Dokumantasi/Opsi Tampilan Data.png" width="100%"> | <img src="python/Dokumantasi/List sebelum laptop.png" width="100%"> | <img src="python/Dokumantasi/list sebelum PC.png" width="100%"> |
| **List data laptop sesudah Input** | **List data PC sesudah Input** | **Tampilan Keluar Program** |
| <img src="python/Dokumantasi/List laptop.png" width="100%"> | <img src="python/Dokumantasi/List PC.png" width="100%"> | <img src="python/Dokumantasi/Tampilan keluar program.png" width="100%"> |

## java

| Tampilkan Utama | Input Laptop | Input PC |
| :---: | :---: | :---: |
| <img src="java/Dokumantasi/Tampilan Utama.png" width="100%"> | <img src="java/Dokumantasi/Input Laptop.png" width="100%"> | <img src="java/Dokumantasi/Input PC.png" width="100%"> |
| **Opsi Tampilan Data** | **List data laptop Sebelum Input** | **List data PC Sebelum Input** |
| <img src="java/Dokumantasi/Opsi Tampilan Data.png" width="100%"> | <img src="java/Dokumantasi/List sebelum laptop.png" width="100%"> | <img src="java/Dokumantasi/list sebelum PC.png" width="100%"> |
| **List data laptop sesudah Input** | **List data PC sesudah Input** | **Tampilan Keluar Program** |
| <img src="java/Dokumantasi/List laptop.png" width="100%"> | <img src="java/Dokumantasi/List PC.png" width="100%"> | <img src="java/Dokumantasi/Tampilan keluar program.png" width="100%"> |
