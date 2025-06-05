import java.util.Scanner;
public class DosenDemo24 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner (System.in);

        DataDosen24 data = new DataDosen24();
         System.out.print("Masukkan jumlah data dosen : ");
         int jumlah = input24.nextInt();
         input24.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode : ");
            String kode = input24.nextLine();
            System.out.print("Nama : ");
            String nama = input24.nextLine();
            System.out.print("Jenis Kelamin : ");
            String jk = input24.nextLine();
            System.out.print("Usia : ");
            String usia = input24.nextLine();
            int age = Integer.parseInt(usia);
            System.out.println("-----------------------------");
            data.tambah(new Dosen24(kode, nama, jk, age));
        }

        data.tampil();

        //melakukan pencarian data sequential       
        System.out.println("---------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("---------------------------------");    
        System.out.println("Masukkan nama dosen yang dicari: ");
        System.out.print("Nama: ");
        String cari = input24.nextLine();
        System.out.println("---------------------------------");
        System.out.println("menggunakan sequential searching");
        System.out.println("---------------------------------");
        int posisi = data.PencarianDataSequential24(data.listDos, cari);
        data.tampilPosisiNama(cari, posisi);

        //melakukan pencarian data Binaary
        System.out.println("---------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("---------------------------------");
        System.out.println("Masukkan usia dosen yang dicari: ");
        System.out.print("Usia: ");
        String cari2 = input24.nextLine();
        int posisi2 = data.PencarianDataBinary24(data.listDos, cari2);
        System.out.println("---------------------------------");
        System.out.println("menggunakan binary searching");
        System.out.println("---------------------------------");
        data.tampilPosisiUsia(cari2, posisi2);

    }
}
