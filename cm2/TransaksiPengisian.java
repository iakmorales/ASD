public class TransaksiPengisian {
    kendaraan Kendaraan;
    BBM bbm; 
    double liter;
    double totalBayar;

    public TransaksiPengisian(kendaraan Kendaraan, BBM bbm, double liter) { 
        this.Kendaraan = Kendaraan;
        this.bbm = bbm;
        this.liter = liter;
    }

    public void tampilkan() {
        totalBayar = liter * bbm.hargaPerliter;

        System.out.println(Kendaraan.platNomor + " | " + Kendaraan.tipe +
        " | " + bbm.namaBBM + " | " + liter + "L | Rp" + totalBayar);
    }
}
