package MuhAsdar;

import java.util.Scanner;

public class Siam {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DataMahasiswa mhs = new DataMahasiswa();
        
        System.out.println("SISTEM INFORMASI AKADEMIK MAHASISWA SISTEM INFORMASI");
        System.out.print("Username (NIM) = ");
        mhs.username = in.next();
        System.out.print("Password       = ");
        String pass = in.next();
        
        for (int i = 0; i < mhs.mhs.length; i++) {
            if ((mhs.username.equals(mhs.mhs[i][1]) && pass.equals(mhs.mhs[i][1]))) {
                mhs.showData();
            }
        }
        
        System.out.println("");
        
    }
    
}
