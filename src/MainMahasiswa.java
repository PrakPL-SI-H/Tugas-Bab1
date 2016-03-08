import java.util.Scanner;
public class MainMahasiswa {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double IPK;
        String Nama, NIM, Jurusan;
        String KodeMatakuliah[]= new String[10];
        String MataKuliah[] = new String [10];
        int  sks[]= new int[10];
        MahasiswaSiam mhs[] = new MahasiswaSiam[3];
        mhs[0] = new MahasiswaSiam();
        mhs[1] = new MahasiswaSiam();
        mhs[2] = new MahasiswaSiam();
        
        for (int i = 0; i < 3; i++) {
            
            System.out.println("====================================");
            System.out.println("                Program KRS         ");
            System.out.println("====================================");           
            System.out.print("Masukkan Nama : ");
            Nama = input.nextLine();
            mhs[i].setNama(Nama);
            System.out.print("Masukkan NIM  : ");
            NIM = input.nextLine();
            mhs[i].setNIM(NIM);
            System.out.print("Masukkan Jurusan/Prodi : ");
            Jurusan = input.nextLine();
            mhs[i].setJurusan(Jurusan);
            System.out.print("Masukkan IPK : ");
            IPK = input.nextDouble();
            mhs[i].setIPK(IPK);
            System.out.println(" ");
            mhs[i].displayMessage();
            mhs[i].getIPK(IPK); 
            mhs[i].MataKuliah();
            mhs[i].setMataKuliah(MataKuliah);
            mhs[i].setMatkul();
            System.out.println("");
            mhs[i].tampilsks();
            System.out.println("");
            input.nextLine();
        }

    }
}
