package jobsheet_12;

public class DoubleLinkedList01 {
    Node01 head;
    Node01 tail;
    int size = 0;

    public DoubleLinkedList01() {
        head = null;
        tail = null;
    }

    public int getSize() {
        return size;
    }   

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    } 
    
    public void addLast(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void insertAfter(String keyNim, Mahasiswa01 data) {
        Node01 current = head;
        
        // Cari node dengan nim = keynim
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node01 newNode = new Node01(data);

        // Jika current adalah tail, cukup tambahkan di akhir 
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            // Sisipkan di tengah
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
        size++;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("List Masih kosong.");
            return;
        }
        Node01 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
    
    public Node01 search(String nim) {
        Node01 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null; 
    } 

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }

        Mahasiswa01 removedData = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        System.out.println("Data sudah berhasil dihapus. Data yang dihapus adalah: " );
        removedData.tampil();
        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public void add(int index, Mahasiswa01 data) {
         if (index < 0) {
         System.out.println("Index tidak boleh negatif.");
         return;
        }
         if (index == 0) {
         addFirst(data);
         return;
        }

        Node01 current = head;
        int i = 0;
         while (current != null && i < index - 1) {
         current = current.next;
         i++;
        }
         if (current == null) {
         System.out.println("Index melebihi panjang list.");
         return;
        }
         if (current == tail) {
         addLast(data);
         return;
        }
         
        Node01 newNode = new Node01(data);
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
        size++;
    }

    public void remove(int index) {
         if (isEmpty()) {
         System.out.println("List kosong, tidak bisa dihapus.");
         return;
        }
         if (index < 0) {
         System.out.println("Index tidak boleh negatif.");
         return;
        }
         if (index == 0) {
         removeFirst();
         return;
        }

        Node01 current = head;
        int i = 0;

         while (current != null && i < index) {
         current = current.next;
         i++;
        }
         if (current == null) {
         System.out.println("Index melebihi panjang list.");
         return;
       }
         if (current == tail) {
         removeLast();
         return;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;

        System.out.println("Data sudah berhasil dihapus. Data yang dihapus adalah:");
        current.data.tampil();
        size--;
    }

    public void getFirst() {
         if (isEmpty()) {
         System.out.println("List kosong.");
        } else {
         System.out.println("Data pada node head:");
         head.data.tampil();
        }
    }

    public void getLast() {
         if (isEmpty()) {
         System.out.println("List kosong.");
        } else {
         System.out.println("Data pada node tail:");
         tail.data.tampil();
        }
   }

    public void getIndex(int index) {
         if (isEmpty()) {
         System.out.println("List kosong.");
         return;
        }
         if (index < 0) {
         System.out.println("Index tidak boleh negatif.");
         return;
        }
        
        Node01 current = head;
        int i = 0;
     
         while (current != null && i < index) {
         current = current.next;
         i++;
        }
         if (current == null) {
         System.out.println("Index melebihi panjang list.");
        } else {
         System.out.println("Data pada index ke-" + index + ":");
         current.data.tampil();
        }
    }

    public void removeAfter(String keyNim) {
         if (isEmpty()) {
         System.out.println("List kosong, tidak bisa dihapus.");
         return;
        }

        Node01 current = head;
    
         while (current != null && !current.data.nim.equals(keyNim)) {
        current = current.next;
        }

         if (current == null) {
         System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
         return;
         }

         if (current.next == null) {
         System.out.println("Tidak ada node setelah NIM " + keyNim + " yang bisa dihapus.");
         return;
        }

        Node01 toRemove = current.next;

         if (toRemove == tail) {
         tail = current;
         current.next = null;
        } else {
         current.next = toRemove.next;
         toRemove.next.prev = current;
        }

        System.out.println("Node setelah NIM " + keyNim + " berhasil dihapus. Data yang dihapus:");
        toRemove.data.tampil();
        size--;
    }
}
