import java.util.List;

public class Disco extends CatalogoGeral {
    private int anoLancamento;
    private List<String> faixas;
    private Artista artista;

    public Disco(String titulo, int anoLancamento, List<String> faixas, Artista artista) {
        super(titulo);
        this.anoLancamento = anoLancamento;
        this.faixas = faixas;
        this.artista = artista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public List<String> getFaixas() {
        return faixas;
    }

    public void setFaixas(List<String> faixas) {
        this.faixas = faixas;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Disco: " + getNome() + ", Ano: " + anoLancamento);
        if (artista != null) {
            System.out.println("Artista: " + artista.getNome());
        } else {
            System.out.println("Artista: Não cadastrado");
        }
        System.out.println("Faixas: " + String.join(", ", faixas));
    }
}

