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
public class MataKuliah {
    String kode, matkul, sks;
    
    MataKuliah(String kode, String matkul, String sks){
        this.kode = kode;
        this.matkul = matkul;
        this.sks = sks;
    }
    
    @Override
    public String toString(){
        return ""+ kode +"        "+ matkul +"     "+ sks;
    }
}
