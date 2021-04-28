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
public class SLLMain {

    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
        singLL.addFirst('A');
        singLL.print();
        singLL.addLast('C');
        singLL.print();
        singLL.insertAt(1, 'B');
        singLL.print();
        singLL.insertAfter('C', 'E');
        singLL.print();
        singLL.insertBefore('E', 'D');
        singLL.print();

    }

}
