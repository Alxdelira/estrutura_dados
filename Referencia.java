package estrutura_dados;

public class Referencia {
    public static class Elo {
        String nome;
        Elo proximo;

        public Elo(String nome) {
            this.nome = nome;
        }

    }

    public static void main(String[] args) {
        Elo primeiro = new Elo("Alexandre");
        Elo segundo = new Elo("João");
        primeiro.proximo = segundo;

        System.out.println(primeiro.nome);
        System.out.println(segundo.nome);
    }

}
