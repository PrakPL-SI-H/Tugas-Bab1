
import java.util.Scanner;

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
public class LatihanBab1 {
            
class mainSiam {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("   ====== SIAM ======    ");
        System.out.print("Masukkan jumlah Mahasiswa : ");
        int jmlhMhs = input.nextInt();
        double ip;
        for (int i = 0; i < jmlhMhs; i++) {
            System.out.println("");
            System.out.println("        Identitas Mahasiswa            ");
            System.out.println("Mahasiswa ke-" + (i + 1) + " : ");
            System.out.print("Nama      : ");
            String nama = input.next();
            System.out.print("NIM       : ");
            String nim = input.next();
            System.out.print("Jurusan   : ");
            String jurusan = input.next();
            do {
                 System.out.print("IP        : ");
                ip = input.nextDouble();
                if (ip > 4) {
                    System.out.println("IP tidak valid, Masukan kembali");
                }
            } while (ip > 4);
            siam s1 = new siam(nama, nim, jurusan, ip);
            s1.jmlSKS();
            s1.KRS();
            s1.display();
        }
    }
}

    }
    
public class siam {

    Scanner input = new Scanner(System.in);
    double ip;
    String nama, nim, jurusan;
    int sksMax, sksMasuk, jmlMatkul;
    String[] matkul = new String[10];
    String[] kodeMatkul = new String[10];
    int[] sksInput = new int[10];

    siam(String nama, String nim, String jurusan, double ip) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ip = ip;
    }

    public void jmlSKS() {
        if (ip < 1.49) {
            sksMax = 12;
        } else if (ip >= 1.50 && ip < 1.99) {
            sksMax = 15;
        } else if (ip >= 2.00 && ip < 2.49) {
            sksMax = 18;
        } else if (ip >= 2.5 && ip < 2.99) {
            sksMax = 21;
        } else if (ip >= 3.00 && ip <= 4.00) {
            sksMax = 24;
        }
    }

    public void KRS() {
        System.out.println("=============== KRS ==============");
        System.out.println("Jumlah SKS yang bisa diambil  : " + sksMax);
        System.out.print("Jumlah Mata kuliah yang diambil : ");
        jmlMatkul = input.nextInt();
        int i = 0;

        while (sksMasuk < sksMax) {
            System.out.print("Kode Mata kuliah ke - " + (i + 1) + " : ");
            kodeMatkul[i] = input.next();
            System.out.print("Nama Mata kuliah ke - " + (i + 1) + " : ");
            matkul[i] = input.next();
            System.out.print("Jumlah SKS ke - " + (i + 1) + " : ");
            sksInput[i] = input.nextInt();
            System.out.println("");
            sksMasuk += sksInput[i];
            i++;
            if (sksMasuk > sksMax) {
                System.out.println("Maaf, Jumlah SKS yang anda ambil melebihi jumlah maksimal");
            }
            if (i == jmlMatkul) {
                break;
            }
            if (sksMasuk <= sksMax) {
                System.out.println("=> Sisa SKS yang dapat anda ambil adalah: " + (sksMax - sksMasuk));
            }

        }
    }

    public void display() {
        if (sksMasuk > sksMax) {
            System.out.println("\nMaaf, KRS tidak dapat di tampilkan");
        } else {
            System.out.println("======= Kartu Rencana Studi ========");
            System.out.println("Nama Mahasiswa    : " + this.nama);
            System.out.println("NIM Mahasiswa     : " + this.nim);
            System.out.println("Jurusan Mahasiswa : " + this.jurusan + "\n");
            System.out.println("Mata Kuliah yang telah diambil :");
            for (int i = 0; i < jmlMatkul; i++) {
                System.out.println((i + 1) + ". " + kodeMatkul[i] + " " + matkul[i] + " " + sksInput[i] + " SKS");
            }
            System.out.println("Total SKS yang diambil : " + sksMasuk);
        }
    }

}
