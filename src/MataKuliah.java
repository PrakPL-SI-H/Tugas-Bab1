package mainsiam;

public class MataKuliah {
 

    String Kode;
    String Nama;
    double sks;
 
    public MataKuliah(String x, String y, double z) {
        Kode = x;
        Nama = y;
        sks = z;
    }
 
    public void cetakMataKuliah() {
        System.out.printf("%9s%8s%-35s%9s\n",Kode," ",Nama,sks);
    }

}


