public interface Metodos<T> {
    void editar(CatalogoGeral item, CatalogoGeral novoItem);

    void remover(CatalogoGeral item);

    void cadastrar(T item);
    void editar(int id, T item);
    void remover(int id);
    void listar();
}
