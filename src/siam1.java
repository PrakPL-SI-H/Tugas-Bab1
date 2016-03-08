package pratikum1;
import java.util.Scanner;
public class siam1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama, NIM, jurusan, kodeMatkul, namaMatkul;
        double IP;
        int sks, matkul = 0;
        dataMhs[] mahasiswa = new dataMhs[5];
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("                SISTEM INFORMASI AKADEMIK MAHASISWA     ");
            System.out.println("=======================================================================");
            System.out.print("Masukkan Nama    : ");
            nama = in.nextLine();
            System.out.print("Masukkan NIM     : ");
            NIM = in.nextLine();
            System.out.print("Masukkan Jurusan : ");
            jurusan = in.nextLine();
            System.out.print("Masukkan IP      : ");
            IP = in.nextDouble();
            mahasiswa[i] = new dataMhs(NIM, nama, jurusan, IP);
            System.out.println("Jumlah SKS yang dapat Anda ambil adalah : " + mahasiswa[i].sksmax);
            in.nextLine();
            String pilihan;
            boolean pilih = true;
            while (pilih == true) {
                System.out.println("=============================== MATA KULIAH ==========================");
                System.out.println("1.  PTI15002 Pengantar Teknologi Informasi dan Ilmu Komputer : 3   SKS");
                System.out.println("2.  PTI15004 Matematika Komputasi                            : 4   SKS");
                System.out.println("3.  PTI15001 Pemrograman Dasar                               : 5   SKS");
                System.out.println("4.  SIF15021 Manajemen Dan Organisasi                        : 3   SKS");
                System.out.println("5.  UNG4008  Bahasa Indonesia                                : 3   SKS");
                System.out.println("6.  IFK15002 Pemrograman Lanjut                              : 5   SKS");
                System.out.println("7.  SIF15103 Sistem Fungsional Bisnis                        : 4   SKS");
                System.out.println("8.  UBU0008  Bahasa Inggris                                  : 3   SKS");
                System.out.println("9.  PTI15005 Interaksi Manusia Dan Komputer                  : 3   SKS");
                System.out.println("10. PTI15008 Sistem Operasi                                  : 4   SKS");
                System.out.print("Masukkan Kode Mata Kuliah (1-10) : ");
                kodeMatkul = in.nextLine();
                System.out.print("Masukkan N"
                        + "ama Mata Kuliah : ");
                namaMatkul = in.nextLine();
                System.out.print("Masukkan SKS Mata Kuliah : ");
                sks = in.nextInt();
                mahasiswa[i].buatmatkul(matkul, kodeMatkul, sks, namaMatkul);
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
            mahasiswa[i].displayMessage();
        }
    }
}