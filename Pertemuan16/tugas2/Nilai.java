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
public class Nilai {
     String kodenilai, kodematkul, nimmhs;
    float nilai;
    
    Nilai(){
        
    }
    
    Nilai(String kodenilai, float nilai, String kodematkul, String nimmhs){
       this.kodenilai = kodenilai;
       this.nilai = nilai;
       this.kodematkul = kodematkul;
       this.nimmhs = nimmhs;
    }
}
