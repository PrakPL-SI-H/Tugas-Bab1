package pemrogramanlanjut;

import java.util.Scanner;

public class MainMahasiswa {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("================ SIAM ================");
        Mahasiswa MHS[] = new Mahasiswa[3];
        for (int i = 1; i <= MHS.length; i++) {

            System.out.print("Masukkan Nama Anda\t\t : ");
            String nama = in.next();
            System.out.print("Masukkan NIM Anda\t\t : ");
            String nim = in.next();
            System.out.print("Masukkan Jurusan Anda\t\t : ");
            String jurusan = in.next();
            System.out.print("Masukkan IP Anda\t\t : ");
            double ip = in.nextDouble();

            MHS[i] = new Mahasiswa(nama, nim, jurusan, ip);
            System.out.println("-----------------------------------------");

            MHS[i].setTotalSKS();
            MHS[i].setmatkul();
            System.out.println("-----------------------------------------");

            MHS[i].showData();
            System.out.println("=========================================");
        }
    }

}
