package siam;

/*Author Istighfarin Bahtiar Amry
Nim     =155150401111129
Kelas   =SI-H
 */
import java.util.Scanner;

class Mahasiswa {

    public String nama, nim, jurusan, namkul;
    public int kode,sks;
    public Double ipk;
    
    
    public void nama(String x){
        this.nama=x;
    }
    public void nim(String x){
        this.nim=x;
    }

}

public class SIAM {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();

        System.out.println("||SELAMAT DATANG DI SISTEM AKADEMIK PTIIK||");
        System.out.println("||=======================================||");
        System.out.println("        LIST SKS DENGAN SYARAT IPK : ");
        System.out.println("         IPK                SKS\n"
                +"    >=3.00	        22 - 24 sks\n"
                + "     2.50 - 2.99	19 - 21 sks\n"
                + "     2.00 - 2.49	16 - 18 sks\n"
                + "     1.50 - 1.99	12 - 15 sks\n"
                + "     <1.50	        < 12    sks");
    }

}
