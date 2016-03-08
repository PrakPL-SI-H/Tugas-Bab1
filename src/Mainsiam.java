package mainsiam;
import java.util.Scanner;

public class Mainsiam {


    /* Method Utama */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jml = input.nextInt();
        for (int i = 1; i <= jml; i++) {
            System.out.println("\n||||||||||||||||||||||| Mahasiswa "+i+" ||||||||||||||||||||");
            inputMhs();
        }
    }

    /* Method Untuk Input*/
    public static void inputMhs() {
        int pilihan;
        // Menciptakan Scanner
        Scanner input = new Scanner (System.in);

        // Menciptakan objek ac
        Siam ac = new Siam (null, null, null);

        System.out.print("Masukkan Nama             : ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM              : ");
        String nim = input.nextLine();
        System.out.print("Masukkan Jurusan          : ");
        String jurusan = input.nextLine();
        System.out.print("Masukkan IP Semester Lalu : ");
        double ip = input.nextDouble();
        ac.Siam(nama, nim, jurusan, ip);
        do {
            System.out.println("##################################################");
            System.out.println("# 1. Tambah Mata Kuliah\t\t\t\t #\n# 0. Cetak KRS\t\t\t\t\t #");
            System.out.println("##################################################");
            System.out.print("Masukkan Pilihan anda : ");
            pilihan = input.nextInt();
            switch (pilihan){
                case 1: 
                    ac.tambahMatKul();
                    break;
                case 0: break;
                default : System.out.println("Pilihan Salah! Pastikan memilih yang ada di menu.");
            }
        } while (pilihan != 0);
        ac.output();
    }

}

    

