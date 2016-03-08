/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author irwin deriyan
 */
import java.util.Scanner;
public class Bab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TugasPraktikum satu = new TugasPraktikum();
        System.out.print("Masukan Nama Anda : ");
        satu.nama = input.next();
        System.out.print("Masukkan Jurusan Anda : ");
        satu.jurusan=input.next();
        System.out.print("Masukkan NIM anda : ");
        satu.nim=input.next();
        System.out.print("Silahkan masukkan IP anda : ");
        double ip =input.nextDouble();
        satu.showMe(ip);
        System.out.println();
        satu.jumlahSks(ip);
        System.out.println();
        satu.kodeMatkul();
    }
}
public class TugasPraktikum {
    String nim, nama, jurusan;
    double sks, ip, kode;
    void kodeMatkul(){
        System.out.println("Mata Kuliah             Kode        Jumlah SKS");
        System.out.println("Pemrograman Lanjut      pemlan            5");
        System.out.println("Sistem Operasi          sisop             4");
        System.out.println("Sistem Digital          sisdig            5");
        System.out.println("Bhs. Inggris            bing              3");
        System.out.println("Sistem Bisnis           sinis             4");
        System.out.println("Desain Web              deb               4");
    }
    void jumlahSks(double ip){
        if(ip>=3.00)
            System.out.println("Anda mendapatkan sks dengan maksimal 24");
            else if (ip<3.00 && ip>=2.50 ){
                System.out.println("Anda mendapatkan sks dengan maksimal 20 ");
            }else if (ip<2.50 && ip>=2.00){
                System.out.println("Anda mendapatkan sks dengan maksimal 18");
            }else if (ip<2.00 && ip>=1.50){
                System.out.println("Anda mendapatkan sks dengan maksimal 15");
            }else if (ip<1.50){
                System.out.println("Anda mendapatkan sks dengan maksimal 12");
            }   
    }
    void showMe(double ip){
        System.out.println("Nama    = "+nama);
        System.out.println("NIM     = "+nim);
        System.out.println("Jurusan = "+jurusan);
        System.out.println("IP      = "+ip);
        System.out.println("Kelengkapan Akademik anda sudah kami catat, silahkan anda lanjutkan ke bagian Akademik ");
        System.out.println("Untuk Mahasiswa selanjutnya, silahkan ulangi aplikasi ini");
    }
}
