import java.util.ArrayList;
import java.util.List;

public abstract class Catalogo implements Metodos<CatalogoGeral> {
    private List<CatalogoGeral> itens;

    public Catalogo() {
        this.itens = new ArrayList<>();
    }

    @Override
    public void editar(CatalogoGeral item, CatalogoGeral novoItem) {
        System.out.println();
        if (itens.contains(item)) {
            int index = itens.indexOf(item);
            itens.set(index, novoItem);
            System.out.println("Item editado com sucesso!");
        } else {
            System.out.println("Item não encontrado.");
        }
        System.out.println();
    }
    @Override
    public void remover(CatalogoGeral item) {
        System.out.println();
        if (itens.remove(item)) {
            System.out.println("Item removido com sucesso!");
        } else {
            System.out.println("Item não encontrado.");
        }
        System.out.println();
    }
    @Override
    public void cadastrar(CatalogoGeral item) {
        System.out.println();
        itens.add(item);
        System.out.println(item.getNome() + " cadastrado com sucesso!");
        System.out.println();
    }
    @Override
    public void listar() {
        System.out.println();
        System.out.println("Discos:");
        if (itens.isEmpty()) {
            System.out.println("Nenhum item no catálogo.");
        } else {
            for (CatalogoGeral item : itens) {
                item.exibirDetalhes();
            }
        }
        System.out.println();
    }
    public List<CatalogoGeral> getItens() {
        return itens;
    }
}
