package siam;

import java.util.Scanner;

public class Siam {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama, nim, jurusan, kodeMatkul, namaMatkul;
        double ip;
        int matkul = 0, sks = 0;
        dataMhs mahasiswa[] = new dataMhs[4];
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("          SISTEM INFORMASI AKADEMIK MAHASISWA (SIAM)       ");
            System.out.println("=======================================================================");
            System.out.print("Masukkan Nama       : ");
            nama = in.nextLine();
            System.out.print("Masukkan NIM        : ");
            nim = in.nextLine();
            System.out.print("Masukkan Jurusan    : ");
            jurusan = in.nextLine();
            System.out.print("Masukkan IP         : ");
            ip = in.nextDouble();
            mahasiswa[i] = new dataMhs(nama, nim, jurusan, ip);
            System.out.println("JUMLAH SKS          : " + mahasiswa[i].sksmin);
            in.nextLine();
            System.out.println("JUMLAH MAKSIMUM SKS : " + mahasiswa[i].sksmax);
            in.nextLine();
            String pilih;
            boolean pilihan = true;
            while (pilihan == true) {
                System.out.println("============================= LIST MATA KULIAH ==========================");
                System.out.println("1. IFK15002 Pemrograman Lanjut                      : 5 SKS");
                System.out.println("2. UBU0008  Bahasa Inggris                          : 3 SKS");
                System.out.println("3. PTI15008 Sistem Operasi                          : 4 SKS");
                System.out.println("4. SIF15101 Manajemen dan Organisasi                : 3 SKS");
                System.out.println("5. SIF15103 Sistem Fungsional Bisnis                : 4 SKS");
                System.out.println("6. PTI15004 Matematika Komputasi                    : 4 SKS");
                System.out.println("7. PTI15005 Interaksi Manusia & Komputer            : 3 SKS");
                System.out.println("8. PTI15002 Pengantar Teknologi dan Ilmu Komputer   : 3 SKS");
                System.out.println("9. UNG4008  Bahasa Indonesia                        : 3 SKS");
                System.out.print("Masukkan Kode Mata Kuliah : ");
                kodeMatkul = in.nextLine();
                System.out.print("Masukkan Nama Mata Kuliah : ");
                namaMatkul = in.nextLine();
                System.out.print("Masukkan SKS Mata Kuliah : ");
                sks = in.nextInt();
                mahasiswa[i].setmatkul(matkul, kodeMatkul, sks, namaMatkul);
                in.nextLine();
                System.out.println("Apakah Anda ingin menambahkan mata kuliah? (Ya/Tidak)");
                pilih = in.nextLine();
                System.out.println(" ");
                switch (pilih) {
                    case "Ya":
                        pilihan = true;
                        break;
                    case "Tidak":
                        pilihan = false;
                        break;
                    default:
                        pilihan = false;
                }
            }
            mahasiswa[i].displayMessage();
        }
    }

}
