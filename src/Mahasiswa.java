
package tugaspemlan1;

public class Mahasiswa {
    public Matkul []matkul=new Matkul[20];
    public String Nama,Nim,Jurusan;
    public int sksmin,sksmax,jumlah,totalsks;
    public double Ip;
    

   

    Mahasiswa(String nama, String nim, String jurusan, double ip) {
    Nama=nama;
    Nim=nim;
    Jurusan=jurusan;
    Ip=ip;
    if (Ip>=3.0){
            sksmin=22;
            sksmax=24;
        }
    else if (Ip>=2.5){
            sksmin=19;
            sksmax=21;
        }
    else if (Ip>=2.0){
            sksmin=16;
            sksmax=18;
        }
    else if (Ip>=1.5){
            sksmin=12;
            sksmax=15;
        }}
    public void matkul(String kode, String nama, int sks){
        totalsks+=sks;
        if (sksmax<totalsks)
            System.out.println("SKS yang anda masukkan melebihi SKS maksimal yang bisa diambil");
        else{
            System.out.println("sisa : "+(sksmax-totalsks));
            System.out.println("Total SKS : "+totalsks);
        }
        matkul[jumlah]=new Matkul(kode,sks,nama);
        ++jumlah;
    }
        public void tampilsks(){
        System.out.println("Jumlah SKS minimal yang dapat diambil : "+sksmin);
        System.out.println("Jumlah SKS maximal yang dapat diambil : "+sksmax);
    }
        public void tampil(){
            System.out.println("");    
            System.out.println("Nama    : "+Nama);
            System.out.println("Nim     : "+Nim);
            System.out.println("Jurusan : "+Jurusan);
            System.out.println("Ip : "+Ip);
            System.out.println("");
            
            System.out.println("-------Daftar Matkul------");
            for (int i=0;i<jumlah;i++){
            System.out.println("Kode Matkul : "+matkul[i].kodematkul);
            System.out.println("Nama Matkul : "+matkul[i].namamatakul);
            System.out.println("Jumlah SKS  : "+matkul[i].jumlahsks);
        }
        System.out.println("---------------------------------------------------------------");
        System.out.println("Total sks : "+totalsks);
        System.out.println("");
    }
}


    

    

    


    

