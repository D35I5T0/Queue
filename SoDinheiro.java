package queue;
import java.util.Scanner;
public class SoDinheiro {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    Banco banco = new Banco(20);
    int op, senha = 0;

    do {
        System.out.println("1 - Retirar uma senha");
        System.out.println("2 - Chamar uma senha");
        System.out.println("0 - Finalizar");
        op = sc.nextInt();

        switch(op) {
            case 1: 
                if (banco.isFull()) {
                    System.out.println("O banco está cheio, volte mais tarde.");
                }
                else if (banco.isEmpty()) {
                    System.out.println("Não há fila de espera");
                    banco.retirarSenha(senha++);
                    System.out.println("Sua senha é: " + (senha));
                }
                else {
                    banco.retirarSenha(senha++);
                    System.out.println("Sua senha é: " + (senha));
                }
                break;
            case 2:
                if (banco.isEmpty()) {
                    System.out.println("Não há ningúem esperando na fila");
                }
                else {
                    int senhaVelha = banco.chamarSenha() + 1;
                    System.out.println("Senha chamada: " + senhaVelha);
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
