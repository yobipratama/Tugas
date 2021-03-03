/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
class Tanah {
    int panjang, lebar;
    
    int luas() {
        return panjang*lebar;
    }
}
public class Nomor2 {
    public static void main(String[] args) {
        Scanner buana = new Scanner (System.in);
        int n; 
        System.out.println("Jumlah tanah: ");
        n = buana.nextInt();
        
        Tanah[] tanah = new Tanah[n];
        int[] luasTanah = new int[n];
        
        for (int i=0; i<tanah.length; i++) {
            tanah[i] = new Tanah();
            System.out.print("Tanah "+(i +1));
            System.out.println("");
            System.out.println("");
            System.out.print("Panjang\t: ");
            tanah[i].panjang = buana.nextInt();
            System.out.print("Lebar\t: ");
            tanah[i].lebar = buana.nextInt();
            luasTanah[i] = tanah[i].luas();
        }
        System.out.println("");
        for (int i=0; i<tanah.length; i++) {
            System.out.println("Luas Tanah: " + (i + 1) + ": " + luasTanah[i]);
        }
    }   
}

