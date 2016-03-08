package Praktikum;

import java.util.Scanner;

public class panggilSiam {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        Siam data = new Siam();

        System.out.println("====PROGRAM SIAM====");
        System.out.print("input banyak mahasiswa  : ");
        data.n = in.nextInt();
        data.setData();
        for (int i = 0; i < data.n; i++) {
            System.out.println("ISI DATA");
            System.out.print("1. Nama       : ");
  data.nama[i] = in.next();
            System.out.print("2. Nim        : ");
            data.nim[i] = in.next();
            System.out.print("3. Ip         : ");
            data.ip[i] = in.nextDouble();
            System.out.print("4. Jurusan    : ");
            data.jurusan[i] = in.next();
            System.out.print("5. Kode MK    : ");
            data.kode[i] = in.next();
            System.out.print("6. Nama MK    : ");
            data.namamatkul[i] = in.next();
            do {
                System.out.print("7. Jumlah sks : ");
                data.sks[i] = in.nextInt();
                if (data.ip[i] < 3.0 && data.sks[i] > 3) {
                    System.out.println("sks yang diinput tidak sesuai");
                }
            } while (data.ip[i] < 3.0 && data.sks[i] > 3);
            System.out.println("");
        }
        data.tampilkanData();        
    }
    
}
