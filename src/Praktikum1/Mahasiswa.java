package Praktikum1;

public class Mahasiswa {

    String nama;
    String nim;
    String jurusan;
    String kode;
    String matkul;
    double ipk;
    int sks;

    public void printData() {
        System.out.println("Nama            = " + nama);
        System.out.println("Nim             = " + nim);
        System.out.println("jurusan         = " + jurusan);
        System.out.println("ipk             = " + ipk);
        System.out.println("sks             = " + sks);
        System.out.println("kode matkul     = " + kode);
        System.out.println("matkul          = " + matkul);
    }
}