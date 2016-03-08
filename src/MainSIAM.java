import java.util.Scanner;
public class MainSIAM {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Scanner input = new Scanner (System.in);
        
        SIAM mhs1 = new SIAM();
        SIAM mhs2 = new SIAM();
        SIAM mhs3 = new SIAM();
        
        System.out.print("Masukkan Nama    : ");
        mhs1.nama = input.nextLine();
        System.out.print("Masukkan NIM     : ");
        mhs1.nim = in.nextLong();
        System.out.print("Masukkan jurusan : ");
        mhs1.jurusan = input.nextLine();
        System.out.print("Masukkan ip      : ");
        mhs1.ip = in.nextDouble();
        mhs1.ambilSks(mhs1.ip);
        System.out.println("Jumlah sks maksimal yang bisa diambil adalah "+mhs1.totalsks+" SKS \n");
        mhs1.daftar();
        System.out.println("");
        System.out.print("Masukkan jumlah mata kuliah yang akan diambil : ");
        mhs1.x = in.nextInt();
       mhs1.jumlahsks = new int [mhs1.x];
        
       do{
        for(int n=0;n<mhs1.x;n++){
        System.out.print("Masukkan kode        : ");
        mhs1.kode = input.nextLine();
        System.out.print("Masukkan mata kuliah : ");
        mhs1.matakuliah = input.nextLine();
        System.out.print("Masukkan jumlah sks  : ");
        mhs1.jumlahsks[n] = in.nextInt();
        }
        mhs1.ambilSks(mhs1.ip);
        mhs1.jumSks();
           System.out.println("");
       }while (mhs1.jumlah==0);
       
       System.out.print("Masukkan Nama    : ");
        mhs2.nama = input.nextLine();
        System.out.print("Masukkan NIM     : ");
        mhs2.nim = in.nextLong();
        System.out.print("Masukkan jurusan : ");
        mhs2.jurusan = input.nextLine();
        System.out.print("Masukkan ip      : ");
        mhs2.ip = in.nextDouble();
        mhs2.ambilSks(mhs2.ip);
        System.out.println("Jumlah sks maksimal yang bisa diambil adalah "+mhs2.totalsks+" SKS \n");
        mhs2.daftar();
        System.out.println("");
        System.out.print("Masukkan jumlah mata kuliah yang akan diambil : ");
        mhs2.x = in.nextInt();
       mhs2.jumlahsks = new int [mhs2.x];
        
       do{
        for(int n=0;n<mhs2.x;n++){
        System.out.print("Masukkan kode        : ");
        mhs2.kode = input.nextLine();
        System.out.print("Masukkan mata kuliah : ");
        mhs2.matakuliah = input.nextLine();
        System.out.print("Masukkan jumlah sks  : ");
        mhs2.jumlahsks[n] = in.nextInt();
        }
        mhs2.ambilSks(mhs2.ip);
        mhs2.jumSks();
           System.out.println("");
       }while (mhs2.jumlah==0);
    
    System.out.print("Masukkan Nama    : ");
        mhs3.nama = input.nextLine();
        System.out.print("Masukkan NIM     : ");
        mhs3.nim = in.nextLong();
        System.out.print("Masukkan jurusan : ");
        mhs3.jurusan = input.nextLine();
        System.out.print("Masukkan ip      : ");
        mhs3.ip = in.nextDouble();
        mhs3.ambilSks(mhs1.ip);
        System.out.println("Jumlah sks maksimal yang bisa diambil adalah "+mhs3.totalsks+" SKS \n");
        mhs3.daftar();
        System.out.println("");
        System.out.print("Masukkan jumlah mata kuliah yang akan diambil : ");
        mhs3.x = in.nextInt();
       mhs3.jumlahsks = new int [mhs3.x];
        
       do{
        for(int n=0;n<mhs3.x;n++){
        System.out.print("Masukkan kode        : ");
        mhs3.kode = input.nextLine();
        System.out.print("Masukkan mata kuliah : ");
        mhs3.matakuliah = input.nextLine();
        System.out.print("Masukkan jumlah sks  : ");
        mhs3.jumlahsks[n] = in.nextInt();
        }
        mhs3.ambilSks(mhs3.ip);
        mhs3.jumSks();
           System.out.println("");
       }while (mhs3.jumlah==0);
    }
       
    }
        
    
