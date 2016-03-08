package praktikumm1;

public class Praktikumm1 {

    public static void main(String[] args) {
        String nama;
        String nim;
        double ip;
        String jurusan;
        int kodeMatkul;
        String namaMatkul;
        String sks;
   
    public void setNama(String n) {
        String nama = n;
    }

    public void setNim(String n) {
        String nim = n;
    }

    public void setIp(double i) {
        double ip = i;

        if (ip >= 3.0) {
            String sks = "24";
        } else if (ip >= 2.50) {
            String sks = "20";
        } else if (ip >= 2.00) {
            String sks = "18";
        }
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setKodeMatkul(int kode) {
        int kodeMatkul = kode;
    }

    public void setNamaMatkul(String m) {
        String namaMatkul = m;
    }

    public void setSks(String sks) {
        this.sks = sks;
    }

}
