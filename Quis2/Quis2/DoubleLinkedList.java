/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

/**
 *
 * @author Asus
 */
public class DoubleLinkedList {

    //mendeklarasikan atribut
    Node head;
    int size;

    //membuat konstruktor
    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    //method isEmpty untuk memastikan kondisi linked list kosong
    public boolean isEmpty() {
        return head == null;
    }

    //method addFirst untuk penambahan data di bagian depan linked list
    public void addFirst(String nim, String nama, String jurusan, String prodi, double ipk) {
        if (isEmpty()) {
            head = new Node(null, nim, nama, jurusan, prodi, ipk, null);
        } else {
            Node newNode = new Node(null, nim, nama, jurusan, prodi, ipk, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    //method addLast() untuk penambahan data di bagian belakang linked list
    public void addLast(String nim, String nama, String jurusan, String prodi, double ipk) {
        if (isEmpty()) {
            addFirst(nim, nama, jurusan, prodi, ipk);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, nim, nama, jurusan, prodi, ipk, null);
            current.next = newNode;
            size++;
        }
    }

    //method add untuk menambahkan data pada posisi yang telah ditentukan dengan indeks
    public void add(String nim, String nama, String jurusan, String prodi, double ipk, int index) throws Exception {
        if (isEmpty()) {
            addFirst(nim, nama, jurusan, prodi, ipk);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai Indeks di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, nim, nama, jurusan, prodi, ipk, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, nim, nama, jurusan, prodi, ipk, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    //method size untuk mendapatkan nilai dari size
    public int size() {
        return size;
    }

    //method clear untuk menghapus semua isi linked list
    public void clear() {
        head = null;
        size = 0;
    }

    //method print untuk mencetak isi linked list
    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println("NIM : " + tmp.nim);
                System.out.println("Nama: " + tmp.nama);
                System.out.println("Jurusan: " + tmp.jurusan);
                System.out.println("Prodi: " + tmp.prodi);
                System.out.println("IPK : " + tmp.ipk);
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }

    //method removeFirst untuk menghapus data di bagian depan
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    //method removeLast untuk menghapus data di bagian belakang
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    //method remove untuk menghapus data
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    //method getFirst untuk mendapatkan data pada awal linked list
    public void getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        System.out.println("NIM   : " + head.nim);
        System.out.println("Nama  : " + head.nama);
        System.out.println("Jurusan : " + head.jurusan);
        System.out.println("Prodi : " + head.prodi);
        System.out.println("IPK   : " + head.ipk);
    }

    //method searchData untuk mencari data
    public void searchData(String caridata) {
        Node tmp = head;
        int posisi = -1;
        int indeks = 1;
        while (tmp != null) {
            if (tmp.nim.equals(caridata)) {
                posisi = indeks;
                break;
            }
            indeks++;
            tmp = tmp.next;
        }
        if (posisi == -1) {
            System.out.println("Data Tidak Ditemukan");
        } else {
            System.out.println("Data " + caridata + " berada di node ke-" + posisi);
            System.out.println("IDENTITAS: ");
            System.out.println("NIM : " + caridata);
            System.out.println("Nama: " + tmp.nama);
            System.out.println("Jurusan: " + tmp.jurusan);
            System.out.println("Prodi: " + tmp.prodi);
            System.out.println("IPK : " + tmp.ipk);
        }

    }

    //method sortList untuk mengurutkan data menggunakan bubble sort scr desc
    Node sortList() {
        int swap, i;
        Node dataawal;
        Node datanext = null;
        if (head == null) {
            return null;
        }
        do {
            swap = 0;
            dataawal = head;
            while (dataawal.next != datanext) {
                if (dataawal.ipk < dataawal.next.ipk) {
                    double temp = dataawal.ipk;
                    dataawal.ipk = dataawal.next.ipk;
                    dataawal.next.ipk = temp;
                    swap = 1;
                }
                dataawal = dataawal.next;
            }
            datanext = dataawal;
        } while (swap != 0);
        return head;
    }

    //method printSort untuk mencetak isi bubble sort
    public void printSort() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.ipk + " ");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }

}
