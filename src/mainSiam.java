//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H
package mainsiam;

import java.util.Scanner;

public class mainSiam {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Siam mhs = new Siam();
        int i = 0, pilih;
        String ceknamamhs, ceknimmhs;

        do {
            System.out.println("===MENU SIAM===");
            System.out.println("1. Daftar siam");
            System.out.println("2. Login siam");
            System.out.println("3. Cetak siam");
            System.out.println("0. Exit");
            System.out.print("Masukkan pilihan: ");
            pilih = in.nextInt();
            System.out.println("");

            switch (pilih) {
                case 1:
                    System.out.println("+++DAFTAR SIAM+++");
                    System.out.print("Masukkan nama : ");
                    mhs.namamhs[i] = in.next();
                    System.out.print("Masukkan NIM : ");
                    mhs.nimmhs[i] = in.next();
                    System.out.print("Masukkan IP : ");
                    mhs.ip[i] = in.nextDouble();
                    System.out.print("Masukkan jurusan :");
                    mhs.jurusan[i] = in.next();
                    System.out.println("");
                    i++;
                    break;

                case 2:
                    System.out.print("Masukkan nama : ");
                    ceknamamhs = in.next();
                    System.out.print("Masukkan nim : ");
                    ceknimmhs = in.next();
                    for (int a = 0; a < 99; a++) {
                        if (ceknamamhs.equals(mhs.namamhs[a]) && ceknimmhs.equals(mhs.nimmhs[a])) {
                            System.out.println("");
                            System.out.println("Selamat datang " + mhs.namamhs[a]);
                            if (mhs.ip[a] > 2.5) {
                                System.out.print("Masukkan kode mata kuliah :");
                                mhs.kodematkul[a] = in.nextInt();
                                System.out.print("Masukkan mata kuliah : ");
                                mhs.namamatkul[a] = in.next();
                                System.out.print("Masukkan jumlah sks : ");
                                mhs.jmlhsks[a] = in.nextInt();
                                System.out.println("");
                            } else {
                                System.out.println("Maaf, anda harus memperbaiki "
                                        + "nilai terlebih dahulu");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.print("Masukkan nama : ");
                    ceknamamhs = in.next();
                    System.out.print("Masukkan nim : ");
                    ceknimmhs = in.next();
                    for (int a = 0; a < 99; a++) {
                        if (ceknamamhs.equals(mhs.namamhs[a]) && ceknimmhs.equals(mhs.nimmhs[a])) {
                            mhs.cetakSiam(a);
                        }
                    }
                    break;
            }
        } while (pilih != 0);
    }
}