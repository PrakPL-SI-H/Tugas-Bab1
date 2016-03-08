
public class MainBuku {
    public static void main(String[] args) {
        Buku bk = new Buku ();
       
        System.out.println("Jumlah kata yang ditulis : "+bk.kata()+" kata");
        System.out.println("Jumlah halaman yang ditulis : "+bk.halaman()+" halaman");
         System.out.println("Waktu yang dihabiskan mengisi 1 buku : "+bk.hari()+" hari");
    }
}
