
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
public int mk;
int barisan[];
int panjang;


Scanner in = new Scanner(System.in);
    private int pilih;

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
    public void cetak() {
        for (int i = 0; i < barisan.length; i++) {
            System.out.println("Matkul ke-" + (i+1) + " = "+ barisan[i]);
        }
    }
    public void mk(){
        if (mk == 01)
            System.out.println("Pemrograman Lanjut");
        else if (mk == 02)
            System.out.println("Sistem Operasi");
        else if (mk == 03)
            System.out.println("Interaksi Manusia dan komputer");
        else if (mk == 04)
            System.out.println("Bahasa Indonesia");
        else if (mk == 05)
            System.out.println("Sistem fungsional bisnis");
        else if (mk == 06)
            System.out.println("Matematika komputasi lanjut");
        else
            System.out.println("angka yang anda masukkan Salah");
    }
            
    public void krs(){
    do{
    System.out.println("Menu KRS");
    System.out.println("1.Banyak Sks yang bisa diambil");
    System.out.println("2.Pilih Matkul");
    System.out.println("3.Cetak Krs");
    System.out.println("0.Keluar");
    System.out.println("Masukkan pilhan anda = ");
    pilih = in.nextInt();
    switch(pilih){
        case 1 : System.out.print("Banyak Sks yang bisa diambil = ");
                 jumlahSks();
                 break;
        case 2 : System.out.println("Pilih Matkul");
                 System.out.println("Daftar Matan Kuliah");
                 System.out.println(" Nama mata kuliah                 sks  kode");
                 System.out.println("1.Pemrograman Lanjut               5    01");
                 System.out.println("2.Sistem Operasi                   4    02");
                 System.out.println("3.Interaksi Manusia dan komputer   3    03");
                 System.out.println("4.Bahasa Indonesia                 3    04");
                 System.out.println("5.Sistem fungsional bisnis         4    05");
                 System.out.println("6.Matematika komputasi lanjut      5    06");
                 System.out.println("Masukkan banyak = ");
                 mk = in.nextInt();
                 break;
        case 3 : System.out.println("Cetak Krs");
                 mk();
                 break;
        default:
                if (pilih == 0) {
                        break;
                }
                System.out.println("Maaf, Pilihan Tidak Tersedia");
        }
    }while(pilih  !=0);
        System.out.println("Terima kasih");
    }   
}