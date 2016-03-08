package Mod1Bab1;
import java.util.Scanner;
class Mahasiswa {
    String nama;
    String nim;
    double ip;
    int sks;
    String jurusan;
    public void setNama(String s) {
        nama = s;
    }
    public void setNim(String s) {
        nim = s;
    }
    public void setIpk(double i) {
        if (ip >= 0.0 && ip <= 4.0) {
            ip = i;
        } else {
            System.out.println("Data tidak valid");
        }
    }
    public void setJurusan(String s) {
        jurusan = s;
    }
    public void setSks (int s){
        sks =s;
    }
    public void tampilkanData() {
        System.out.println("======Data Mahasiswa======");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("IP : " + ip);
        System.out.println("Jumlah sks : " + sks);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("==========================");
    }
}
    class MataKuliah {
        int jumlahmakul;
        String []kodematkul;
        String []namamatakuliah;
        int []sks;
        public void tampilkanMataKuliah() {
            System.out.printf("%-25s%-30s%-5s\n", "Kode Mata Kuliah", "Nama Mata Kuliah", "Sks");
            for (int i=0 ; i <jumlahmakul ; i++){
              System.out.printf("%-25s%-30s%-5s\n", kodematkul[i], namamatakuliah [i], sks[i]);  
            }
            System.out.println("===============================================================");           
        }
    }
    public class program1 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Mahasiswa data1 = new Mahasiswa();
                System.out.println("Masukkan nama : ");
            data1.nama = in.next();
            System.out.println("Masukkan NIM : ");
            data1.nim = in.next();
            System.out.println("Masukkan IP : ");
            data1.ip = in.nextDouble();
            System.out.println("Masukkan jumlah sks yang diambil : ");
            data1.sks = in.nextInt();
            System.out.println("Jurusan : ");
            data1.jurusan = in.next();
            MataKuliah makul1 = new MataKuliah();
            System.out.print("Masukkan jumlah mata kuliah : ");
            makul1.jumlahmakul = in.nextInt();
            makul1.kodematkul = new String [makul1.jumlahmakul];
            makul1.namamatakuliah = new String [makul1.jumlahmakul];
            makul1.sks = new int [makul1.jumlahmakul];    
            for (int i = 0; i < makul1.jumlahmakul; i++) {
                System.out.print("Kode Mata Kuliah :");
                makul1.kodematkul[i] = in.next();
                System.out.print("Nama Mata Kuliah : ");
                makul1.namamatakuliah[i]=in.next();
                System.out.print("Jumlah sks : ");
                makul1.sks[i] = in.nextInt();
            }
            System.out.println("===========================================");
            Mahasiswa data2 = new Mahasiswa();
            System.out.println("Masukkan nama : ");
            data2.nama = in.next();
            System.out.println("Masukkan NIM : ");
            data2.nim = in.next();
            System.out.println("Masukkan IP : ");
            data2.ip = in.nextDouble();
            System.out.println("Masukkan jumlah sks yang diambil : ");
            data2.sks = in.nextInt();
            System.out.println("Jurusan : ");
            data2.jurusan = in.next();
            MataKuliah makul2 = new MataKuliah();
            System.out.print("Masukkan jumlah mata kuliah : ");
            makul2.jumlahmakul = in.nextInt();
            makul2.kodematkul = new String [makul2.jumlahmakul];
            makul2.namamatakuliah = new String [makul2.jumlahmakul];
            makul2.sks = new int [makul2.jumlahmakul];    
            for (int i = 0; i < makul2.jumlahmakul; i++) {
                System.out.print("Kode Mata Kuliah :");
                makul2.kodematkul[i] = in.next();
                System.out.print("Nama Mata Kuliah : ");
                makul2.namamatakuliah[i]=in.next();
                System.out.print("Jumlah sks : ");
                makul2.sks[i] = in.nextInt();
            }
            System.out.println("===========================================");
            Mahasiswa data3 = new Mahasiswa();
            System.out.println("Masukkan nama : ");
            data3.nama = in.next();
            System.out.println("Masukkan NIM : ");
            data3.nim = in.next();
            System.out.println("Masukkan IP : ");
            data3.ip = in.nextDouble();
            System.out.println("Masukkan jumlah sks yang diambil : ");
            data3.sks = in.nextInt();
            System.out.println("Jurusan : ");
            data3.jurusan = in.next();
            MataKuliah makul3 = new MataKuliah();
            System.out.print("Masukkan jumlah mata kuliah : ");
            makul3.jumlahmakul = in.nextInt();
            makul3.kodematkul = new String [makul3.jumlahmakul];
            makul3.namamatakuliah = new String [makul3.jumlahmakul];
            makul3.sks = new int [makul3.jumlahmakul];    
            for (int i = 0; i < makul3.jumlahmakul; i++) {
                System.out.print("Kode Mata Kuliah :");
                makul3.kodematkul[i] = in.next();
                System.out.print("Nama Mata Kuliah : ");
                makul3.namamatakuliah[i]=in.next();
                System.out.print("Jumlah sks : ");
                makul3.sks[i] = in.nextInt();
            }
            System.out.println("===========================================");
            data1.tampilkanData();
            makul1.tampilkanMataKuliah();
            data2.tampilkanData();
            makul2.tampilkanMataKuliah();
            data3.tampilkanData();
            makul3.tampilkanMataKuliah();
        }
    }