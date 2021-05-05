/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author Asus
 */
public class Node {

    int antrian;
    String nama;
    Node prev, next;

    Node(Node prev, int antrian, String nama, Node next) {
        this.prev = prev;
        this.antrian = antrian;
        this.nama = nama;
        this.next = next;
    }

}
