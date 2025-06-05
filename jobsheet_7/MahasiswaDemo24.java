import java.util.Scanner;

public class MahasiswaDemo24 {
    public static void main(String[] args) {
         Scanner input24 = new Scanner(System.in);
        
         MahasiswaBerprestasi24 list = new MahasiswaBerprestasi24();
         System.out.println("Masukkan jumlah data mahasiswa : ");
         int jumlah = input24.nextInt();
         input24.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            String nim = input24.nextLine();
            System.out.print("Nama : ");
            String nama = input24.nextLine();
            System.out.print("Kelas : ");
            String kelas = input24.nextLine();
            System.out.print("IPK : ");
            String ip = input24.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("-----------------------------");
            list.tambah(new Mahasiswa24(nim, nama, kelas, ipk));
        }
        list.tampil();

        //melakukan pencarian data sequential
        /*System.out.println("---------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("---------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = input24.nextDouble();
        System.out.println("---------------------------------");
        System.out.println("menggunakan sequential searching");
        System.out.println("---------------------------------");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);*/

        //melakukan pencarian data Binaary
        System.out.println("---------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("---------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari2 = input24.nextDouble();
        System.out.println("---------------------------------");
        System.out.println("menggunakan binary searching");
        System.out.println("---------------------------------");
        double posisi2 = list.findBinarySearch(cari2, 0, jumlah - 1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari2, pss2);
        list.tampilDataSearch(cari2, pss2);
    }
}
