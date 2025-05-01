public class StackSurat05 {
    Surat05[] stack;
    int top;
    int size;

    public StackSurat05(int size) {
        this.size = size;
        stack = new Surat05[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat05 surat) {
        if (!isFull()) {
            stack[++top] = surat;
            System.out.println("Surat berhasil dimasukkan.");
        } else {
            System.out.println("Stack surat penuh!");
        }
    }

    public Surat05 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack surat kosong!");
            return null;
        }
    }

    public Surat05 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan: " + stack[i].idSurat + ", Durasi: " + stack[i].durasi);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}
