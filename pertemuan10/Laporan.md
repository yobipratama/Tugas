## Jobshet 8
Pertanyaan 8.2.3
1. Karena apa bila menggunakan 0 maka jika akan melakukan Enqueue maka mengisi di indeks
ke 1 bukan indeks 0. Maka dari itu dimulai dari -1, karena indeks dimulai dari 0.
2. Jadi potongan program tersebut merupakan kondisi ke 3. Apabila rear sama dengan max-1
maka rear menjadi 0. Dengan maksud apabila jika ingin melakukan enqueue, tetapi rear
sudah membatasi max maka akan mengisi pada indeks yang kosong. Max - 1 karena indeks
dimulai dari 0. Sehingga rear max – 1. 
Program tersebut berfungsi Mengecek apakah rear berada di indeks terakhir, jika iya maka
rear menuju indeks 0.
3. Pada program tersebut, karena menuju rear. Jadi pada program tersebut menunjukkan
penambahan data baru yang disimpan posisi terakhir. 
Q[rear] = data;
4. Pada program tersebut, karena menuju front. Jadi pada program tersebut menunjukkan
penambahan data baru yang disimpan posisi terakhir. 
data = Q[front];
5. Jadi potongan program tersebut merupakan kondisi ke 3. Apabila front sama dengan max-1
maka rear menjadi 0. Dengan maksud apabila jika ingin melakukan dequeue, tetapi front
sudah membatasi max maka akan mengurangi pada indeks yang kosong.
Program tersebut berfungsi Mengecek apakah front berada di indeks terakhir, jika iya maka
front menuju indeks 0.
6. Karena menjalankan program dari front. Dan isi dari stack tidak selalu dimulai dari 0. Maka
dari itu i dimulai dari front. Karne front menunjuk data yang terdepan.
7. i sama dengan i tambah 1 modulus max. Berarti i sama dengan i ditambah 1 sisa bagi dari
max. Berfungsi untuk mencegah print lebih dari max makah dimodulo max.

Pertanyaan 8.3.3
1. Kode tersebut berfungsi untuk menginstansiasi objek data yang berasal dari class Penumpang,
kemudian dari objek data tersebut nantinya akan digunakan untuk menyimpan attribut attribute
dari objek yang berada di Q[front] yang akan dikeluarkan / diambil.
2. Akan terjadi error sebagai berikut, dikarenakan kontruktor yang terdapat pada class Penumpang
adalah konstruktor berparameter, sehingga jika parameternya dihilangkan akan terjadi error.
3.  System.out.println("------------------------------");
        Mahasiswa data = antri.Dequeue();
          if (!"".equals(data.nim) && !"".equals(data.nama) && !"".equals(data.absen) 
            && !"".equals(data.ipk) ){
            System.out.println("Data yang dikeluarkan : " + data.nim + " " + data.nama + " " + 
                data.absen + " " + data.ipk + " " );
           break;
          }