/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspemlan1;

import java.util.Scanner;

/**
 *
 * @author kevinnaphan
 */
public class Siam {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Mahasiswa[] ub = new Mahasiswa[3];
        double IP;
        String Nama, NIM, Jurusan, namamk, kodemk, tambah = null;
        int sks;

        for (int i = 0; i < ub.length; i++) {
            System.out.print("Nama : ");
            Nama = in.nextLine();
            System.out.print("NIM : ");
            NIM = in.nextLine();
            System.out.print("Jurusan : ");
            Jurusan = in.nextLine();
            System.out.print("IP : ");
            IP = in.nextDouble();
            ub[i] = new Mahasiswa(Nama, NIM, Jurusan, IP);
            ub[i].tampilsks();
            in.nextLine();

            boolean pilih = true;
            while (pilih) {
                System.out.print("Kode mata kuliah : ");
                kodemk = in.nextLine();
                System.out.print("Nama mata kuliah : ");
                namamk = in.nextLine();
                System.out.print("Jumlah sks : ");
                sks = in.nextInt();
                ub[i].matkul(kodemk, namamk, sks);
                System.out.print("Tambah (y/n) : ");
                tambah = in.next().toLowerCase();
                switch (tambah) {
                    case "y":
                        pilih = true;
                        break;
                    case "n":
                        pilih = false;
                        break;
                    default:
                        System.out.println("Pilihan salah");
                }

                in.nextLine();

            }
            ub[i].tampil();
        }

    }
}
