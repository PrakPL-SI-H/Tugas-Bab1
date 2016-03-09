package classdanobject.PraktikumPemLan;

import java.util.Scanner;

public class MainMahasiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();
        int a = 0;

        System.out.println("=============SISTEM INFORMASI AKADEMIK MAHASISWA=============");
        do{
            System.out.println();
            System.out.println("Menu");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Input Mata Kuliah");
            System.out.println("3. Cetak");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan : ");
            int pil = input.nextInt();
            
            switch(pil){
                case 1 : input.nextLine();
                        System.out.print("Masukkan Nama Mahasiswa : ");mhs.setNama(input.nextLine());
                         System.out.print("Masukkan NIM Mahasiswa : ");mhs.setNim(input.nextLine());
                         System.out.print("Masukkan Jurusan Mahasiswa : ");mhs.setJurusan(input.nextLine());
                         System.out.print("Masukkan IPK Mahasiswa : ");mhs.setIpk(input.nextDouble());
                         break;
                case 2 : mhs.maksIpk();
                    System.out.print("Masukkan jumlah matkul yang akan diikuti : ");
                    mhs.panjang = input.nextInt();
                    mhs.kode = new String [mhs.panjang];
                    mhs.namamatkul = new String [mhs.panjang];
                    mhs.sks = new int [mhs.panjang];
                    for (int i = 0; i < mhs.panjang; i++) {
                        input.nextLine();
                        System.out.print("Masukkan Kode Matkul : ");mhs.setKode(i, input.nextLine());
                        System.out.print("Masukkan Nama Matkul : ");mhs.setNamaMatkul(i, input.nextLine());
                        System.out.print("Masukkan SKS Matkul : ");mhs.setSks(i, input.nextInt());
                    }
                    break;
                case 3 : mhs.printMahasiswa();
                         mhs.printMatkul();break;
                case 4 : System.exit(0);break;
            }
        }while(a!=1);
        
    }

}

class Mahasiswa {

    public String nama;
    public String nim;
    public String jurusan;
    public double ipk;
    public String namamatkul[], kode[];
    public int sks[], banyak, panjang;

    public void setNama(String a) {
        nama = a;
    }

    public void setNim(String a) {
        nim = a;
    }

    public void setJurusan(String a) {
        jurusan = a;
    }
    
    public void setIpk(double a) {
        ipk = a;
    }
    
    public void setNamaMatkul(int idx, String a){
        namamatkul[idx] = a;
    }
    
    public void setKode(int idx, String a){
        kode[idx] = a;
    }
    
    public void setSks(int idx, int a){
        sks[idx] = a;
    }
    
    public void maksIpk(){
        if(ipk >= 3.0){
            banyak = 24;
        }else if(ipk >= 2.5){
            banyak = 21;
        }else if(ipk >= 2.0){
            banyak = 18;
        }else if(ipk >= 1.5){
            banyak = 15;
        }
        System.out.println("Jumlah maksimal sks yang dapat ditempuh : "+banyak);
    }
    
    public void printMahasiswa(){
        System.out.println("Data Identitas Mahasiswa");
        System.out.println("Nama Mahasiswa      : "+nama);
        System.out.println("NIM Mahasiswa       : "+nim);
        System.out.println("Jurusan Mahasiswa   : "+jurusan);
        System.out.println("IPK Mahasiswa       : "+ipk);
        
    }
    
    public void printMatkul(){
        System.out.println("Daftar Mata Kuliah");
        for (int i = 0; i < panjang; i++) {
            System.out.println("Kode Mata Kuliah  : "+kode[i]);
            System.out.println("Nama Mata Kuliah  : "+namamatkul[i]);
            System.out.println("Beban Mata Kuliah : "+sks[i]);
        }
    }
    
    
}
