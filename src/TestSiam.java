package Pemlan;

import java.util.Scanner;
import siam.Siam;

public class TestSiam {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("*************************************************************");
        System.out.println("**  Selamat datang di Sistem Informasi Akademik Mahasiswa  **");
        System.out.println("**                Universitas Brawijaya                    **");
        System.out.println("**                Fakultas Ilmu Komputer                   **");
        System.out.println("*************************************************************\n\n");
        System.out.println("*************************************************************");
        Siamub siam1 = new Siam();
        System.out.print("**  Masukkan Nama Anda          : ");
        siam1.nama = in.nextLine();
        System.out.print("**  Masukkan NIM Anda           : ");
        siam1.nim = in.nextLong();
        System.out.print("**  Masukkan Program Studi Anda : ");
        siam1.programStudi = in.next();
        System.out.print("**  Masukkan IP Semester Anda   : ");
        siam1.ip = in.nextFloat();
        System.out.println("*************************************************************");
        siam1.sksDapatDiambil();
        System.out.println("*************************************************************\n\n");
        System.out.println("*************************************************************");
        System.out.println("**  Silahkan Masukkan Mata Kuliah yang anda inginkan :     **");
        siam1.masukkanMataKuliah();
        System.out.println("*************************************************************");
        System.out.println("**                   Kartu Rencana Studi                   **");
        System.out.println("*************************************************************");
        System.out.println("**   Nama          : " + siam1.nama);
        System.out.println("**   NIM           : " + siam1.nim);
        System.out.println("**   Program Studi : " + siam1.programStudi);
        System.out.println("**   IP            : " + siam1.ip);
        System.out.println("**   Mata Kuliah yang telah dipilih : ");
        for (int i = 1; i < siam1.inMataKuliah.batas - 1; i++) {
            System.out.println("**   + " + siam1.inMataKuliah.kodeMatKul[i - 1] + " - " + siam1.inMataKuliah.matKul[i - 1] + " " + siam1.inMataKuliah.jmlhSks[i - 1] + " SKS");
        }
        System.out.println("*************************************************************");

    }
}
