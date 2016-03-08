
package prakpemlan1;

public class Praktikum1 {
    
    String nama;
    String nim;
    double ip;
    String jurusan;
    String sks;
    String kodematakuliah;
    
    public void aturNama(String nm) {
        nama = nm;
    }
    public void aturNIM (String n) {
        nim = n;
    }
    public void aturIP (double i) {
        ip = i;
        if (ip >= 3.00) {
            sks = "22-24";           
        } 
        else if (ip >= 2.50 && ip < 3.00) {
            sks = "19-21";
        } 
        else if (ip >= 2.00 && ip < 2.50) {
            sks = "16-18";
        } 
        else if (ip >= 1.50 && ip < 2.00) {
            sks = "12-15";
        } 
        else if (ip < 1.50) {
            sks = "kurang dari 12";
        }
    }
    public void aturJurusan (String j) {
        jurusan = j;
    }
    public void aturKodematkul (String km) {
        kodematakuliah = km;
        if ("IFK5002".equals(km)) {
            kodematakuliah = "Pemrograman Lanjut";
        }
        else if ("SIF15103".equals(km)) {
            kodematakuliah = "Sistem Fungsional Bisnis";    
        }
        else if ("PTI15005".equals(km)) {
            kodematakuliah = "Interaksi Manusia dan Komputer";
        }
        else if ("PTI15008".equals(km)) {
            kodematakuliah = "Sistem Operasi";
        }
        else if ("UNG4008".equals(km)) {
            kodematakuliah = "Bahasa Indonesia";
        }
        else {
            kodematakuliah = "Kode yang anda masukkan salah";
        }
    }
    public void displayData () {
        System.out.println("HOME SIAM");
        System.out.println("Nama mahasiswa  :" +nama);
        System.out.println("NIM             :" +nim);
        System.out.println("Jurusan         :" +jurusan);
        System.out.println("IP              :" +ip);
        System.out.println("Mata Kuliah     :" +kodematakuliah);
        System.out.println("Pengambilan sks :" +sks);
        System.out.println("===============================");
        System.out.println();
    } 
}


