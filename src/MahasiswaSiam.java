
import java.util.Scanner;

class MahasiswaSiam {
    private String Nama;
    private String NIM;
    private String Jurusan;
    private double IPK;
    private String KodeMatakuliah[] = new String[10];
    private String MataKuliah[] = new String[10];
    private int sks[] = new int[10];
    private int batas;
    private int jmlmatkul;
    private int totalsks;
   
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setJurusan(String Jurusan) {
        this.Jurusan = Jurusan;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public void setKodeMatakuliah(String [] KodeMatakuliah) {
        for (int i = 0; i < 10; i++) {
            this.KodeMatakuliah[i] = KodeMatakuliah[i];
        }
        
    }

    public void setMataKuliah(String [] MataKuliah) {
        for (int i = 0; i < 10; i++) {
            this.MataKuliah[i] = MataKuliah[i];
        }
        
    }

    public void setSks(int[] sks) { 
        for (int i = 0; i < 10; i++) {
         this.sks[i] = sks[i];   
        }
        
    }
    public void setMatkul(){
        Scanner input = new Scanner (System.in);    
        while(true) {
            
            System.out.print("Masukkan Kode Mata Kuliah\t: ");
            String kode = input.next();
            input.nextLine();
            KodeMatakuliah[jmlmatkul] = kode;
            System.out.print("Masukkan Mata Kuliah\t: ");
            MataKuliah[jmlmatkul] = input.nextLine();
            System.out.print("Masukkan SKS Mata Kuliah\t: ");
            sks[jmlmatkul] = input.nextInt();
            System.out.println("");
            if((totalsks+sks[jmlmatkul])>batas){
                System.out.println("Sks Mata Kuliah yang anda masukkan melebihi batas");
                break;
            }
            
            totalsks=totalsks+sks[jmlmatkul];
            jmlmatkul++;
           }
    }

    public void getIPK(double IPK) {
        this.IPK = IPK;
        if (IPK<1.5){
            System.out.println("SKS yang bisa anda ambil <12 sks");
            batas=11;
        } else if (IPK<2.0){
            batas=15;
            System.out.println("SKS yang bisa anda ambil 12-15 sks");
        } else if (IPK<2.5){
            batas=18;
            System.out.println("SKS yang bisa anda ambil 16-18 sks ");
        } else if (IPK<3.0){
            batas=21;
            System.out.println("SKS yang bisa anda ambil 19-21 sks ");
        } else { System.out.println("SKS yang bisa anda ambil 22-24 sks");
        batas=24;
    
        }
    }
    public void displayMessage(){
        System.out.println("=====================================");
        System.out.println("Nama anda\t:" +Nama);
        System.out.println("NIM anda\t: " +NIM);
        System.out.println("Jurusan\t\t: " +Jurusan);
        System.out.println("IPK\t\t:" +IPK);
        System.out.println("=====================================");   
    }
    public void MataKuliah(){
        System.out.println(); 
        System.out.println("SILAHKAN PILIH MATAKULIAH");
             System.out.println("1.(IFK15002) Pemrograman Lanjut (5 SKS) ");
             System.out.println("2.(PTI15005) Interaksi Manusia & Komputer (3 SKS)");
             System.out.println("3.(SIF15103) Sistem Fungsional Bisnis (4 SKS)");
             System.out.println("4.(PTI15008) Sistem Operasi (4 SKS)");
             System.out.println("5.(UNG4008)  Bahasa Indonesia (3 SKS)");
        
    }
    public void tampilsks(){
        System.out.println("===================================");
            System.out.println("HASIL KRS ANDA");
            System.out.println("===================================");
            System.out.print("Kode \t\t");
            System.out.print("Mata Kuliah\t\t");
            System.out.print("SKS\t");
            System.out.println("");
            for (int i = 0; i <jmlmatkul; i++) {
            System.out.print(KodeMatakuliah[i] +"\t");
            System.out.print(MataKuliah[i] +"\t");
            System.out.print(sks[i] +"\t");
            System.out.println("");
            }
}
 }

