
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prasetyo
 */
public class MainSiam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Siam ayo = new Siam();
        System.out.print("Masukkan nama = ");
        ayo.nama = in.nextLine();
        System.out.print("Masukkan jurusan = ");
        ayo.jurusan= in.nextLine();
        System.out.print("Masukkan nim = ");
        ayo.nim = in.nextInt();
        System.out.print("Masukkan ipk = ");
        ayo.ipk= in.nextDouble();
        ayo.displayMessage();
        System.out.println("===================");
        
    }
    
}
