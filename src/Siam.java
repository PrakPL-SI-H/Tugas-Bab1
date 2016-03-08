package siam;
import java.util.Scanner;
public class Siam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama, NIM, jurusan, kodeMatkul, namaMatkul;
        double IP;
        int sks, matkul = 0;
        Mahasiswa[] mhs = new Mahasiswa[5];
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("                SISTEM INFORMASI AKADEMIK MAHASISWA     ");
            System.out.println("=======================================================================");
            System.out.print("Nama Mahasiswa    : ");
            nama = in.nextLine();
            System.out.print("NIM Mahasiswa     : ");
            NIM = in.nextLine();
            System.out.print("Jurusan Mahasiswa : ");
            jurusan = in.nextLine();
            System.out.print("Masukkan IP       : ");
            IP = in.nextDouble();
            mhs[i] = new Mahasiswa(NIM, nama, jurusan, IP);
            System.out.println("Jumlah SKS Minimal yang dapat Anda ambil adalah : " + mhs[i].sksMin);
            System.out.println("Jumlah SKS Maksimal yang dapat Anda ambil adalah : " + mhs[i].sksMax);
            in.nextLine();
            String pilihan;
            boolean pilih = true;
            while (pilih == true) {
                System.out.println("============================ MATA KULIAH ============================");
                System.out.println("1.  UNG4008  Pemrograman Dasar                           : 5   SKS");
                System.out.println("2.  IFK15002 Pemrograman Lanjut                          : 5   SKS");
                System.out.println("3.  SIF15103 Sistem Fungsional Bisnis                    : 4   SKS");
                System.out.println("4.  PTI15005 Algoritma                                   : 5   SKS");
                System.out.println("5.  PTI15008 Sistem Operasi                              : 4   SKS");
                System.out.println("6.  SIF15101 Database analisis                           : 5   SKS");
                System.out.println("7.  PTI15004 Matematika Komputasi                        : 4   SKS");
                System.out.print("Masukkan Kode Mata Kuliah (1-7) : ");
                kodeMatkul = in.nextLine();
                System.out.print("Masukkan Nama Mata Kuliah : ");
                namaMatkul = in.nextLine();
                System.out.print("Masukkan SKS Mata Kuliah : ");
                sks = in.nextInt();
                mhs[i].setMatakuliah(matkul, kodeMatkul, sks, namaMatkul);
                in.nextLine();
                System.out.println("Apakah Anda ingin menambah Mata Kuliah? (Y/N)");
                pilihan = in.nextLine();
                System.out.println(" ");
                switch (pilihan) {
                    case "Y":
                        pilih = true;
                        break;
                    case "N":
                        pilih = false;
                        break;
                    default:
                        pilih = false;
                }
            }
            mhs[i].Pendataan();
        }
    }
}
