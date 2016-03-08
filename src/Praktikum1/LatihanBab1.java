package Praktikum1;

import java.util.Scanner;

public class LatihanBab1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        Mahasiswa mhs = new Mahasiswa();
        do {
            System.out.println("Menu");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Input Data KRS");
            System.out.println("3. Print KRS");
            System.out.println("0. Exit");
            System.out.print("Pilih Menu: ");
            num = in.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Masukkan Data Mahasiswa");
                    System.out.print("Nama          : ");
                    mhs.nama = in.next();
                    System.out.print("NIM           : ");
                    mhs.nim = in.next();
                    System.out.print("Jurusan       : ");
                    mhs.jurusan = in.next();
                    System.out.print("IPK           : ");
                    mhs.ipk = in.nextDouble();
                    break;
                case 2:
                    System.out.println("Input Data KRS");
                    System.out.print("Kode Matkul   : ");
                    mhs.kode = in.next();
                    System.out.print("Matkul        : ");
                    mhs.matkul = in.next();
                    System.out.print("SKS           : ");
                    mhs.setSks(in.nextInt());
                    break;
                case 3:
                    System.out.println("KRS Mahasiswa");
                    mhs.printData();
                    break;
            }
        } while (num != 0);
    }
}
