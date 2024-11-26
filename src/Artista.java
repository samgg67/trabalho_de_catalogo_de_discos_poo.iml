public class Artista extends CatalogoGeral {
    private String generoMusical;

    public Artista(String nome, String generoMusical) {
        super(nome);
        this.generoMusical = generoMusical;
    }
    public String getGeneroMusical() {
        return generoMusical;
    }
    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println();
        System.out.println("Detalhes do artista");
        System.out.println();
        System.out.println("Artista: " + getNome());
        System.out.println("Gênero: " + generoMusical);
        System.out.println();
    }
}
