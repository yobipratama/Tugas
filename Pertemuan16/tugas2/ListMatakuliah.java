/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Asus
 */
public class ListMatakuliah {
     List<MataKuliah> matkul = new ArrayList<>();
    
    public void tambah(MataKuliah... matakuliah){
        matkul.addAll(Arrays.asList(matakuliah));
    }
    
    public void hapus(int index){
        matkul.remove(index);
    }
    
    public void update(int index, MataKuliah matakuliah){
        matkul.set(index, matakuliah);
    }
    
    public void tampil(){
        matkul.stream().forEach(mt -> {
            System.out.println("" + mt.toString());
        });
    }
    
    int linearSearch(String kode){
        for(int i = 0; i < matkul.size(); i++){
            if(kode.equals(matkul.get(i).kode)){
                return i;
            }
        }
        return -1;
    }
}
