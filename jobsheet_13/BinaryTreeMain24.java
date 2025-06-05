package jobsheet_13;

public class BinaryTreeMain24 {
    public static void main(String[] args) {
        BinaryTree24 bst = new BinaryTree24();

        bst.add(new Mahasiswa24("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa24("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa24("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa24("244160220", "Dewi", "B", 3.54));
        
        System.out.println("\nDaftar semua mahasiswa (in order transversal) :");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan IPK 3.54: ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.println("Cari mahasiswa dengan IPK 3.22: ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa24("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa24("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa24("244160170", "Fizi", "B", 3.46));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("\nInOrder transversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPreOrder transversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrder transversal:");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan data mahasiswa:");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nMenambahkan mahasiswa dengan rekursif:");
        bst.addRekursif(new Mahasiswa24("244160300", "Gita", "C", 3.60));
        bst.traverseInOrder(bst.root);

        System.out.println("\nMahasiswa dengan IPK terkecil:");
        Mahasiswa24 min = bst.cariMinIPK();
        System.out.println("Nama: " + min.nama + ", IPK: " + min.ipk);

        System.out.println("\nMahasiswa dengan IPK terbesar:");
        Mahasiswa24 max = bst.cariMaxIPK();
        System.out.println("Nama: " + max.nama + ", IPK: " + max.ipk);

        System.out.println("\nMahasiswa dengan IPK di atas 3.50:");
        bst.tampilMahasiswaIPKdiAtas(3.50);

    }
}
