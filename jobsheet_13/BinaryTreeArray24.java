package jobsheet_13;

import jobsheet_10.P2jobsheet10.Mahasiswa;

public class BinaryTreeArray24 {
    Mahasiswa24[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray24() {
        this.dataMahasiswa = new Mahasiswa24[10];
        idxLast = -1;
    }

    void populateData (Mahasiswa24 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traversaInOrder(int idxStart) {
        if (idxStart <= idxLast) {
           if (dataMahasiswa[idxStart] != null) {
                traversaInOrder(2 * idxStart + 1); // Kiri
                dataMahasiswa[idxStart].tampilInformasi(); 
                traversaInOrder(2 * idxStart + 2); // Kanan
            }
        }
    }

    public void add(Mahasiswa24 dataMahasiswa) {
        if (idxLast < this.dataMahasiswa.length - 1) {
            idxLast++;
            this.dataMahasiswa[idxLast] = dataMahasiswa;
        } else {
            System.out.println("Tree is full");
        }
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            System.out.println(dataMahasiswa[idxStart]);
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}
