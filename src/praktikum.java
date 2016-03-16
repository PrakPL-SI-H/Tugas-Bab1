package cidro;
public class praktikum {
    
    String nama;
    String nim;
    String jurusan;
    String jumlahSks;
    String kodematkul;
    double ip;;
    
    public void setNama(String name) {
        nama = name;
    }
    public void setNIM (String N) {
        nim = N;
    }
    public void setJurusan (String jurus) {
        jurusan = jurus;
    }
    public void setKodematkul (String km) {
        kodematkul = km;
        if ("IFK5002".equals(km)) {
            kodematkul = "Pemrograman Lanjut";
        }
        else if ("SIF15103".equals(km)) {
            kodematkul = "Sistem Fungsional Bisnis";    
        }
        else if ("PTI15005".equals(km)) {
            kodematkul = "Interaksi Manusia dan Komputer";
        }
        else if ("PTI15008".equals(km)) {
            kodematkul = "Sistem Operasi";
        }
        else if ("UNG4008".equals(km)) {
            kodematkul = "Bahasa Indonesia";
        }
        else {
            kodematkul = "Kode yang anda masukkan salah";
        }
    }
    public void setIP (double I) {
        ip = I;
        if (ip >= 3.00) {
            jumlahSks = "22-24";           
        } 
        else if (ip >= 2.50 && ip < 3.00) {
            jumlahSks = "19-21";
        } 
        else if (ip >= 2.00 && ip < 2.50) {
            jumlahSks = "16-18";
        } 
        else if (ip >= 1.50 && ip < 2.00) {
            jumlahSks = "12-15";
        } 
        else if (ip < 1.50) {
            jumlahSks = "kurang dari 12";
        }
    } 
    public void displayData () {
        System.out.println("========DATA MAHASISWA========");
        System.out.println("Nama mahasiswa  :" + nama);
        System.out.println("NIM             :" + nim);
        System.out.println("Jurusan         :" + jurusan);
        System.out.println("IP              :" + ip);
        System.out.println("Mata Kuliah     :" + kodematkul);
        System.out.println("Pengambilan sks :" + jumlahSks);
        System.out.println("==============================");
        System.out.println();
    } 
}