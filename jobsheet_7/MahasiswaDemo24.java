import java.util.Scanner;

public class MahasiswaDemo24 {
    public static void main(String[] args) {
         Scanner input24 = new Scanner(System.in);
        
         MahasiswaBerprestasi24 list = new MahasiswaBerprestasi24();
         int jumlah = 5;

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
        System.out.println("---------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = input24.nextDouble();

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    }
}
