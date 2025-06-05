package jobsheet_13;

public class BinaryTree24 {
    Node24 root;

    public BinaryTree24() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa24 mahasiswa) {
        Node24 newNode = new Node24(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node24 current = root;
            Node24 parent = null;
            while(true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        Node24 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node24 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node24 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node24 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node24 getSuccessor(Node24 del) {
        Node24 successor = del.right;
        Node24 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        //cari node (current) yang akan dihapus
        Node24 parent = root;
        Node24 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        //penghapusan
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            //jika tidak ada anak (leaf), maka node dihapus
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                } 
            } else if (current.left == null) { //jika hanya punya 1 anak (kanan)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) { //jika hanya punya 1 anak (kiri)
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { //jika punya dua anak
                Node24 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if( isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor; 
                   } 
                }
                successor.left = current.left; 
            }
        }
    }
        //Menambahkan node secara rekursif
    public void addRekursif(Mahasiswa24 mahasiswa) {
        root = addRekursifRek(root, mahasiswa);
    }

    Node24 addRekursifRek(Node24 current, Mahasiswa24 mahasiswa) {
        if (current == null) {
            return new Node24(mahasiswa);
        }
        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursifRek(current.left, mahasiswa);
        } else {
            current.right = addRekursifRek(current.right, mahasiswa);
        }
        return current;
    }

        //Mencari IPK minimum
    public Mahasiswa24 cariMinIPK() {
        if (isEmpty()) return null;
        Node24 current = root;
            while (current.left != null) {
                current = current.left;
            }
        return current.mahasiswa;
    }

        //Mencari IPK maksimum
    public Mahasiswa24 cariMaxIPK() {
        if (isEmpty()) return null;
        Node24 current = root;
            while (current.right != null) {
                current = current.right;
            }
        return current.mahasiswa;
    }

    void tampilRekursifDiAtas(Node24 node, double ipkBatas) {
        if (node == null) return;
        tampilRekursifDiAtas(node.left, ipkBatas);
        if (node.mahasiswa.ipk > ipkBatas) {
            System.out.println("Nama: " + node.mahasiswa.nama + ", IPK: " + node.mahasiswa.ipk);
        }
        tampilRekursifDiAtas(node.right, ipkBatas);
    }
        // Menampilkan mahasiswa dengan IPK di atas batas tertentu
    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        tampilRekursifDiAtas(root, ipkBatas);
    }

}
