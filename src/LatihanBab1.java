import java.util.Scanner;

/**
 *
 * @author User
 */
class Modul1 {

    public String nama, nim, jurusan, kode, matkul;
    public double ip;
    public int i, jumlahSKS, totalSKS;

    public void setNama(String n) {
        nama = n;
    }

    public void setNim(String a) {
        nim = a;
    }

    public void setJurusan(String j) {
        jurusan = j;
    }

    public void setKode(String k) {
        kode = k;
    }

    public void setMatkul(String m) {
        matkul = m;
    }

    public void setIp(double i) {
        ip = i;
    }

    void masukkan() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Mahasiswa : ");
        nama = input.nextLine();
        System.out.print("NIM : ");
        nim = input.next();
        System.out.print("Hasil IP : ");
        ip = input.nextDouble();
        System.out.print("Jurusan : ");
        jurusan = input.next();
    }

    void getmatkul() {
        Scanner input = new Scanner(System.in);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int j = 1; j < 5; j++) {
            System.out.print("Masukkan kode mata kuliah anda: ");
            kode = input.next();
            System.out.print("Masukkan mata kuliah anda: ");
            matkul = input.next();
            System.out.print("Masukkan jumlah SKS anda: ");
            jumlahSKS = input.nextInt();
            totalSKS += jumlahSKS;
        }
        System.out.println("Total jumlah SKS anda: " + totalSKS);
    }

    void proses() {

        if (ip >= 3.0) {
            System.out.println("Mahasiswa lulus 5 Mata Kuliah");
            System.out.println("Mahasiswa dapat mengambil 19-24 SKS");
        } else if (ip >= 2.50 && ip <= 2.99) {
            System.out.println("Mahasiswa lulus 5 Mata Kuliah");
            System.out.println("Mahasiswa dapat mengambil 19-21 SKS");
        } else if (ip >= 2.00 && ip <= 2.49) {
            System.out.println("Mahasiswa lulus 4 Mata Kuliah");
            System.out.println("Mahasiswa dapat mengambil 16-18 SKS");
        } else if (ip >= 1.50 && ip <= 1.99) {
            System.out.println("Mahasiswa lulus 3 Mata Kuliah");
            System.out.println("Mahasiswa dapat mengambil 12-15 SKS");
        } else if (ip <= 1.50) {
            System.out.println("Mahasiswa lulus 2 Mata Kuliah");
            System.out.println("Mahasiswa dapat mengambil > 12 SKS");
        }
    }

    void displayData() {

        System.out.println("========================= Tabel Data Mahasiswa =========================");
        System.out.printf("%-20s%-8s%-8s%-8s%-8s%-10s%-10s%s\n", "Nama", "NIM", "Jurusan", "Ip", "Kode", "Matkul", "Jumlah SKS", "Total SKS");
        System.out.printf("%-20s%-8s%-8s%-8s%-8s%-10s%-10s%s\n", nama, nim, jurusan, ip, kode, matkul, jumlahSKS, totalSKS);
    }

    }
public class LatihanBab1 {
    public static void main(String[] args) {
        System.out.println("tess");
        Scanner input = new Scanner(System.in);
        int data;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~ SELAMAT DATANG ~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("***************** SISTEM INFORMASI AKADEMIK MAHASISWA *****************");
        System.out.println();
        System.out.print("Masukkan Banyak Mahasiswa : ");
        data = input.nextInt();
        Modul1 first = new Modul1();
        for (int i = 0; i < data; i++) {
            first.masukkan();
            first.proses();
            first.getmatkul();
            first.displayData();
        }
    }
        
    }