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

        do {
            System.out.println("===MENU SIAM===");
            System.out.println("1. Daftar siam");
            System.out.println("2. Login siam");
            System.out.println("3. Cetak siam");
            System.out.println("0. Exit");
            System.out.print("Masukkan pilihan: ");
            pilih = in.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("+++DAFTAR SIAM+++");
                    System.out.println("Masukkan nama : ");
                    mhs.namamhs[i] = in.next();
                    System.out.println("Masukkan NIM : ");
                    mhs.nimmhs[i] = in.next();
                    System.out.println("Masukkan IP : ");
                    mhs.ip[i] = in.nextDouble();
                    System.out.println("Masukkan jurusan :");
                    mhs.jurusan[i] = in.next();
                    i++;
                    break;

                case 2:
                    System.out.println("Masukkan nama : ");
                    mhs.ceknamamhs = in.next();
                    System.out.println("Masukkan nim : ");
                    mhs.ceknimmhs = in.next();
                    
                    System.out.println("Masukkan kode mata kuliah :");
                    mhs.kodematkul[i] = in.nextInt();
                    System.out.println("Masukkan mata kuliah : ");
                    mhs.namamatkul[i] = in.next();
                    System.out.println("Masukkan jumlah sks : ");
                    mhs.jmlhsks[i] = in.nextInt();
                    break;
                    
                case 3:
                    System.out.println("Masukkan nama : ");
                    mhs.ceknamamhs2 = in.next();
                    System.out.println("Masukkan nim : ");
                    mhs.ceknimmhs2 = in.next();
                    
                    mhs.cetakSiam();
            }
        } while (pilih != 0);

    }

}
