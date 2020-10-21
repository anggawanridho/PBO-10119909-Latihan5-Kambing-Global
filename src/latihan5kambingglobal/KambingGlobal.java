/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5kambingglobal;

/**
 *
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */
public class KambingGlobal {
    //Variable Jumlah Kambing menjadi variable instance
    int jumlahKambing = 88;
    
    //method menampilkan jumlah kambing
    public void getJumlahKambing(){
        System.out.println("Jumlah Kambing: "+jumlahKambing);
    }
    
   
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: "+jumlahKambing);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KambingGlobal kambingSusu = new KambingGlobal();
   
        //menampilkan jumlah kambing yang ada saat program pertama kali berjalan
        kambingSusu.getJumlahKambing();
        
        //menambah satu kambing
        kambingSusu.tambahKambing();
        
        //menambahkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
        
    }
    
}
