package Praktikum;
public class  Siam {
    String nama[];
        String nim[];
    double ip[];
    String jurusan[];
    String kode[];
    String namamatkul[];
    int sks[];
    int n;

    public void setData() {
        nama = new String[n];
        nim = new String[n];
        ip = new double[n];
        jurusan = new String[n];
        kode = new String[n];
        namamatkul = new String[n];
        sks = new int[n];
    }
        public void isiNilai(int n, String name, String nimm, double ipp, String jur, String kod, String nama_mk, int s_ks) {
        nama[n] = name;
        nim[n] = nimm;
        ip[n] = ipp;
        jurusan[n] = jur;
        kode[n] = kod;
        namamatkul[n] = nama_mk;
        sks[n] = s_ks;
    }

    public void tampilkanData() {
        System.out.println("===Data Mahasiswa===");
        for (int i = 0; i < n; i++) {
            System.out.println("Nama        : " + nama[i]);
            System.out.println("NIM         : " + nim[i]);
            System.out.println("IP          : " + ip[i]);
            System.out.println("Jurusan     : " + jurusan[i]);
            System.out.println("Kode MataKuliah     : " + kode[i]);
            System.out.println("Nama MataKuliah     : " + namamatkul[i]);
            System.out.println("Junlah sks Matkul   : " + sks[i]);
            System.out.println("");
        }
        System.out.println("");
    }

}
