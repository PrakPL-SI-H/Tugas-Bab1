/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siam;


public class Mahasiswa {
String nama;
String nim;
double ip;
String jurusan;
int kodeMatkul;
String namaMatkul;
String sks;
String nama1;

public void setNama(String x){
nama = x;
}

public void setNim(String n){
    nim = n;
}

public void setIp (double i){
    ip = i;
    
    if (ip >= 3.0){
        sks = "24";
    }else if (ip >= 2.50){
        sks = "20";
    }else if (ip>= 2.00){
        sks = "18";   
    }    
}
public void setJurusan (String jur){
    this.jurusan = jur;
}

public void setKodeMatkul (int code){
    kodeMatkul = code;
}

public void setNamaMatkul (String m){
    namaMatkul = m;
}

public void setSks (String sks){
    this.sks  = sks;
}

public void displayMessage(){
    System.out.println("Masukkan nama : " + nama);
    System.out.println("Masukkan NIM : " + nim);
    System.out.println("Masukkan IP anda : " + ip);
    System.out.println("Masukkan jurusan : " + jurusan);
    System.out.println("Masukkan kode mata kuliah yang anda ambil : " + kodeMatkul);
    System.out.println("Masukkan nama mata kuliah : " + namaMatkul);
    System.out.println("Jumlah sks mata kuliah : " + sks + " sks");
}
    }


    
