
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prasetyo
 */
public class Siam {

public String nama;
public String nim;
public String jurusan;
public Double ipk;
public String matkul;
public int sks;
public int krs;


Scanner in = new Scanner(System.in);

public void setNama(String nm){ 
    nama = nm;
}
public void setNim(String im){
    nim = im;
}
public void setJurusan(String ju){
    jurusan = ju ;
}

public void displayMessage(){
        System.out.println("Nama    = "+nama);
        System.out.println("Nim     = "+nim);
        System.out.println("Jurusan = "+jurusan);
        System.out.println("ipk     = "+ipk);
    }
public void jumlahSks(){
    if (ipk > 3.5)
        System.out.println("24-22 sks");
    else if (ipk < 3.5)
        System.out.println("21-19 sks");
    else if (ipk < 3.0)
        System.out.println("18-16 sks");
    else if (ipk < 2.5)
        System.out.println("15-13 sks");
    else
        System.out.println("12 sks");
}
public void krs(){
    System.out.println("Menu KRS");
    System.out.println("1.Banyak Sks yang bisa diambil");
    System.out.println("2.Pilih Matkul");
    System.out.println("3.Cetak Krs");
    System.out.println("4.Keluar");
    System.out.println("Masukkan pilhan anda = ");
    int pilih = in.nextInt();
    switch(pilih){
        case 1 : System.out.println("Banyak Sks yang bisa diambil");
        case 2 : System.out.println("Pilih Matkul");
                 
                
    }

}
    
}