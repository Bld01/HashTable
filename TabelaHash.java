public class TabelaHash {
    private int[] table;
    private int size = 0;

    public TabelaHash(int size) {
        this.size = size;
        table = new int[size];
        for (int i = 0; i < size; i++) {
            table[i] = -1;
        }
    }

    private int hash(int chave) {
        return chave % size;
    }

    public void insert(int chave) {
        int i = hash(chave);
        table[i] = chave;
    }

    public boolean search(int chave) {
        int i = hash(chave);
        return table[i] == chave;
    }

    public void remove(int chave) {
        int i = hash(chave);
        if (table[i] == chave) {
            table[i] = 0;
        }
    }

    public void showTable() {
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + ": " + table[i]);
        }
    }
}