import java.util.Scanner;
public class SPBU_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLinkedList antrianKendaraan = new AntrianLinkedList();
        queueTransaksi antrianTransaksi = new queueTransaksi(10);
        int pilihan;

        do { 
            System.out.println("\n========= Menu SPBU ==========");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Plat Nomor Kendaraan: ");
                    String platNomor = sc.nextLine();
                    System.out.print("Masukkan Tipe Kendaraan: ");
                    String tipe = sc.nextLine();
                    System.out.print("Masukkan Merk Kendaraan: ");
                    String merk = sc.nextLine();
                    kendaraan tambahAntrian = new kendaraan(platNomor, tipe, merk);
                    antrianKendaraan.tambahAntrian(tambahAntrian);
                    break;
                case 2:
                    System.out.println(" ======= Antrian Kendaraan =======");
                    antrianKendaraan.tampilkanAntrian();
                    break;
                case 3:
                    System.out.println("jumlah kendaraan dalam antrian: " + antrianKendaraan.jumlahAntrian());
                    break;
                case 4: 
                    kendaraan dilayani = antrianKendaraan.layaniAntrian();
                    if (dilayani != null) {
                        System.out.println("Petugas Melayani " + dilayani.platNomor);
                        BBM bbm = new BBM();
                        TransaksiPengisian transaksi = new TransaksiPengisian(dilayani, bbm, bbm.jumlahLiter);
                        antrianTransaksi.enqueue(transaksi);
                        System.out.println(">> Transaksi berhasil dicatat:");
                        transaksi.tampilkan();
                    }
                    break;                     
                case 5:
                    System.out.println("======== Riwayat Transaksi ========");
                    antrianTransaksi.tampilkanTransaksi();
                    break;
                default:
                System.out.println("Pilihan tidak valid, silakan coba lagi.");

            }
            
        } while (pilihan != 0);
    }   
}
