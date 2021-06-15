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
public class ListNilai {
    List<Nilai> nil = new ArrayList<>();
    
    public void tambah(Nilai... n){
        nil.addAll(Arrays.asList(n));
    }
    
    public void hapus(int index){
        nil.remove(index);
    }
    
    public void update(int index, Nilai n){
        nil.set(index, n);
    }
    
    public void tampil(){
        nil.stream().forEach(mt -> {
            System.out.println("" + mt.toString());
        });
    }
    
    int linearSearch(String nilai){
        for(int i = 0; i < nil.size(); i++){
            if(nilai.equals(nil.get(i).nilai)){
                return i;
            }
        }
        return -1;
    }
}
