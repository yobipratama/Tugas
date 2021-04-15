/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class strukmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        struk str = new struk(0);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        for (int i = 0; i < 8; i++) {
            System.out.println("Nomor transaksi : ");
            String ntr = sc.nextLine();
            System.out.println("Tanggal pembelian : ");
            String tpe = sc1.nextLine();
            System.out.println("Jumlah barang : ");
            int jba = sc2.nextInt();
            System.out.println("Tanggal bayar : ");
            int tba = sc2.nextInt();
            System.out.println("");
            struk st = new struk (ntr, tpe, jba, tba);
            str.push(st);
        }
        str.print();
        for (int i = 0; i < 5; i++) {
            str.pop();
            
        }
    }
    
}
