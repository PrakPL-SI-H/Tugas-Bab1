package Praktikum1;

public class Krs {

    private String kode;
    private String kuliah;
    private int sks;

    Mahasiswa ipk = new Mahasiswa();

    public void setSks(int sks) {
        if (ipk.getIpk() >= 3.00) {
            System.out.println("Dengan IPK anda saat ini anda dapat mengambil 22 - 24 sks");
            this.sks = sks;
            if (this.sks >= 24) {
                System.out.println("SKS anda terlalu banyak, SKS anda akan kembali menjadi 24 SKS");
                this.sks = 24;
            }
        } else if (ipk.getIpk() >= 2.50 && ipk.getIpk() <= 2.99) {
            System.out.println("Dengan IPK anda saat ini anda dapat mengambil 19 - 21 sks");
            this.sks = sks;
            if (this.sks >= 21) {
                System.out.println("SKS anda terlalu banyak, SKS anda akan kembali menjadi 21 SKS");
                this.sks = 21;
            }
        } else if (ipk.getIpk() >= 2.00 && ipk.getIpk() <= 2.49) {
            System.out.println("Dengan IPK anda saat ini anda dapat mengambil 16 - 18 sks");
            this.sks = sks;
            if (this.sks >= 18) {
                System.out.println("SKS anda terlalu banyak, SKS anda akan kembali menjadi 18 SKS");
                this.sks = 18;
            }
        } else if (ipk.getIpk() >= 1.50 && ipk.getIpk() <= 1.99) {
            System.out.println("Dengan IPK anda saat ini anda dapat mengambil 12 - 15 sks");
            this.sks = sks;
            if (this.sks >= 15) {
                System.out.println("SKS anda terlalu banyak, SKS anda akan kembali menjadi 15 SKS");
                this.sks = 15;
            }
        } else if (ipk.getIpk() < 1.50) {
            System.out.println("Dengan IPK anda saat ini anda dapat mengambil 11 sks");
            this.sks = sks;
            if (this.sks >= 11) {
                System.out.println("SKS anda terlalu banyak, SKS anda akan kembali menjadi 11 SKS");
                this.sks = 11;
            }
        }
    }

    public void setKode(String kode) {
        if (sks >= 22) {
            this.kode = kode;

        }
    }
}
