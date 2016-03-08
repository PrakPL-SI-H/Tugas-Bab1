package siam;

/*Author Istighfarin Bahtiar Amry
Nim     =155150401111129
Kelas   =SI-H
 */
import java.util.Scanner;

class Mahasiswa {

    public String nama, nim, jurusan, namkul;
    public int kode, sks, ipk;

    public void nama(String x) {
        this.nama = x;
    }

    public void nim(String x) {
        this.nim = x;
    }

    public void jurusan(String x) {
        this.jurusan = x;
    }

    public void namkul(String x) {
        this.namkul = x;
    }

    public void ipk(int x) {
        ipk = x;
        if (ipk >= 3 && ipk <= 4) {
            System.out.println("Anda Dapat Memilih Segala Mata Kuliah ");
            System.out.println("Dengan SKS Sebesar 24");
        } else if (ipk > 2 && ipk <= 3) {
            System.out.println("Anda Dapat memilih Program Studi : ");
            System.out.println("1.Matematika");
            System.out.println("2.Bahasa Indonesia");
            System.out.println("Dengan SKS sebesar ");

        }
    }

    public void kode(int x) {
        kode = x;
        if (kode == 1) {
            System.out.println("Jurusan :\n"
                    + "1.Sistem Informasi");
        } else if (kode == 2) {
            System.out.println("Jurusan :\n"
                    + "    2.TI");
        } else if (kode == 3) {
            System.out.println("Jurusan :\n"
                    + "    3.Pemrograman Dasar");
        }
    }

    public void sks(int x) {
        sks = x;
        if (sks == 24) {
            System.out.println("Anda Harus Memiliki IPK 3.5 - 4.0");
        } else if (sks >= 20) {
            System.out.println("Anda Harus Memiliki IPK 2.5 - 3.0");
        } else if (sks >= 15) {
            System.out.println("Anda Harus Memiliki IPK 2.0 - 2.4");
        } else {
            System.out.println("Jika IPK ANDA SANGAT KURANG");
        }
    }

    public void Tampil() {
        System.out.println("Nama : " + nama);
        System.out.println("Nim  : " + nim);
        System.out.println("Prodi: " + jurusan);
    }
}

public class SIAM {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();

        System.out.println("||SELAMAT DATANG DI SISTEM AKADEMIK PTIIK||");
        System.out.println("||=======================================||");
        System.out.println("        LIST SKS DENGAN SYARAT IPK : ");
        System.out.println("         IPK                SKS\n"
                + "    >=3.00	        22 - 24 sks\n"
                + "     2.50 - 2.99	19 - 21 sks\n"
                + "     2.00 - 2.49	16 - 18 sks\n"
                + "     1.50 - 1.99	12 - 15 sks\n"
                + "     <1.50	        < 12    sks");
        System.out.print("Masukkan Nama Mahasiswa 1       : ");
        mhs1.nama = in.nextLine();
        System.out.print("Masukkan Nim Mahasiswa  1       : ");
        mhs1.nim = in.nextLine();
        System.out.print("Masukkan Jurusan Mahasiswa 1    : ");
        mhs1.jurusan = in.nextLine();
        System.out.print("Masukkan Kode Jurusan           : ");
        int xk = in.nextInt();
        System.out.print("Masukkan IPK mahasiswa 1        : ");
        int xi = in.nextInt();
        System.out.print("Masukkan SKS mahasiswa 1 ingin  :");
        int x = in.nextInt();
        mhs1.Tampil();
        mhs1.kode(xk);
        mhs1.ipk(xi);
        mhs1.sks(x);

        System.out.println();

        System.out.print("Masukkan Nama Mahasiswa 2       : ");
        mhs2.nama = in.next();
        
        String c=in.nextLine();
        System.out.print("Masukkan Nim Mahasiswa  2       : ");
        mhs2.nim = in.next();
        System.out.println("Masukkan Jurusan Mahasiswa 2    : ");
        mhs2.jurusan = in.next();
        System.out.print("Masukkan Kode Jurusan           : ");
        int yk = in.nextInt();
        System.out.print("Masukkan IPK mahasiswa 2        : ");
        int yo = in.nextInt();
        System.out.print("Masukkan SKS mahasiswa 2 ingin  :");
        int y = in.nextInt();
        mhs2.Tampil();
        mhs2.kode(yk);
        mhs2.ipk(yo);
        mhs2.sks(y);

        System.out.print("Masukkan Nama Mahasiswa 3       : ");
        mhs3.nama = in.next();
        String vv=in.nextLine();
        System.out.print("Masukkan Nim Mahasiswa  3       : ");
        mhs3.nim = in.next();
        System.out.print("Masukkan Jurusan Mahasiswa 3    : ");
        mhs3.jurusan = in.next();
        System.out.print("Masukkan Kode Jurusan           : ");
        int zk = in.nextInt();
        System.out.print("Masukkan IPK mahasiswa 3        : ");
        int xo = in.nextInt();
        System.out.print("Masukkan SKS mahasiswa 3 ingin  :");
        int z = in.nextInt();
        mhs3.Tampil();
        mhs3.kode(zk);
        mhs3.ipk(xo);
        mhs3.sks(z);
    }

}
