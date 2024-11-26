public abstract class CatalogoGeral {

    private String nome;
    public CatalogoGeral(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public abstract void exibirDetalhes();
}
