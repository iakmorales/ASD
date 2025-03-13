package jobsheet_5;

public class MahasiswaNilai24 {
    int[] nilaiUTS;
    int[] nilaiUAS;

    public MahasiswaNilai24(int[] uts, int[] uas) {
        nilaiUTS = uts;
        nilaiUAS = uas;
    }

    public int cariMaksimum(int kiri, int kanan) {
        if (kiri == kanan) return nilaiUTS[kiri]; 
        int tengah = (kiri + kanan) / 2;
        int maxKiri = cariMaksimum(kiri, tengah);
        int maxKanan = cariMaksimum(tengah + 1, kanan);
        return (maxKiri > maxKanan) ? maxKiri : maxKanan;
    }

    public int cariMinimum(int kiri, int kanan) {
        if (kiri == kanan) return nilaiUTS[kiri]; 
        int tengah = (kiri + kanan) / 2;
        int minKiri = cariMinimum(kiri, tengah);
        int minKanan = cariMinimum(tengah + 1, kanan);
        return (minKiri < minKanan) ? minKiri : minKanan;
    }

    public double hitungRataRata() {
        int total = 0;
        for (int i = 0; i < nilaiUAS.length; i++) {
            total += nilaiUAS[i];
        }
        return (double) total / nilaiUAS.length; 
    }
}
