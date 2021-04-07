## Jobshet 5
Pertanyaan 4.2.3 
1. Membagi menjadi 2 upa-masalah. Pada kode program di atas berada pada baris if 
(n==1) dan else.
Menyelesaikan masalah (solusi) secara rekursif. Pada kode program di atas berada 
pada baris int fakto = n * faktorialDC (n - 1).
Menggabungkan hasil solusi dari kedua upa-masalah. Pada kode program di atas 
berada pada baris return 1 dan return fakto.
2. Divide : if (n==1) dan else. Terdapat pada baris 16.
Conquer : int fakto = n * faktorialDC(n-1). Terdapat pada baris 20.
Combine : return 1 dan return fakto. Terdapat pada baris 17 dan 21.
3. Iya memungkinkan dapat diubah menggunakan while
Pertanyaan 4.3.3
1.  PangkatBF menggunakan iteratifsedangkan PangkatDC menggunakan rekursif.
2. : Jika (n%2==1) maka merupakan bilangan ganjil. Jadi, perhitungan pangkat 
dikalikan dengan a lagi (pangkatDC(a, n/2) * pangkatDC(a, n/2) * a), dan jika selain itu 
maka merupakan bilangan genap jadi perhitungannya hanya (pangkatDC(a, n/2) *
pangkatDC(a, n/2)).
3. Belum, Tahapan combine belum termasuk dalam kode tersebut karena hanya 
terdapat 2 solusi dari 2 upa-masalah, sedangkan jumlah semua upa-masalah dan solusi dari 
upa-masalah tersebut adalah 3. Jadi, belum bisa di combine.
4.4.3 Pertanyaan
1. Keuntungan TotalBF yaitu:
Dapat digunakan untuk memecahkan hampir sebagian besar masalah, sederhana, 
mudah dimengerti, lebih cocok dalam permasalahan yg berukuran kecil seperti 
penjumlahan/perkalian n buahbilangan, menentukan elemen minimum/maksimum.
Keuntungan TotalDC yaitu:
Dapat digunakan untuk memecahkan masalah yang sulit, memiliki efisiensi 
algoritma yang tinggi seperti sorting, bekerja secara parallel.
3. Karena digunakan untuk memenuhi solusi pada upa-masalah ke-2, 
menggunakan cara rekursif dengan menjumlahkan hasil hitungan lsum, rsum, dan arr[mid].
4. Karena variabel mid digunakan sebagai tempat dari rumus (l+r)/2 dengan 
bertipe data integer. Baris kode variabel mid dituliskan terlebih dahulu agar dapat dipanggil 
di baris kode yang lain, agar tidak menuliskan rumus yang sama, dan hanya perlu 
memanggil variabel mid.


