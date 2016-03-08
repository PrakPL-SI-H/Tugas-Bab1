package praktikumm1;
import java.util.Scanner;
public class siamm {
  public static void main (String[] args){
      Scanner input = new Scanner(System.in);
      for (int i = 0; i < 3; i++) {   
      siamm a = new siamm();
   
      System.out.println("==================================");
 
      System.out.println("Masukkan nama : ");
      String nama = input.nextLine();
      a.setNama(nama);
      System.out.println("Masukkan NIM : ");
      String nim = input.nextLine();
      a.setNim(nim);
      System.out.println("Masukkan jurusan : ");
      String jurusan = input.nextLine();
      a.setJurusan(jurusan);
      System.out.println("Masukkan IP anda : ");
      double ip = input.nextDouble();
      a.setIp(ip);
      System.out.println("Masukkan kode mata kuliah yang anda ambil : ");
      int kodeMatkul = input.nextInt();
      a.setKodeMatkul(kodeMatkul);
      System.out.println("Nama mata kuliah : ");
      String nama1 = input.next();
      a.setNamaMatkul(nama1);
      System.out.println();
      System.out.println("Sistem Informasi Akademik Mahasiswa (SIAM) : ");
      a.displayMessage();
      System.out.println("=========================================");
      }  
  }  

    private void setNama(String nama) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setNim(String nim) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setJurusan(String jurusan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setIp(double ip) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setKodeMatkul(int kodeMatkul) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setNamaMatkul(String nama1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}