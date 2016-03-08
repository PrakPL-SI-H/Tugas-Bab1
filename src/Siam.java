/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siam;

import java.util.Scanner;


public class Siam {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        for(int i=0;i<3;i++){
            Mahasiswa si=new Mahasiswa();
            si.displayMessage();
            System.out.println("====================================");
            Mahasiswa a=new Mahasiswa();
            System.out.print("Masukkan Nama                               :   ");
            String nama=in.nextLine();
            a.setNama(nama);
            System.out.print("Masukkan NIM                                :   ");
            String nim = in.nextLine();
            a.setNim(nim);
            System.out.print("Masukkan jurusan                            :   ");
            String jurusan = in.nextLine();
            a.setJurusan(jurusan);
            System.out.print("Masukkan IP anda                            :   ");
            double ip=in.nextDouble();
            a.setIp(ip);
            System.out.print("Masukkan kode mata kuliah yang anda ambil   :   ");
            int kodeMatkul=in.nextInt();
            a.setKodeMatkul(kodeMatkul);
            System.out.print("Nama mata kuliah                            :   ");
            String nama1=in.next();
            a.setNamaMatkul(nama1);
            System.out.println();
            System.out.print("Sistem Informasi Akademik Mahasiswa (SIAM) ");
            a.displayMessage();
            System.out.println("=========================================");
        }}}

