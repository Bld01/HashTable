public class Main {
    public static void main(String[] args) {
        TabelaHash tabelaHash = new TabelaHash(10);

        int[] chaves = {12, 25, 37, 41, 53, 64, 78, 89};

        for (int chave : chaves) {
            tabelaHash.insert(chave);
        }

        tabelaHash.remove(12);
        tabelaHash.showTable();

        System.out.println(tabelaHash.search(12));

    }
}