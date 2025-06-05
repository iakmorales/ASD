package jobsheet_6;

public class DataDosen24 {
    Dosen24 [] listDos = new Dosen24[10];
    int idx;

    void tambah(Dosen24 d){
        if (idx < listDos.length){
            listDos[idx] = d;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil(){
        for (Dosen24 d : listDos){
            d.tampil();
            System.out.println("----------------------");
        }
    }

    void bubbleSortASC(){
        for (int i = 0; i < listDos.length-1; i++){
            for (int j = 1; j < listDos.length-i; j++){
                if (listDos[j].usia < listDos[j-1].usia){
                    Dosen24 tmp = listDos[j];
                    listDos[j] = listDos[j-1];
                    listDos[j-1] = tmp;
                }
            }
        }
    }

    void selectionSortDSC(){
        for (int i = 0; i < listDos.length-1; i++){
            int idxMax = i;
            for (int j = i+1; j < listDos.length; j++){
                if (listDos[j].usia > listDos[idxMax].usia){
                    idxMax = j;
                }
            }
            Dosen24 tmp = listDos[idxMax];
            listDos[idxMax] = listDos[i];
            listDos[i] = tmp;
        }
    }

    void insertionSortDSC(){
        for (int i = 1; i < listDos.length; i++){
            Dosen24 tmp = listDos[i];
            int j = i;
            while (j > 0 && listDos[j-1].usia < tmp.usia){
                listDos[j] = listDos[j-1];
                j--;
            }
            listDos[j] = tmp;
        }
    }
}
