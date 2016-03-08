public class SIAM {
    String nama;
    Long nim;
    int totalsks,x,jumlah;
    int []jumlahsks;
    double ip;
    String jurusan, kode, matakuliah;    
    public void daftar (){
  System.out.println("====================Daftar Mata Kuliah===================");
  System.out.printf("|%-10s |%-30s |%-10s |\n","kode","mata kuliah","jumlah sks");
  System.out.println("---------------------------------------------------------");
  System.out.printf("|%-10s |%-30s |%-10s |\n","IFK1502","Pemrograman Lanjut","5");
  System.out.printf("|%-10s |%-30s |%-10s |\n","PTI5008","Sistem Operasi","5");
  System.out.printf("|%-10s |%-30s |%-10s |\n","SIF15013","Sistem Fungsional Bisnis","5");
  System.out.printf("|%-10s |%-30s |%-10s |\n","UIN408","Bahasa Indonesia","3");
  System.out.printf("|%-10s |%-30s |%-10s |\n","SIF15012","Interaksi Manusia Komputer","5");
  System.out.printf("|%-10s |%-30s |%-10s |\n","IFK1501","Pemrograman Dasar","5");
  System.out.printf("|%-10s |%-30s |%-10s |\n","UING405","Bahasa Inggris","4");
  System.out.println("----------------------------------------------------------");
    }
    public void ambilSks (double ip){
       if (this. ip >4 || this.ip < 0)
       {System.out.println("ip salah ulangi proses");
            System.exit(0);}
        if (this.ip>3 && this.ip <=4){
            totalsks=24;
        }else if(this.ip>2.5){
            totalsks=18;
        }else if (this.ip>2){
            totalsks=15;
        }else if (this.ip>=0){
            totalsks=8;}}
     public void jumSks (){
         int jumlah=0;
        for (int n=0;n<jumlahsks.length;n++){
            jumlah=jumlahsks[n]+jumlah;
        }
        if (jumlah>totalsks){
            System.out.println("=====PERINGATAN======");
            System.out.println("Maaf, jumlah sks yang anda ambil melebihi syarat batas maksimal SKS");
            System.out.println("Ulang kembali memasukkan mata kuliah \n");
            this.jumlah=0;
        }else {System.out.println("Selamat, mata kuliah anda telah terdaftar dalam sistem");
        this.jumlah=1;}
    }
}

