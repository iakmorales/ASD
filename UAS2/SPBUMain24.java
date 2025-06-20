package UAS2;
import java.util.Scanner;
public class SPBUMain24 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        AntrianKendaraan24 antrian = new AntrianKendaraan24();
        QueueTransaksiKendaraan24 riwayatTransaksi = new QueueTransaksiKendaraan24(10);
        int pilihan;

        do {
            System.out.println("\n========= Menu SPBU ==========");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian ");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = input24.nextInt();
            input24.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Plat Nomor Kendaraan: ");
                    String platNomor = input24.nextLine();
                    System.out.print("Masukkan Tipe Kendaraan: ");
                    String tipe = input24.nextLine();
                    System.out.print("Masukkan Merk Kendaraan: ");
                    String merk = input24.nextLine();
                    Kendaraan24 tambahAntrian = new Kendaraan24(platNomor, tipe, merk);
                    antrian.tambahAntrianK(tambahAntrian);
                    break;
                case 2:
                    System.out.println(" --- Antrian Kendaraan ---");
                    antrian.tampilkanAntrianK();
                    break;
                case 3:
                    System.out.println("Jumlah Antrian Kendaraan: " + antrian.jumlahAntrianK());
                    break;
                case 4:
                    Kendaraan24 dilayani = antrian.layaniKendaraan();
                    if (dilayani != null) {
                        System.out.println("Petugas melayani " + dilayani.platNomor);
                        System.out.print("Masukkan Jenis BBM: ");
                        String jenisBBM = input24.nextLine();
                        System.out.print("Masukkan Harga per Liter: ");
                        double hargaPerLiter = input24.nextDouble();
                        System.out.print("Masukkan Jumlah Liter: ");
                        double jumlahLiter = input24.nextDouble();

                        TransaksiPengisian24 transaksi = new TransaksiPengisian24(dilayani, new BBM24(jenisBBM, hargaPerLiter), jumlahLiter);
                        riwayatTransaksi.enqueue(transaksi);
                        System.out.println(">> Transaksi berhasil dicatat.");
                    } else {
                        System.out.println("Tidak ada kendaraan dalam antrian.");
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println(" --- Riwayat Transaksi ---");
                    riwayatTransaksi.tampilkanTransaksi();
                    break;
                case 0:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);


    }
}
