package queue;
public class FilaPedidos {
    private Pedidos fila[];
    private int fim, inicio;

    public FilaPedidos(int tam) {
        this.fila = new Pedidos [tam];
        this.fim = -1;
    }
    public FilaPedidos() {
        fila = new Pedidos [20];
        this.fim = -1;
    }
    public boolean isFull() {
        return (this.fim == this.fila.length - 1);
    }
    public boolean isEmpty() {
        return (this.inicio > this.fim);
    }
    public void retirarSenha(Pedidos n) {
        if (!isFull()) {
            this.fim++;
            this.fila[this.fim] = n;
        }
    }
    public Pedidos chamarSenha() {
        Pedidos retorno = null;
        if (!isEmpty()) {
            retorno = this.fila[this.inicio];
            for (int i = 0; i < fim; i++) {
                this.fila[i] = this.fila[i + 1];
            }
            this.fim--;
        }
        return retorno;
    }
    public Pedidos head() {
        Pedidos retorno = null;
        if (!isEmpty()) {
            retorno = this.fila[this.inicio];
        }
        return retorno;
    }
}
