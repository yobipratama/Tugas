/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author Asus
 */
public class DoubleLinkedList {

    Node head;
    int size;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(String judulbuku) {
        if (isEmpty()) {
            head = new Node(null, judulbuku, null);
        } else {
            Node newNode = new Node(null, judulbuku, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;

    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public String peek() {
        return head.judulBuku;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("--------------------------");
            System.out.println("Cetak Seluruh Judul Buku");
            System.out.println("--------------------------");
            while (tmp != null) {
                System.out.println(tmp.judulBuku + "\t");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void removeTop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih kosong, tidak depat dihapus");
        } else {
            System.out.println(head.judulBuku + " Berhasil Di Hapus");
            head = head.next;
            head.prev = null;
            size--;
        }
    }

}
