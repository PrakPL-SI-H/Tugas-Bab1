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