/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prasetyo
 */
public class Siam {

public String nama;
public int nim;
public String jurusan;
public Double ipk;
public String matkul;
public int sks;

public void setNama(String nm){ 
    nama = nm;
}
public void setNim(int im){
    nim = im;
}
public void setJurusan(String ju){
    jurusan = ju ;
}
public void setIpk(Double ip){
    ipk = ip;
}

public void setSks(int sk){
    if (ipk > 3.5)
        System.out.println("24-22 sks");
    else if (ipk < 3.5)
        System.out.println("21-19 sks");
    else if (ipk < 3.0)
        System.out.println("18-16 sks");
    else if (ipk < 2.5)
        System.out.println("15-13 sks");
    else
        System.out.println("12 sks");
}
public void displayMessage(){
        System.out.println("Nama    = "+nama);
        System.out.println("Nim     = "+nim);
        System.out.println("Jurusan = "+jurusan);
        System.out.println("ipk     = "+ipk);
    }
}