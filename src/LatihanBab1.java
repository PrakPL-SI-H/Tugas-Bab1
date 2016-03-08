package prakPL;

import java.util.Scanner;

public class tugas1 {

    String nama, jurusan, matkul, NIM;
    int sks, kode;
    double IP;

    public void setNama(String a) {
        nama = a;
    }

    public void setNIM(String b) {
        NIM = b;
    }

    public void setJurusan(String c) {
        jurusan = c;
    }

    public void setMatkul(String e, int f) {
        matkul = e;
        kode = f;
    }

public void setNilai(double g, int h) {
        IP = g;
        sks = h;
        if (g >= 3 && h >= 22) {
            System.out.println("Data Tersimpan");
        } else if (g >= 2.5 && h <= 19) {
            System.out.println("Data Tersimpan");
        } else if (g >= 2 && h <= 16) {
            System.out.println("Data Tersimpan");
        } else if (g >= 1.5 && h <= 12) {
            System.out.println("Data Tersimpan");
        } else if (g < 1.5 && h < 12) {
            System.out.println("Data Tersimpan");
        } else {
            System.out.println("Data yang anda input tidak valid");
        }
    }

}

class mainTugas1 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

 //objek 1
        tugas1 mhs = new tugas1();

        System.out.println("========== SIAM ==========");
        System.out.print("Nama Mahasiswa    : ");
        mhs.nama = inp.next();
        System.out.print("NIM               : ");
        mhs.NIM = inp.next();
        System.out.print("Jurusan           : ");
        mhs.jurusan = inp.next();
        mhs.setNama(mhs.nama);
        mhs.setNIM(mhs.NIM);
        mhs.setJurusan(mhs.jurusan);

        System.out.println("==========================");
        for (int i = 1; i < 3; i++) {
            System.out.print("Mata Kuliah   : ");
            mhs.matkul = inp.next();
            System.out.print("Kode          : ");
            mhs.kode = inp.nextInt();
            mhs.setMatkul(mhs.matkul, mhs.kode);
        }

        System.out.print("Masukkan IP            : ");
        mhs.IP = inp.nextDouble();
        System.out.print("Masukkan SKS           : ");
        mhs.sks = inp.nextInt();
        mhs.setNilai(mhs.IP, mhs.sks);

        //objek 2
        tugas1 mhs1 = new tugas1();

        System.out.println("========== SIAM ==========");
        System.out.print("Nama Mahasiswa    : ");
        mhs1.nama = inp.next();
        System.out.print("NIM               : ");
        mhs1.NIM = inp.next();
        System.out.print("Jurusan           : ");
        mhs1.jurusan = inp.next();
        mhs1.setNama(mhs1.nama);
        mhs1.setNIM(mhs1.NIM);
        mhs1.setJurusan(mhs1.jurusan);

        System.out.println("==========================");
        for (int i = 1; i < 3; i++) {
            System.out.print("Mata Kuliah   : ");
            mhs1.matkul = inp.next();
            System.out.print("Kode          : ");
            mhs1.kode = inp.nextInt();
            mhs1.setMatkul(mhs1.matkul, mhs1.kode);
        }

        System.out.print("Masukkan IP            : ");
        mhs1.IP = inp.nextDouble();
        System.out.print("Masukkan SKS           : ");
        mhs1.sks = inp.nextInt();
        mhs1.setNilai(mhs1.IP, mhs1.sks);

        //objek 3
        tugas1 mhs2 = new tugas1();

        System.out.println("========== SIAM ==========");
        System.out.print("Nama Mahasiswa    : ");
        mhs2.nama = inp.next();
        System.out.print("NIM               : ");
        mhs2.NIM = inp.next();
        System.out.print("Jurusan           : ");
        mhs2.jurusan = inp.next();
        mhs2.setNama(mhs2.nama);
        mhs2.setNIM(mhs2.NIM);
        mhs2.setJurusan(mhs2.jurusan);

        System.out.println("==========================");
        for (int i = 1; i < 3; i++) {
            System.out.print("Mata Kuliah   : ");
            mhs2.matkul = inp.next();
            System.out.print("Kode          : ");
            mhs2.kode = inp.nextInt();
            mhs2.setMatkul(mhs2.matkul, mhs2.kode);
        }

        System.out.print("Masukkan IP            : ");
        mhs2.IP = inp.nextDouble();
        System.out.print("Masukkan SKS           : ");
        mhs2.sks = inp.nextInt();
        mhs2.setNilai(mhs2.IP, mhs2.sks);

    }
}

