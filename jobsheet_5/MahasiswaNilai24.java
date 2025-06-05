package jobsheet_5;

public class MahasiswaNilai24 {
    int[] nilaiUTS;
    int[] nilaiUAS;

    public MahasiswaNilai24(int[] uts, int[] uas) {
        nilaiUTS = uts;
        nilaiUAS = uas;
    }

    public int cariMaxBruteforce(){
        int max = nilaiUTS[0];
        for (int i = 1; i < nilaiUTS.length; i++) {
            if (nilaiUTS[i] > max) {
                max = nilaiUTS[i];
            }
        }
        return max;
    }

    public int cariMinBruteforce(){
        int min = nilaiUTS[0];
        for (int i = 1; i < nilaiUTS.length; i++) {
            if (nilaiUTS[i] < min) {
                min = nilaiUTS[i];
            }
        }
        return min;
    }

    public int cariMaksimum(int kiri, int kanan) {
        if (kiri == kanan) {
            return nilaiUTS[kiri];
        }
        
        int tengah = (kiri + kanan) / 2;
        int maxKiri = cariMaksimum(kiri, tengah);
        int maxKanan = cariMaksimum(tengah + 1, kanan);
        
        if (maxKiri > maxKanan) {
            return maxKiri;
        } else {
            return maxKanan;
        }
    }
    
    public int cariMinimum(int kiri, int kanan) {
        if (kiri == kanan) {
            return nilaiUTS[kiri];
        }
        
        int tengah = (kiri + kanan) / 2;
        int minKiri = cariMinimum(kiri, tengah);
        int minKanan = cariMinimum(tengah + 1, kanan);
        
        if (minKiri < minKanan) {
            return minKiri;
        } else {
            return minKanan;
        }
    }

    public double hitungRataRata() {
        int total = 0;
        for (int i = 0; i < nilaiUAS.length; i++) {
            total += nilaiUAS[i];
        }
        return (double) total / nilaiUAS.length; 
    }
}
