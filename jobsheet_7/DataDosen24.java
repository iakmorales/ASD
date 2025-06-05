import java.util.Arrays;
public class DataDosen24 {
    Dosen24 [] listDos = new Dosen24[3];
    int jumlah = 0;

    void tambah(Dosen24 d){
       listDos[jumlah] = d;
        jumlah++;
    }

    void tampil(){
       System.out.println("Data Dosen");
        for (Dosen24 d : listDos){
            d.tampil();
            System.out.println("-----------------------------");
        }
    }

    int PencarianDataSequential24(Dosen24[] listDos, String cariNama) {
        for (int j=0; j < listDos.length; j++){
            if (listDos[j].nama.equalsIgnoreCase(cariNama)){
                return j;
            }
        }
        return -1;
    }

    int PencarianDataBinary24(Dosen24[] listDos, String usiaStr) {
        int usia = Integer.parseInt(usiaStr);
        Arrays.sort(listDos, 0, jumlah, (a, b) -> Integer.compare(a.usia, b.usia)); // Urutkan berdasarkan usia
        int low = 0, high = jumlah - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (listDos[mid].usia == usia) {
                return mid;
            } else if (listDos[mid].usia < usia) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    void tampilPosisiNama(String nama, int pos) {
        if (pos!= -1){
            System.out.println("data dosen dengan nama : " + nama + "ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + nama + "tidak ditemukan");
        }
    }

    void tampilPosisiUsia(String usia, int pos) {
        if (pos!= -1){
            System.out.println("data dosen dengan usia : " + usia + "ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + usia + "tidak ditemukan");
        }
    }

    void tampilDataSearch(String x, int pos) {
        if (pos != -1) {
            System.out.println("kode\t : " + listDos[pos].kode);
            System.out.println("nama\t : " + listDos[pos].nama);
            System.out.println("jenis kelamin\t : " + listDos[pos].jenisKelamin);
            System.out.println("usia\t : " + x);
        }
    }
}
