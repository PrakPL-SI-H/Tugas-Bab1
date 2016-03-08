package MuhAsdar;

import java.util.Scanner;

public class Siam {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DataMahasiswa mhs = new DataMahasiswa();

        System.out.println("SISTEM INFORMASI AKADEMIK MAHASISWA SISTEM INFORMASI");
        System.out.print("Username (NIM) = ");
        mhs.username = in.next();
        System.out.print("Password       = "); 
        String pass = in.next(); //nim

        for (int i = 0; i < mhs.mhs.length; i++) {
            if ((mhs.username.equals(mhs.mhs[i][1]) && pass.equals(mhs.mhs[i][1]))) {
                System.out.println("=======================================");
                mhs.showData();
            }
        }

        int pilihan;
        String batas = ("----------------------------------------------------");
        do {
            System.out.printf("%.40s\n", batas);
            System.out.println("1. Pilih Mata Kuliah");
            System.out.println("2. Keluar");
            System.out.print("Masukkan Pilihan Anda : ");
            pilihan = in.nextInt();
            System.out.printf("%.40s\n", batas);
            switch (pilihan) {
                case 1:
                    System.out.println("\tPilih Mata Kuliah");
                    System.out.print("Jurusan = ");
                    in.nextLine();
                    String jurusan = in.nextLine();
                    System.out.print("IP      = ");
                    mhs.krsmhs.ip = in.nextFloat();
                    mhs.krsmhs.setSks();
                    in.nextLine();
                    System.out.printf("%.40s\n", batas);
                    mhs.krsmhs.daftarMatkul();
                    System.out.printf("%.40s\n", batas);
                    int a = 1;
                    while (mhs.krsmhs.sksambil <= mhs.krsmhs.bebansks[1] || a <= 5) {
                        System.out.print("Masukan Kode Mata Kuliah " + a + " = ");
                        String kode = in.nextLine();
                        for (int i = 0; i < 5; i++) {
                            if (mhs.krsmhs.matkul[i][0].equalsIgnoreCase(kode)) {
                                mhs.krsmhs.pilihMatkul(kode, (a - 1));
                                mhs.krsmhs.sksambil += mhs.krsmhs.sksmatkul[i];
                            }
                        }
                        if (a == 5)
                            break;
                        if (mhs.krsmhs.sksambil >= mhs.krsmhs.bebansks[0]) {
                            System.out.println("Tambah Mata Kuliah? (y/n) ");
                            String pilih = in.next();
                            if (pilih.equalsIgnoreCase("n")) {
                                break;
                            }
                        }
                        a++;
                    }
                    System.out.printf("%.40s\n", batas);
                    mhs.showKrs();
                    break;
                default:
                    if (pilihan == 2) {
                        break;
                    }
                    System.out.println("Maaf, Piliahn Tidak Tersedia");
            }
        } while (pilihan != 2);
        System.out.println("\t     Terima Kasih");
    }

}
