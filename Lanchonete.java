package queue;
import java.util.Scanner;
public class Lanchonete {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    FilaPedidos fila = new FilaPedidos();
    int op, senha = 1;

    do {
        System.out.println("1 - Novo Pedido");
        System.out.println("2 - Entregar pedido");
        System.out.println("0 - Finalizar");
        op = Integer.parseInt(sc.nextLine());

        switch(op) {
            case 1: 
                System.out.println("Informe o seu pedido: ");
                String order = sc.nextLine();
                Pedidos pedido = new Pedidos(order);
                fila.retirarSenha(pedido);
                System.out.println("Sua senha é: " + (senha++));
                break;
            case 2:
                if (fila.isEmpty()) {
                    System.out.println("Não há ningúem esperando um pedido");
                }
                else {
                    Pedidos pedidoFeito = fila.chamarSenha();
                    System.out.println("Pedido chamado: " + pedidoFeito.getPedido());
                }
                break;
            case 0:
                System.out.println("Fim");
                break;
            default: 
                System.out.println("Tente denovo");
                break;
        }
    } while (op != 0);

    sc.close();
    }
}
