/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class GraphMain {

    public static void main(String[] args) throws Exception {
        int count = 1, to, from, pilih;
        boolean jenis;
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih jenis graph");
        System.out.println("1. Directed");
        System.out.println("2. Undirected");
        System.out.print("Pilih : ");
        pilih = input.nextInt();
        if (pilih == 1) {
            System.out.println("Menggunakan Directed");
            jenis = true;
        } else {
            System.out.println("Menggunakan Undirected");
            jenis = false;
        }
        System.out.println("");
        Graph graph = new Graph(6, jenis);
        System.out.print("Masukkan jumlah inputan lintasan : ");
        int jumlah = input.nextInt();
        System.out.println("------------------------------------");
        System.out.println("Masukkan edges: ");
        while (count <= jumlah) {
            to = input.nextInt();
            from = input.nextInt();
            graph.addEdge(to, from);
            count++;
        }
        System.out.println("");
        graph.printGraph();
        graph.degree(2);
        graph.removeEdge(1, 2);
        graph.printGraph();
    }
}
