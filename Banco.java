package queue;
public class Banco {
    private int fila[];
    private int fim, inicio;

    public Banco(int tam) {
        this.fila = new int[tam];
        this.fim = -1;
    }
    public Banco() {
        fila = new int[20];
        this.fim = -1;
    }
    public boolean isFull() {
        return (this.fim == this.fila.length - 1);
    }
    public boolean isEmpty() {
        return (this.inicio > this.fim);
    }
    public void retirarSenha(int n) {
        if (!isFull()) {
            this.fim++;
            this.fila[this.fim] = n;
        }
    }
    public int chamarSenha() {
        int retorno = -1;
        if (!isEmpty()) {
            retorno = this.fila[this.inicio];
            for (int i = 0; i < fim; i++) {
                this.fila[i] = this.fila[i + 1];
            }
            this.fim--;
        }
        return retorno;
    }
    public int head() {
        int retorno = -1;
        if (!isEmpty()) {
            retorno = this.fila[this.inicio];
        }
        return retorno;
    }
}
