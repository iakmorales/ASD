package UAS2;

public class TransaksiPengisian24 {
    Kendaraan24 kendaraan;
    BBM24 bbm;
    double jumlahLiter;
    double totalSebelumDiskon;
    double diskon;
    
    double totalsetelahDiskon;

    public TransaksiPengisian24(Kendaraan24 kendaraan, BBM24 bbm, double jumlahLiter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.jumlahLiter = jumlahLiter;
        this.totalSebelumDiskon = bbm.hargaPerliter * jumlahLiter;

        if(jumlahLiter >= 20){
            this.diskon = 0.05 * totalSebelumDiskon;
        } else{
            this.diskon = 0;
        }

        this.totalsetelahDiskon = totalSebelumDiskon - diskon;
    }

    public void tampilkanTransaksiPengisian() {
        System.out.println("Daftar Transaksi");
        System.out.println("Plat Nomor Kendaraan: " + kendaraan.platNomor);
        System.out.println("Jumlah Liter: " + jumlahLiter);
        System.out.println("Total Sebelum Diskon: Rp " + totalSebelumDiskon);
        System.out.println("Diskon (5%)         : Rp " + diskon);
        System.out.println("Total Pembayaran    : Rp " + totalsetelahDiskon);
    }
}
