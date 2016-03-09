package ppl;
public class siam {
    public String nim,nama,jurusan;
    public double ip;
    public int sksmax;
    siam(String nim, String nama, String jurusan, double ip) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.ip = ip;
        if (ip <= 4) {
            this.sksmax = 24;
        } else if (ip <= 2.99) {
            this.sksmax = 21;
        } else if (ip <= 2.49) {
            this.sksmax = 18;
        } else if (ip <= 1.99) {
            this.sksmax = 15;
        } else if (ip <= 1.50){
            this.sksmax = 12;
        } else {
            System.out.println("Inputan tidak valid");
        }
    }
    public void displayMessage() {
        System.out.println("===========================DATA MAHASISWA==============================");
        System.out.println("Nama            : " + nama);
        System.out.println("NIM             : " + nim);
        System.out.println("JURUSAN         : " + jurusan);
        System.out.println("IP              : " + ip);
        System.out.println("SKS Maksimal    : " + sksmax);
        System.out.println("========================================================================");
    }
}
