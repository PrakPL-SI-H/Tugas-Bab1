package pemrogramanlanjut;

import java.util.Scanner;

public class Mahasiswa {

    private String Nama, Nim, Jurusan;
    private double Ip;
    private int MklMax, MklMin, TotalSKS = 0, Sks, a = 0, pilihan = 1;
    private String[][] matkul = new String[10][3];

    public Mahasiswa(String Nama, String Nim, String Jurusan, double Ip) {
        this.Nama = Nama;
        this.Nim = Nim;
        this.Jurusan = Jurusan;
        this.Ip = Ip;
    }

    public String getNama() {
        return Nama;
    }

    public String getNim() {
        return Nim;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public double getIp() {
        return Ip;
    }

    public void setTotalSKS() {
        if (Ip >= 3.00 && Ip <= 4.00) {
            MklMax = 24;
            MklMin = 22;
        } else if (Ip >= 2.50) {
            MklMax = 21;
            MklMin = 19;
        } else if (Ip >= 2.00) {
            MklMax = 18;
            MklMin = 16;
        } else if (Ip >= 1.50) {
            MklMax = 15;
            MklMin = 12;
        } else if (Ip < 1.50) {
            MklMax = 11;
            MklMin = 0;
        }
    }

    public void setmatkul() {
        Scanner in = new Scanner(System.in);
        System.out.println("Total Sks yang bisa diambil adalah " + getMkMin() + "-" + getMkMax());
        while (TotalSKS <= MklMax || TotalSKS >= MklMin) {
            System.out.print("Masukkan kode mata kuliah : ");
            matkul[a][0] = in.nextLine();
            System.out.print("Masukkan Nama mata kuliah : ");
            matkul[a][1] = in.nextLine();
            System.out.print("Masukkan Sks mata kuliah  : ");
            matkul[a][2] = in.nextLine();
            Sks = Integer.valueOf(matkul[a][2]);

            TotalSKS += Sks;
            if (TotalSKS > MklMax) {

                System.out.println("Anda memmiliki kelebihan Sks, silahkan " + "ulangi program.");
                System.out.print("Masukkan kode mata kuliah : ");
                matkul[a][0] = in.nextLine();
                System.out.print("Masukkan Nama mata kuliah : ");
                matkul[a][1] = in.nextLine();
                System.out.print("Masukkan Sks mata kuliah  : ");
                matkul[a][2] = in.nextLine();
                Sks = Integer.valueOf(matkul[a][2]);
                break;
            }

            if (TotalSKS == MklMax) {
                break;
            }
            a++;
            if (TotalSKS >= MklMin) {
                System.out.println("Mata kuliah yang anda miliki telah memenuhi " + "mata kuliah miNimal yang bisa diambil,tekan 0 untuk berhenti");
                pilihan = in.nextInt();
                if (pilihan == 0) {
                    break;
                }
            }
            System.out.println("-----------------------------------------");
        }
    }

    public int getMkMax() {
        return MklMax;
    }

    public int getMkMin() {
        return MklMin;
    }

    public void showData() {
        System.out.printf("Nama\t : %s\nNim\t : %s\nJurusan\t : %s\nIP\t : " + "%.2f\n", getNama(), getNim(), getJurusan(), getIp());
        System.out.println("Mata kuliah pilihan anda : ");
        for (int b = 0; b <= a; b++) {
            System.out.printf("%s\t%s\t\t%s\t\n", matkul[b][0], matkul[b][1], matkul[b][2]);
        }
    }
}
