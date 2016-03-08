public class SiamMatkul { 
    String kodematkul, namamatkul;
    byte sks;
   
    public SiamMatkul(String kd){
        if(kd.equalsIgnoreCase("UB001")){
            kodematkul = "UB001";
            namamatkul = "Pemrograman Lanjut";
            sks = 4;
        }else if(kd.equalsIgnoreCase("UB002")){
            kodematkul = "UB002";
            namamatkul = "Bahasa Inggris";
            sks = 3;
        }
        
        if(kd.equalsIgnoreCase("UB003")){
            kodematkul = "UB003";
            namamatkul = "Bahasa Indonesia";
            sks = 4;
        }else if(kd.equalsIgnoreCase("UB004")){
            kodematkul = "UB004";
            namamatkul = "Sistem Digital";
            sks = 3;
        }
        
        if(kd.equalsIgnoreCase("UB005")){
            kodematkul = "UB005";
            namamatkul = "Probabilitas dan Statistika";
            sks = 4;
        }else if(kd.equalsIgnoreCase("UB006")){
            kodematkul = "UB006";
            namamatkul = "Matematika Komputasi Lanjut";
            sks = 3;
        }
        
        if(kd.equalsIgnoreCase("UB007")){
            kodematkul = "UB007";
            namamatkul = "Algoritma dan Struktur Data";
            sks = 4;
        }else if(kd.equalsIgnoreCase("UB008")){
            kodematkul = "UB008";
            namamatkul = "Arsitektur dan Organisasi Komputer";
            sks = 3;
        }
        
        if(kd.equalsIgnoreCase("UB009")){
            kodematkul = "UB009";
            namamatkul = "Interaksi Manusia dan Komputer";
            sks = 4;
        }else if(kd.equalsIgnoreCase("UB0010")){
            kodematkul = "UB0010";
            namamatkul = "Sistem Basis Data";
            sks = 3;
        }
    } 
}
