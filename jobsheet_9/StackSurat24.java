package jobsheet_9;

public class StackSurat24 {
    Surat24[] stack;
    int top;
    int size;

    public StackSurat24(int size) {
        this.size = size;
        stack = new Surat24[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat24 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    public Surat24 pop() {
        if (!isEmpty()) {
            Surat24 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diambil.");
            return null;
        }
    }

    public Surat24 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang tersedia.");
            return null;
        }
    }

    public void print() {
        if (top == -1) {
            System.out.println("Stack kosong! Tidak ada surat yang tersedia.");
        } else {
            System.out.println("Daftar surat dalam stack:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i].toString());
            }
        }
    }

}
