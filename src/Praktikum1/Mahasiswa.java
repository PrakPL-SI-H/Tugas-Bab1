package Praktikum1;

public class Mahasiswa {

    String nama;
    String nim;
    String jurusan;
    String kode;
    String matkul;
    double ipk;
    int sks;

    public void setSks(int sks){
        this.sks = sks;
        if (ipk >= 3 && sks > 5){
            System.out.println("SKS maks 5");
            this.sks = 5;
        }else if (ipk >= 2 && sks > 4){
            System.out.println("SKS maks 4");
            this.sks = 4;
        }else if (ipk >= 1 && sks > 3){
            System.out.println("SKS maks 3");
            this.sks = 3;
        }else if (ipk >= 0 && sks > 2){
            System.out.println("SKS maks 2");
            this.sks = 2;
        }   
    }
    
    public void printData(){
        System.out.println("Nama            = " + nama);
        System.out.println("Nim             = " + nim);
        System.out.println("jurusan         = " + jurusan);
        System.out.println("ipk             = " + ipk);
        System.out.println("sks             = " + sks);
        System.out.println("kode matkul     = " + kode);
        System.out.println("matkul          = " + matkul);
    }
}