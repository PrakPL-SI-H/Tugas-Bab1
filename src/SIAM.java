package PraktikumSIH;
public class SIAM {
    
    String nama;
    double nim;
    double ip;
    String jurusan;
    String sks;
    String kodematkul;
    
    public void setNama(String na) {
        nama = na;
    }
    public void setNIM (double ni) {
        nim = ni;
    }
    public void setIP (double i) {
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
    public void setJurusan (String j) {
        jurusan = j;
    }
    public void setKodematkul (String km) {
        kodematkul = km;
        if (null != km) switch (km) {
            case "IFK5002":
                kodematkul = "Pemrograman Lanjut";
                break;
            case "SIF15103":
                kodematkul = "Sistem Fungsional Bisnis";
                break;
            case "PTI15005":
                kodematkul = "Interaksi Manusia dan Komputer";
                break;
            case "PTI15008":
                kodematkul = "Sistem Operasi";
                break;
            case "UNG4008":
                kodematkul = "Bahasa Indonesia";
                break;
            default:
                kodematkul = "Kode yang anda masukkan salah";
                break;
        }
    }
    public void displayData () {
        System.out.println("=======DATA MAHASISWA=======");
        System.out.println("Nama mahasiswa  :" +nama);
        System.out.println("NIM             :" +nim);
        System.out.println("Jurusan         :" +jurusan);
        System.out.println("IP              :" +ip);
        System.out.println("Mata Kuliah     :" +kodematkul);
        System.out.println("Pengambilan sks :" +sks);
        System.out.println("============================");
        System.out.println();
    } 
}
