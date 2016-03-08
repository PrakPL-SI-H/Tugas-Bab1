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
         String tanya="";
         String tanya2="";
         do{
       DataMahasiswa mhs=new DataMahasiswa();
        System.out.println("--->>>>>>>>>><<<<<<<<<<---");
        System.out.println("PROGRAM SEDERHANA SIAM UB");
        System.out.println("==========================");
        System.out.println("Masukkan nama anda      : ");
        mhs.nama=in.next();
        System.out.println("masukkan NIM anda       : ");
        mhs.NIM=in.next();
        System.out.println("masukkan jurusan anda   : ");
        mhs.jurusan=in.next();
        
        mhs.displaymessage();
        System.out.println("===========================================");
       
        
        SKSTerpilih mhs2=new SKSTerpilih();
        
        mhs2.MatKul();
        System.out.println("Silahkan memilih mata kuliah ");
        System.out.println("Masukkan IP kalian                                      : ");
        mhs2.IP =in.nextDouble();
        System.out.println(+mhs2.jumlahIP());
        do{
        System.out.println("Masukkan nama mata kuliah yang akan ditambahkan         : ");
        mhs2.matkul=in.next();
        System.out.println("Masukkan jumlah SKS yang dimiliki mata kuliah tersebut  : ");
        mhs2.SKS=in.nextInt();
        
        System.out.println("Apakah anda ingin melanjutkan menambah mata kuliah?Y/N");
             tanya2 =in.next();
             
     }while(!("N").equals(tanya2));
        
        mhs2.jumlahSKSToT();
        
        
             System.out.println("Apakah anda ingin melanjutkan?Y/N");
             tanya =in.next();
             
    }while(!("N").equals(tanya));
         }
    
}
