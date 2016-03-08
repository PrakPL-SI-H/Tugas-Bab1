/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_jawaban_laporan;

import java.util.Scanner;

/**
 *
 * @author TEGAR
 */
public class SIAMmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
       DataMahasiswa mhs=new DataMahasiswa();
        System.out.println("Masukkan nama anda      : ");
        mhs.nama=in.next();
        System.out.println("masukkan NIM anda       : ");
        mhs.NIM=in.next();
        System.out.println("masukkan IP anda        : ");
        mhs.IP=in.nextDouble();
        System.out.println("masukkan jurusan anda   : ");
        mhs.jurusan=in.next();
        
        mhs.displaymessage();
        System.out.println("===========================================");
    }
    
}
