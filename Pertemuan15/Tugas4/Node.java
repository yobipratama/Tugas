/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author Asus
 * @param <T>
 */
public class Node<T> {
    T data;
    Node<T> prev;
    Node<T> next;

    public Node(Node<T> prev, T nilai, Node<T> next){
        this.prev = prev;
        this.data = nilai;
        this.next = next;
    }
}
