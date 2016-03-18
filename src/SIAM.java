

public class SIAM {
    String nama, nim, jur;
    String matkul[] = new String[5];
    String kode[] = new String[5];
    int sksmatkul[] = new int[5];
    int totalsks = 0;
    double ip;
    int min, max;
    public void rangeSKS() {
        if (ip > 3.5) {
            min = 22;
            max = 24;
        } else if (ip < 3.0) {
            min = 18;
            max = 20;
        } else {
            min = 20;
            max = 22;
        }
    }
    public void cetakData() {
        System.out.println("---------------------------------");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jur);
        System.out.println("IP: " + ip);
        System.out.println("Jumlah SKS yang diambil: " + totalsks);
        System.out.println("---------------------------------");
    }
}
