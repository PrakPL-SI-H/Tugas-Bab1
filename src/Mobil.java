package classdanobject.PraktikumPemLan;

public class Mobil {

    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu, sekon, kec, jarak;

    public void setNoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

    public void setKecepatan(int i) {
        kecepatan = i;
    }

    public void setWaktu(double i) {
        waktu = i;
    }

    public void rubahSekon(double i) {
        sekon = i * 3600;
    }

    public void rubahKecepatan(double i) {
        kec = (i * 3600) / 100000;
    }
    
    public void hitungJarak(int kec, double sekon) {
        jarak = (kec * sekon) / 100000 ;
    }

    public void displayMessage() {
        System.out.println("---------------------------------------");
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kec + " m/s");
        System.out.println("waktu anda dalam sekon adalah " + sekon + " detik");
        System.out.println("jarak tempuh "+jarak+" km");
    }
}
