package ppl;
import java.util.Scanner;
public class PPL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama, nim, jurusan;
        double ip;
        siam[] mahasiswa = new siam[3];
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("                SISTEM INFORMASI AKADEMIK MAHASISWA     ");
            System.out.println("=======================================================================");
            System.out.print("Masukkan Nama    : ");
            nama = in.nextLine();
            System.out.print("Masukkan NIM     : ");
            nim = in.nextLine();
            System.out.print("Masukkan Jurusan : ");
            jurusan = in.nextLine();
            System.out.print("Masukkan IP      : ");
            ip = in.nextDouble();
            mahasiswa[i] = new siam(nim, nama, jurusan, ip);
            System.out.println("Jumlah SKS yang dapat Anda ambil adalah : " + mahasiswa[i].sksmax);
            in.nextLine();
            System.out.println("Daftar Mata Kuliah");
            System.out.println("1.  PTI15002 Bahasa Indonesia                    : 3   SKS");
            System.out.println("2.  PTI15004 Matematika Komputasi                : 4   SKS");
            System.out.println("3.  PTI15001 Pemrograman Dasar                   : 5   SKS");
            System.out.println("4.  KOM15002 Pemrograman Lanjut                  : 5   SKS");
            System.out.println("5.  UNG4008  Bahasa Inggris                      : 3   SKS");
            mahasiswa[i].displayMessage();
        }
    }
}
