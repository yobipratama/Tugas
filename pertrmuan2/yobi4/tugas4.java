/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yobi4;

class Bilangan {
    int x, y, width, heigth;
    
    void moveLeft (int n) {
        x-=n;
    }
    void  moveRigth (int n) {
        x+=n;
    }
    void moveUp (int n) {
        y+=n;
    }
    void moveDown (int n) {
        y-=n;
    }
    void printPosition (){
        System.out.println("Lebar Area\t\t: " + width);
        System.out.println("Panjang Area\t\t: " + heigth);
        System.out.printf("Posisi Akhir PacMan\t: %s,%s ", x, y);
    }
}
public class tugas4 {
    public static void main (String[] args) {
        Bilangan b1 = new Bilangan ();
        b1.x = 0;
        b1.y = 0;
        b1.width = 16;
        b1.heigth = 16;
        b1.moveRigth(10);
        b1.moveLeft(2);
        b1.moveUp(17);
        b1.moveDown(15);
        b1.printPosition();
    }
}