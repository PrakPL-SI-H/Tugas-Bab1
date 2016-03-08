
package mainsiam;
import java.util.Scanner;

public class Siam {

    private String nama, NIM, jurusan;
    private double IP;
    private int SKS, no = 0, SKSdiambil;

    Scanner input = new Scanner(System.in);

    MataKuliah[] matKul = new MataKuliah [7];

    /* Konstruktor Method */
    public Siam(String nama, String NIM, String jurusan) {
        this.nama = nama;
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

    /* Overloading Konstruktor Method */
    public void Siam(String nama, String NIM, String jurusan, double IP) {
        this.nama = nama;
        this.NIM = NIM;
        this.jurusan = jurusan;
        this.IP = IP;
        setJumlahSKS();
    }

    /* Method Untuk Seleksi Jumlah SKS Berdasarkan IP */
    public void setJumlahSKS() {
        if(IP >= 3.0){
            SKS = 24;
        }else if(2.5 <= IP && IP < 3.0){
            SKS = 21;
        }else if(2.0 <= IP && IP < 2.5){
            SKS = 18;
        }else if(1.5 <= IP && IP < 2.0){
            SKS = 15;
        }else {
            SKS = 12;
        }
    }

    /* Method Untuk Menambahkan Mata Kuliah */
    public void tambahMatKul(){
        int pilih;
        do {
            System.out.println("----------------------------------------------------------");
            System.out.println("| No   Kode      SKS                 Nama                |");
            System.out.println("| 1.  UNG40008    3       Bahasa Indonesia               |");
            System.out.println("| 2.  IFK15002    5       Pemrograman Lanjut             |");
            System.out.println("| 3.  PTI15005    3       Interaksi Manusia & Komputer   |");
            System.out.println("| 4.  SIF15103    4       Sistem Fungsional Bisnis       |");
            System.out.println("| 5.  SIF15102    3       Desain Web                     |");
            System.out.println("| 6.  PTI15003    5       Algoritma Struktur Data        |");
            System.out.println("| 7.  PTI15008    4       Sistem Operasi                 |");
            System.out.println("----------------------------------------------------------");
            System.out.println("| 0.  Keluar                                             |");
            System.out.println("Sisa SKS yang dapat diambil adalah "+SKS+" SKS");
            System.out.print("Masukkan pilihan anda: ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    if (SKS >= 3) {
                        no++;
                        matKul[no] = new MataKuliah("UNG40008", "Bahasa Indonesia", 3);
                        SKS -= 3;
                        SKSdiambil += 3;
                        notifSKS(1);
                    } else {
                        notifSKS(0);
                    }
                break;
                case 2:
                    if (SKS >= 5) {
                        no++;
                        matKul[no] = new MataKuliah("IFK15002", "Pemrograman Lanjut", 5);
                        SKS -= 5;
                        SKSdiambil += 5;
                        notifSKS(1);
                    } else {
                        notifSKS(0);
                    }
                break;
                case 3:
                    if (SKS >= 3) {
                        no++;
                        matKul[no] = new MataKuliah("PTI15005", "Interaksi Manusia & Komputer", 3);
                        SKS -= 3;
                        SKSdiambil += 3;
                        notifSKS(1);
                    } else {
                        notifSKS(0);
                    }
                break;
                case 4:
                    if (SKS >= 4) {
                        no++;
                        matKul[no] = new MataKuliah("SIF15103", "Sistem Fungsional Bisnis", 4);
                        SKS -= 4;
                        SKSdiambil += 4;
                        notifSKS(1);
                    } else {
                        notifSKS(0);
                    }
                break;
                case 5:
                    if (SKS >= 3) {
                        no++;
                        matKul[no] = new MataKuliah("SIF15102", "Desain Web", 3);
                        SKS -= 3;
                        SKSdiambil += 3;
                        notifSKS(1);
                    } else {
                        notifSKS(0);
                    }
                break;
                case 6:
                    if (SKS >= 5) {
                        no++;
                        matKul[no] = new MataKuliah("PTI15003", "Algoritma Struktur Data", 5);
                        SKS -= 5;
                        SKSdiambil += 5;
                        notifSKS(1);
                    } else {
                        notifSKS(0);
                    }
                break;
                case 7:
                    if (SKS >= 4) {
                        no++;
                        matKul[no] = new MataKuliah("PTI15008", "Sistem Operasi", 4);
                        SKS -= 4;
                        SKSdiambil += 4;
                        notifSKS(1);
                    } else {
                        notifSKS(0);
                    }
                break;
                case 0: break;
                default: System.out.println("Pilihan Salah! Pastikan memilih yang ada di menu");
            }
        } while (pilih != 0);
    }

    /* Method Untuk Notifikasi Jumlah SKS */
    public void notifSKS(int i) {
        if (i == 1){
            System.out.println("Pengambilan mata kuliah berhasil...");
        }else {
            System.out.println("Jumlah SKS anda tidak mencukupi untuk mengambil mata kuliah ini");
        }
    }

    /* Method Untuk Menampilkan Output */
    public void output() {
        System.out.println("\n\t\t  KEMENTERIAN PENDIDIKAN DAN KEBUDAYAAN\n\t\t\tUNIVERSITAS BRAWIJAYA MALANG\n\t\tFAKULTAS PROG.T.INFORMASI & ILMU KOMPUTER");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("SISTEM INFORMASI AKADEMIK UB\n\n\t\t\t   KARTU RENCANA STUDI\n");
        System.out.println("No Induk      : "+NIM);
        System.out.println("Nama          : "+nama);
        System.out.println("Program Studi : "+jurusan);
        System.out.println("----------------------------------------------------------------------");
        System.out.println(" NO\tKODE\t\t\tNAMA MATA KULIAH\t\tSKS");
        System.out.println("----------------------------------------------------------------------");
        for (int i = 0; i < no; i++) {
            System.out.print(" "+(i+1)+"    ");
            matKul[i+1].cetakMataKuliah();
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t      Jumlah :  "+SKSdiambil);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Catatan Akademik Semester Lalu :");
        System.out.println("IP Lulus      = "+IP);
    }
}

    

