import java.util.Scanner;
public class SiamMain {
    public static void main(String[] args) {
        String nama, jurusan, nim, kodematkul;
        int sks;
        double ip;
        int maxsks=0;
        int totalsks = 0;
        
        SiamMahasiswa x[] = new SiamMahasiswa[3];
        Scanner in = new Scanner (System.in);
        Scanner in2 = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Sistem Informasi Akademik Mahasiswa");
        System.out.println("Universitas Brawijaya");
        System.out.println("Fakultas Ilmu Komputer");
        System.out.println("");
        
        for (int b = 0; b < 3; b++) {
        maxsks=0; totalsks=0;
        
        System.out.println("\nMahasiswa "+(b+1)); 
        System.out.print("Masukkan Nama     : ");
        nama = in.nextLine();
        System.out.print("Masukkan NIM      : ");
        nim = in.nextLine();
        System.out.print("Masukkan Jurusan  : ");
        jurusan = in.nextLine();
        System.out.print("Masukkan IP       : ");
        ip = in2.nextDouble();
        
        x[b] = new SiamMahasiswa();      
        x[b].setNama(nama);
        x[b].setNim(nim);
        x[b].setJurusan(jurusan);
        x[b].setip(ip);
        
            System.out.println("");
        if(x[b].getIP()>=3){
            maxsks = 24;
        }else if(x[b].getIP()>=2){
            maxsks = 21;
        }else 
        
         if(x[b].getIP()>=1){
            maxsks = 18;
        }else if(x[b].getIP()>1){
            maxsks = 15;
        }
        
        System.out.println(" ----------------------------------------------------");
        System.out.println(" |              DAFTAR MATA KULIAH                  |");   
        System.out.println(" ----------------------------------------------------");
        System.out.println(" | UB001. | Pemrograman Lanjut                      |");                  
        System.out.println(" | UB002. | Bahasa Inggris                          |");
        System.out.println(" | UB003. | Bahasa Indonesia                        |");
        System.out.println(" | UB004. | Sistem Digital                          |");
        System.out.println(" | UB005. | Probabilitas dan Statistika             |");
        System.out.println(" | UB006. | Matematika Komputasi Lanjut             |");
        System.out.println(" | UB007. | Algoritma danStruktur Data              |");
        System.out.println(" | UB008. | Arsitektur dan Organisasi Komputer      |");
        System.out.println(" | UB009. | Interaksi Manusia dan Komputer          |");
        System.out.println(" | UB0010.| Sistem Basis Data                       |");
        System.out.println(" ----------------------------------------------------");
        
        for (int d = 0; d < 10; d++) {
           
        System.out.println("Masukkan kode mata kuliah: ");
        kodematkul = in.nextLine();
        
        SiamMatkul y = new SiamMatkul(kodematkul);
        if(y.sks+totalsks > maxsks){
            System.out.println("\nProses tambah mata kuliah gagal! Jumlah SKS yang anda ambil melebihi batas\n");
            break;
        }else if(y.sks+totalsks <= maxsks){
            x[b].setMatkul(kodematkul);
            totalsks += y.sks;
        }       
              }
        System.out.println("----------------------------------");
        System.out.println("          Data Mahasiswa");
        System.out.println("----------------------------------");
        System.out.println("Nama    : "+x[b].getNama());
        System.out.println("Nim     : "+x[b].getNim());
        System.out.println("Jurusan : "+x[b].getJurusan());
        System.out.println("IP      : "+x[b].getIP());
        System.out.println("----------------------------------\n");
        System.out.println("Daftar mata kuliah yang Anda ambil\n");
        x[b].getMatkul();
    }    }
    }
