# 13.2.2 Pertanyaan Percobaan
Praktikum 1
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan 
dibanding binary tree biasa?
Jawaban: Karena pada binary search tree semua left-child harus lebih kecil dari pada 
right child dan parentnya, sedangkan binary tree biasa tidak. Binary search tree adalah 
binary tree yang seluruh children dari tiap node terurut sehingga dalam pencarian data 
jauh lebih efektif dari awal sampai akhir.
2. Untuk apakah di class Node, kegunaan dari atribut left dan right?
Jawaban: Kegunaan atribut left dan right adalah untuk menyimpan index. Dimana left 
untuk menyimpan index yang nilainya lebih kecil dari root sedangkan right untuk 
menyimpan index yang nilainya lebih besar dari root.
3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?
Jawaban: Untuk menentukan node pertama dalam tree yang tidak memiliki predesesor
dan sebagai penunjukan.
b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?
Jawaban: Nilai root ketika objek tree pertama kali dibuat adalah bernilai null (kOSONG)
4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang 
akan terjadi?
Jawaban: Proses yang akan terjadi adalah proses add dimana node baru tersebut 
langsung masuk dan menjadi root dalam sebuah tree.
5.  Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang 
akan terjadi?
Jawaban: Proses yang akan terjadi adalah proses add dimana node baru tersebut 
langsung masuk dan menjadi root dalam sebuah tree.

Praktikum 2
13.3.2 Pertanyaan Percobaan
1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?
Jawaban: Atribut data digunakan untuk menyimpan data sedangkan idxLast 
digunakan untuk menyimpan batas index yang akan diprint.
2. Apakah kegunaan dari method populateData()?
Jawaban: Kegunaan dari method populateData() adalah untuk menginisialisasikan 
atribut data dan idxLast.
3. Apakah kegunaan dari method traverseInOrder()?
Jawaban: Kegunaan dari method traverseInOrder() adalah untuk mencetak / 
menampilkan data dengan InOrder.
4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah 
posisi left child dan rigth child masin-masing?
Jawaban: Left child dari node tersebut akan berada di indeks 2i + 1. Right child dari 
node tersebut akan berada di indeks 2i + 2. Maka left child berada pada indeks ke 5 dan 
right child berada pada indeks ke 6.
5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?
Jawaban: Kegunaan dari statement int idxLast = 6 adalah untuk menentukan posisi 
pada index terakhir.

